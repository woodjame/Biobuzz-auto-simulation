package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.RobotLog;

import org.firstinspires.ftc.robotcore.internal.system.AppUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * SimRecorder - records what YOUR robot really does in AUTO, so the BIOBUZZ Auto Simulator can replay it.
 *
 * Copy this file into your TeamCode folder (any package - change the line at the top to match).
 * In your auto:
 *     SimRecorder rec = new SimRecorder("RedAudience");          // in init: a short name for this auto, no spaces
 *     rec.start();                                                // when the match starts (start() / after waitForStart())
 *     rec.pose(x, y, headingDegrees);                             // every loop: where your localizer says the robot is
 *     rec.event("shoot");                                         // when a volley starts: launches everything held
 *     rec.shot();                                                 // ...or call this for EACH element as it leaves the robot
 *                                                                 //    (more accurate: the replay launches when your robot did)
 *     rec.event("intake_on"); rec.event("intake_off"); rec.event("spinup");
 *     rec.save();                                                 // at the end (stop() / end of runOpMode())
 *
 * Positions are in INCHES, heading in DEGREES (counter-clockwise, 0 = +x).
 *   Frame.CORNER (default) - Pedro Pathing style: 0 to 144 from the corner.
 *   Frame.CENTER           - field-centre style (Road Runner, most odometry): -72 to 72.
 * If the replay comes out turned or mirrored on the simulator's field, call rec.rotate(90), (180) or (270).
 *
 * WHERE THE LOG GOES (on the CONTROL HUB - the robot - not the Driver Hub):
 *   1. A file: Internal shared storage/FIRST/simlogs/<name>_<date>_<time>.csv
 *      Plug the Control Hub into a computer with its USB-C cable (12 V battery connected) to copy it.
 *   2. The same rows in the Robot Controller log, as lines starting "SIMLOG,". Download it from the Robot
 *      Controller Console (Manage -> Download Logs) and upload robotControllerLog.txt to the simulator.
 */
public class SimRecorder {
    public enum Frame { CORNER, CENTER }

    /** Record a pose at most this often (s). 0.05 s = 20 per second, plenty for a smooth replay. */
    public static double MIN_STEP_S = 0.05;
    /** Also copy every row into the Robot Controller log (for Manage -> Download Logs). */
    public static boolean ALSO_TO_ROBOT_LOG = true;

    private final String run;
    private final Frame frame;
    private final List<String> rows = new ArrayList<>();
    private final ElapsedTime clock = new ElapsedTime();
    private boolean started = false, saved = false;
    private double rotDeg = 0, lastT = -1;
    private double lx = Double.NaN, ly = Double.NaN, lh = 0;   // last pose, used for event rows
    private String savedPath = null;
    private final List<String> waiting = new ArrayList<>(); // events before the first pose

    public SimRecorder(String name) { this(name, Frame.CORNER); }

    public SimRecorder(String name, Frame frame) {
        String clean = name == null ? "" : name.replaceAll("[^A-Za-z0-9_-]", "");
        this.run = (clean.isEmpty() ? "auto" : clean) + "_" + new SimpleDateFormat("MMdd_HHmmss", Locale.US).format(new Date());
        this.frame = frame;
        if (frame == Frame.CENTER) emit("# coords=center");
        emit("t,x,y,heading,event");
    }

    /** Turn the recorded field this many degrees counter-clockwise about its centre (90, 180 or 270). */
    public void rotate(double degrees) { rotDeg = degrees; }

    /** Call when the match starts. (If you forget, the first pose starts the clock.) */
    public void start() {
        clock.reset();
        started = true;
    }

    /** Where the robot is now: inches and degrees, from your localizer. Call every loop. */
    public void pose(double x, double y, double headingDegrees) {
        if (!started) start();
        double t = clock.seconds();
        boolean first = Double.isNaN(lx);
        lx = x; ly = y; lh = headingDegrees;
        if (first) { for (String ev : waiting) row(t, x, y, headingDegrees, ev); waiting.clear(); }
        if (lastT >= 0 && t - lastT < MIN_STEP_S) return;
        lastT = t;
        row(t, x, y, headingDegrees, "");
    }

    /** One element launched, right now. Call once per POLLEN/NECTAR as it leaves the robot (e.g. when your
     *  feeder/kicker fires or your ball sensor goes clear). The replay launches one at exactly these times,
     *  so it shows whether your shots land before the hive swings too far while it tips. */
    public void shot() { event("shoot_1"); }

    /** Something the robot did: "shoot" (everything held), "shoot_1" (one element), "intake_on", "intake_off" or "spinup". */
    public void event(String what) {
        if (!started) start();
        String ev = what == null ? "" : what.trim().toLowerCase(Locale.US).replace(' ', '_');
        if (Double.isNaN(lx)) { waiting.add(ev); return; }   // no pose yet: recorded with the first pose
        row(clock.seconds(), lx, ly, lh, ev);
    }

    private void row(double t, double x, double y, double h, String ev) {
        double cx = frame == Frame.CORNER ? x - 72 : x, cy = frame == Frame.CORNER ? y - 72 : y;
        double a = Math.toRadians(rotDeg), c = Math.cos(a), s = Math.sin(a);
        double rx = cx * c - cy * s, ry = cx * s + cy * c;
        if (frame == Frame.CORNER) { rx += 72; ry += 72; }
        emit(String.format(Locale.US, "%.3f,%.2f,%.2f,%.1f,%s", t, rx, ry, h + rotDeg, ev));
    }

    private void emit(String line) {
        rows.add(line);
        if (ALSO_TO_ROBOT_LOG) RobotLog.ii("SimRecorder", "SIMLOG," + run + "," + line);
    }

    /** Write the file. Call once at the end. Returns where it went (also shown by savedTo()). */
    public String save() {
        if (saved) return savedPath;
        saved = true;
        File dir = new File(AppUtil.FIRST_FOLDER, "simlogs");
        //noinspection ResultOfMethodCallIgnored
        dir.mkdirs();
        File f = new File(dir, run + ".csv");
        try (FileWriter w = new FileWriter(f)) {
            for (String r : rows) { w.write(r); w.write('\n'); }
        } catch (IOException e) {
            RobotLog.ee("SimRecorder", "could not write " + f + ": " + e.getMessage());
            return null;
        }
        savedPath = f.getAbsolutePath();
        try {                                               // make the new file show up over USB right away
            android.media.MediaScannerConnection.scanFile(AppUtil.getDefContext(), new String[]{savedPath}, null, null);
        } catch (Throwable ignored) { /* it will show up after the Control Hub restarts */ }
        RobotLog.ii("SimRecorder", "saved " + (rows.size() - 1) + " rows to " + savedPath);
        return savedPath;
    }

    /** "FIRST/simlogs/RedAudience_1025_143012.csv" after save(), for telemetry. */
    public String savedTo() { return savedPath == null ? "(not saved yet)" : "FIRST/simlogs/" + new File(savedPath).getName(); }

    /** How many rows have been recorded so far (header not counted). */
    public int rows() { return Math.max(0, rows.size() - (frame == Frame.CENTER ? 2 : 1)); }
}
