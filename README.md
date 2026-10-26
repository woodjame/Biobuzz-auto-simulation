# BIOBUZZ Auto Simulator – for FTC Teams

Test your 2026–27 **BIOBUZZ** autonomous before you get to the field. Upload your real robot code and watch it run a full 30-second AUTO: paths, launches, hive tips, flower and garden pickups, servos, parking, the score, and anything that could draw a penalty.

### ▶ AUTO simulator: **https://woodjame.github.io/Biobuzz-auto-simulation/**
### ▶ TeleOp simulator: **https://woodjame.github.io/Biobuzz-auto-simulation/teleop.html**
### ▶ Full match simulator: **https://woodjame.github.io/Biobuzz-auto-simulation/match.html**

The three pages link to each other at the top. **AUTO** runs your autonomous by itself. **TeleOp** is 2:00 of driver control, starting from a typical end-of-AUTO field. **Full match** runs everyone's AUTO code, the transition, then TeleOp. The TeleOp and full match pages share their robot cards, controllers and settings in your browser.

It runs in Chrome, Edge, Firefox or Safari on a laptop or Chromebook. Nothing to install and no account needed. The 3-D view needs an internet connection.

> **Your code stays private.** The simulator runs entirely in your browser. Your code is never uploaded to a server, never saved, and cleared when you close or reload the page. Other teams using the simulator can't see it.

> **Usage counting.** To see how many teams use the simulator, these pages count visits (with the country and region they come from, using GoatCounter, without cookies) and the team numbers typed onto robot cards, code uploads and match runs. Your code, names and anything personal are never sent.

> **Top AUTO scores.** The AUTO page has a leaderboard. When you play an AUTO through to 0:00, your alliance's AUTO score is posted if every robot on it runs its team's own uploaded code with a team number, the game settings are the standard ones, no robot on it crosses onto the other alliance's side (G402, a MAJOR FOUL; warnings like bumping the hive frame don't count), and the robot cards are realistic. The page tells you after each run whether the score counted, and why not if it didn't; "How a score gets on the board" on the card lists the limits. Only team numbers, the score and a fingerprint of your code are sent – never the code itself.

---

## Step-by-step

### Step 1 – Choose your robot card

The **Robots** panel on the left has four cards. They start empty. Pick the one that matches where your robot starts:

| Card | Your robot starts… |
|---|---|
| **Red audience** | Red alliance, on the audience side |
| **Red rear** | Red alliance, on the rear (far) side |
| **Blue audience** | Blue alliance, on the audience side |
| **Blue rear** | Blue alliance, on the rear (far) side |

The card decides your alliance. If your code mirrors for blue using `red()`, `isRed()` or `RED`, the simulator answers that from the card, so a blue card gets your blue poses automatically.

### Step 2 – Enter your team and robot

On your card:

1. Type your **team number** and **team name**.
2. Fill in how your robot is built. Time these on your real robot with a phone stopwatch – the simulator is only as accurate as these numbers.

| Setting | What to enter |
|---|---|
| **Handles** | *POLLEN only* if your intake rejects NECTAR, otherwise *POLLEN and NECTAR*. |
| **Launches** | *No – leave and park* if your robot can't score yet. |
| **Seconds to pull 4 POLLEN from a flower** | Time it on your robot. |
| **Seconds to intake the 4 garden POLLEN** | Time it on your robot. |
| **Seconds to launch all 4 into the hive** | From the first launch to the last. |
| **Seconds for the flywheel to reach speed** | Time it from a stopped flywheel to launching speed. Launches wait this long after your code first spins the flywheel up. |
| **Shooter** | *Turret*, *Fixed – intake side* or *Fixed – opposite intake*. For a turret, also set **Turret rotation, total degrees**. |
| **Robot weight (lb)** | Heavier robots speed up more slowly. |
| **Localization** | *Odometry pods + Pinpoint* (then enter both pod offsets) or *Drive encoders + Hub IMU*. |
| **Drive motor RPM** and **goBILDA mecanum wheel** | From your drivetrain. |
| **Flywheel RPM (max)**, **Launch angle** and **Flywheel adjusts its speed for distance** | From your launcher. |
| **Intake camera** | Tick it if your robot has a camera that finds game elements. |
| **4 POLLEN** | Where your 4 preloads start: all in the robot, or some on the tiles at your intake. |

These numbers (not your code) are remembered in your browser, so you only enter them once per computer.

### Step 3 – Upload your code

1. Click **Upload** on your card (or drag the files onto the card).
2. Choose your auto's `.java` file.
3. **If your auto uses other files, select them all at the same time** (Ctrl-click on Windows/Chromebook, ⌘-click on Mac):

| Your project has… | Select together |
|---|---|
| A base class plus Red and Blue OpModes | The base class **and** one OpMode, e.g. `GardenSideAuto.java` + `RedGardenSideAuto.java` |
| Distances or powers in a settings file | The auto **and** `Tunables.java` / `Constants.java` / `RobotSettings.java` |
| Shared routes (helper library cookbook) | The auto **and** `Routes.java` (and `Tunables.java`) |
| Pedro paths in one file, the routine in another | Both files |
| Servos created in a hardware class | The auto **and** that hardware class (so the servos show up) |

The simulator reads these code styles directly:

| Written with… | Recognized by… |
|---|---|
| Pedro Pathing 3 | `PoseFactory`, `line(...)`, `curve(...)`, `sequential(follow(follower, …))` |
| Pedro Pathing 2 | `new Pose(...)`, `BezierLine`, `pathBuilder()`, `switch (pathState)` |
| Road Runner 1.0 | `drive.actionBuilder(...)` |
| FTC SDK sample-style autos | `encoderDrive(...)`, `driveStraight(...)`, `turnToHeading(...)`, timed `setPower(...)` |
| Crossbotics FTC helper library (goBILDA / REV / AndyMark / Studica starter bots) | `extends Auto<Robot>`, `s.start(...)`, `.move(...)`, `.action(...)`, `.parkWithSeconds(...)` |

### Step 4 – Check what the simulator understood

1. **Read the line under your card.** It says what was found, for example
   *"Pedro Pathing: 6 paths, 3 launches, 2 servos – done at 27.8 s"*.
   - Green = read fine. Orange = there are notes to read.
   - *"No route found"* means the drives are inside your own classes – see **If your code isn't fully understood** below.
2. **Click Open code.** The bottom of that window lists **What the simulator will run**, step by step. Click a step to highlight the line of your code it came from. Any notes are listed there too.

### Step 5 – Set up your servos

Every servo in your code is listed on your card under **Servos**. For each one:

1. **Servo power** (top of the section): *Hub servo ports – 5 V*, or *Servo power module – 6 V* if you use a REV Servo Power Module or goBILDA servo power injector.
2. **Servo model:** Axon MINI, Axon MAX, goBILDA Torque, goBILDA Speed or goBILDA Super Speed. *"choose your servo"* in orange means you haven't picked one yet.
3. **Mode:** the mode you **programmed the servo to** with its programmer – *standard (set positions)* or *continuous rotation*. Set what the servo really is, even if your code disagrees; that's how the simulator catches mistakes.
4. **Job:**

| Job | What it does in the match |
|---|---|
| Flower bar | Your robot can only pull POLLEN from a flower once the bar is all the way down. |
| Intake roller | Runs your intake. Spinning slower picks up slower; reverse spits out. |
| Kicker | Each **complete** push launches one element. |
| Gate | Launches while the gate is open. |
| Other | Timing only. |

The simulator finds servos created with `hardwareMap.get(Servo.class, "name")`, `hardwareMap.get(CRServo.class, "name")`, `ServoImplEx`, `hardwareMap.servo.get(...)` or `hardwareMap.crservo.get(...)`. It also reads `setPwmRange(...)`, `scaleRange(...)`, `setDirection(...REVERSE)`, and the position you set in `init()`, `start()` or before `waitForStart()`.

### Step 6 – Run the match

1. Press **Play (▶)** or the **Space bar**. The match goes full screen, with the clock and both scores in the top-left corner.
2. Move the mouse to bring back the play bar. Press **Esc** to leave full screen.
3. Use the speed buttons: **4×** to check a whole match quickly, **¼×** to study one moment. Drag the timeline to jump anywhere.
4. Switch between **Top view**, **Broadcast view** and **3-D view**. In 3-D, use the camera buttons or **Ride along** to follow your robot.

### Step 7 – Read the results

Scroll to **Match events** after every run:

| Filter | Look for |
|---|---|
| **Rules** | Collisions, crossing the center line (G402), hitting the hive frame or a flower, running into opponent NECTAR (G408). |
| **Servos** | How long each servo move takes, servos told to move again before they arrived, a flower bar that wasn't down yet, mode mismatches. |
| **Scoring** | Every element into the hive, tips, LEAVE and PARK. |
| **All** | Everything, with times. Click any event to jump the replay to that moment. |

Also watch the right side of the screen: **Hives** (what's in each cell and which is up), **Limelight view** (what your camera sees), **Servos** (a live dial for each servo on the robot you pick) and **Auto score** (including ranking point progress).

### Step 8 – Fix and re-run

Change your code in your own project, click **Upload** again, check the line under the card, and press Play at 4×. Change one thing at a time.

**Test your luck:** misses are random. Open **Game & robot settings**, change **Random seed**, and re-run a few times. A plan that only works on one seed isn't reliable.

---

## Full match simulator – your AUTO, then TeleOp with PS5 controllers

Open the **Full match simulator** link above for AUTO + TeleOp, or the **TeleOp simulator** for TeleOp alone – everything below works the same on both, except that the TeleOp page has no AUTO and its start button is **Start 2:00 TeleOp**. Up to four teams play a whole match together on one computer – one robot card per team, and up to **8 controllers** (a driver and an operator for each team):

A **2:30 match**, timed like the real field (manual Table 9-1):

- **2:30 → 2:00 AUTO:** each robot runs its uploaded code.
- **0:08 → 0:01 transition:** "Drivers, pick up your controllers… 3, 2, 1". No powered movement (G403); TeleOp code INITs now.
- **2:00 → 0:00 TeleOp:** drivers take over. At **1:00** FLOWER ownership unlocks and human players may enter all their NECTAR; **0:20** is the final 20 seconds.
- **Results.**

The cues are spoken aloud when the browser can; the **Sound** button turns that off.

### Set up each robot card

1. **Connect the controllers.** Plug each PS5 controller in with a USB-C cable, or pair it with Bluetooth, then **press any button on it** – browsers only see a controller after a button is pressed. The **Controllers** panel lists them as *Controller 1* to *Controller 8*, in the order they connect, and each keeps its number while it stays connected.
   - **Up to 4 controllers:** Chrome, Edge or Firefox.
   - **5 to 8 controllers: use Firefox.** Chrome and Edge only ever see 4 controllers – that's a limit built into those browsers, not the simulator.
   - **Plugging in 8:** use a powered USB hub, or a mix of USB and Bluetooth. A computer's Bluetooth usually handles only about 7 devices at once, and fewer smoothly.
   - **Check every controller** before the match: press a button and watch its row light up in the **Controllers** panel, then make sure it's on the right robot card. If a row says "non-standard layout", plug that controller in with USB.
2. **Turn on the card** for each robot in the match (the slot where it starts).
3. **Upload code** – select your **AUTO and TeleOp files together**, with every helper file they use (like `Shooter.java`, `Intake.java`, Pedro's `Constants.java`), or drag them onto the card. Files with `@Autonomous` run in AUTO, files with `@TeleOp` run in TeleOp, and helper files go to both. The card shows what was read, like *Pedro Pathing: 10 paths, 3 launches*. No AUTO code? The robot sits still in AUTO. No TeleOp code? You drive with the button menus (step 5). Like the AUTO page, **your code is never saved or sent anywhere** – it's gone when the page closes.
4. **Choose its Driver controller (gamepad1)**, and an **Operator controller (gamepad2)** if your team uses one. No controller? Choose **Keyboard** (W A S D drive, J / L turn, Q intake, Space launch).
5. **No TeleOp code uploaded?** Set your buttons under **Driver buttons** and **Operator buttons** – one menu for each PS5 button (✕ ○ □ △, L1 R1 L2 R2, D-pad, L3 R3, Create, Options, touchpad) and one for which stick drives. Match them to your TeleOp code; hover over a button to see its FTC name, like `gamepad1.right_trigger`.
6. **Check Robot build and timing.** It starts from your AUTO card in the same browser: what it handles, preloads, intake and flower times, flywheel spin-up, launch time, flywheel RPM and angle, shooter and turret, drive motors, wheels and weight. If your robot needs its flower bar down to pull POLLEN from a flower, set that here too.

### Play

- **Start full match** runs everyone's AUTO, then the transition, then TeleOp. **Skip ▸▸** jumps ahead to the next period. **TeleOp only (2:00)** (and the TeleOp page's **Start 2:00 TeleOp**) skips AUTO and starts as if AUTO went well for both alliances:
  - **Score:** each alliance has already tipped its hive once (+20), and every robot in the match earned LEAVE (+3) and AUTO PARK (+5). With two robots that's 36 AUTO points per alliance, enough for the SWARM ranking point.
  - **Robots** start parked in their loading zone, holding nothing.
  - **Hives:** each alliance's garden-side cell is the one that tipped, so the other cell is up and empty. The tipped cell's 4 POLLEN and 3 NECTAR are spread randomly over the garden-side half of the field.
  - **NECTAR (G426):** that tip lets each human player enter 1 NECTAR, so 1 is dropped into each loading zone at the start. It bounces off the parked robots and rolls a little, ending up just in front of the zone. The other 4 stay in the alliance area and are entered one at a time once 1:00 is left, along with 1 more for every hive tip in TeleOp.
  - Gardens and flowers start as staged. **Stop** ends the match early.
- Before a match the field is in **practice** mode: drive around with the game elements, no clock.
- **View from** turns the field so your drivers' wall is at the bottom. **Full screen** keeps the clock and both scores in the corner.
- The **Score** panel shows what each alliance would score if the match ended now. At the end, a **results** window shows every scoring line and the ranking points.

### Your TeleOp code

When you upload a TeleOp, the simulator **runs your real code** – your `runOpMode()` or `loop()`, your helper classes, your toggles and state machines – about 50 times a second, like a Control Hub. Your controllers feed `gamepad1` and `gamepad2`, and your motors and servos move the simulated robot. If your code has a bug, you see it here first.

- **When it runs:** in practice mode it starts right away (**Restart my code** runs INIT and START again). In a match it INITs during the 8 s transition and STARTs when TeleOp begins, then stops at 0:00 – like pressing INIT, ▶ and ■ on the Driver Hub. If your `init()` moves a servo, the event log warns you: that's powered movement during the transition (G403).
- **Driver Hub panel** (under *Robot status*): your `telemetry` lines, live. If your code throws an exception, it stops just like on the robot, and the panel shows the error with the file and line number.
- **Your robot's hardware:** every device your code asks `hardwareMap` for is listed on the card with its **job** – Drive FL/FR/BL/BR, Intake, Channel, Feeder, Flywheel, Turret, Flower bar, Kicker, Gate, Hood. Jobs are guessed from the names; change any that are wrong.
  - **Launching:** a **Feeder** launches while it runs forward; a **Kicker** servo launches one element each time it moves; a **Gate** servo launches while it's open and the channel or intake runs. With none of those, the **Channel** feeds the flywheel.
  - **Flywheel:** it spins at the speed your code commands (`setVelocity` or `setPower`), up to your card's max RPM, taking your card's spin-up time. Shots use that real speed: if it's too slow or too fast for the distance, the event log says the shot fell short or sailed over, and what RPM it needed.
- **How your code's numbers become motion** (on the card): wheel directions (if the robot drives the wrong way, try flipping a side – then fix the `setDirection` calls on the real robot too), which way the intake turns, the flywheel motor's ticks per revolution, the turret servo's straight-ahead position and how far it turns, and whether your localizer knows where the robot is at the start of TeleOp.
- **What's simulated:** `LinearOpMode` and `OpMode`; motors (power, velocity, encoders, RUN_TO_POSITION), servos and CR servos; the IMU, goBILDA Pinpoint and SparkFun OTOS (they count from where your code resets them, like the real ones); the Limelight 3A (AprilTags on the hive cells, with `tx`, `ty` and botpose); distance and colour sensors (they see an element when the robot holds one); `ElapsedTime`, `sleep()`, gamepad edge detection (`aWasPressed()` and copies of `Gamepad`), `telemetry`. Drive libraries: Pedro Pathing's `follower.setTeleOpDrive()` and `getPose()`; Road Runner's `MecanumDrive.setDrivePowers()` and pose; FTCLib's `MecanumDrive`, `Motor`, `GamepadEx` and `PIDFController`.
- **Not simulated:** camera vision processors (VisionPortal), code in other threads, FTCLib's command scheduler, following Pedro or Road Runner paths during TeleOp, and Kotlin. The card's **Notes on your code** lists every call the simulator skipped.
- **"In TeleOp: Use the button menus instead"** switches back to the menus if you'd rather not run your code.

### Defense

Robots push each other. A heavier robot pushes harder (lower drive RPM helps a little), and a robot that isn't driving still resists. Pushing an opponent while it launches throws off its shots. By default, while an opponent is touching it, a launching robot makes:

- **25%** of its shots when the two robots are a similar weight (within 15%);
- **75%** when it is much heavier than the defender (40% or more);
- **10%** when it is much lighter.

In between, the percentage slides between those numbers. Change any of these under **Defense rules** in the right column. Robots touching an opponent get an orange outline.

**Pins (G421):** pushing an opponent into a wall, the hive frame, a flower or another robot so it can't move is a PIN. A count appears over the pinned robot, and after 3 s it's a **MAJOR FOUL**, plus another every 3 s it goes on. A count ends once the robots have been 2 ft apart, or either has moved 2 ft, for 3 s. Very hard hits are noted in the event log (repeated high-speed ramming that causes damage is a foul, G419).

### What each button menu job does (without TeleOp code)

| Job | In the simulator |
|---|---|
| Intake on/off, Intake (hold) | Picks up POLLEN (and your own NECTAR, if your robot handles it) from the floor at your card's intake speed. Driven into the front of a flower, it pulls POLLEN out of the bottom. Never more than 4 (G407); opponent NECTAR is pushed away, not picked up (G408). |
| Intake reverse (hold) | Spits out what the robot holds, one at a time. |
| Flywheel on/off | Spins up for your card's spin-up time. |
| Launch volley | Starts the flywheel if it's off, waits until it's at speed, then launches **everything** the robot holds over your card's launch time – it can't be stopped once started. Each shot goes toward the up cell it's aimed at; it scores only if the robot is in the launch area in front of that cell, far enough away, with enough flywheel RPM for the distance, and is aimed within a few degrees. Shots while driving miss more. |
| Place POLLEN / Place NECTAR in flower | Face a flower, close up, and drop one into its top. You can also launch into a flower's top by aiming the shooter at it. |
| Turret presets / Turret left or right (hold) | Turns the turret at your card's swing speed. Or set **Turret aiming** to auto-aim at your up cell. |
| Flower bar down/up | Moves the bar in your card's time. |
| Field-centric on/off, Reset heading | Field-centric: stick forward drives away from your drivers' wall. **Reset heading** makes "forward" the way the robot faces now, like resetting the IMU. |
| Slow mode | Drives at the **Slow mode speed** on your card. |

The **Live controller** panel lights up each button and stick as you press them, next to what that button does. Button choices are remembered in this browser; code is not.

### The rules the simulator follows (BIOBUZZ manual)

- **Hives** tip at the same counts as the AUTO page (game settings there). Each tip in TeleOp scores **20**. What's left in your up cell at the end scores **2** each.
- **Human players** enter **1 NECTAR** into their loading zone for each tip of their own hive, and **all the rest** once 1:00 is left (G426) – automatically.
- **Flowers:** POLLEN or NECTAR go in the top; only POLLEN comes out the bottom (G418). Elements in the scoring part of a flower score **2** each for the alliance whose NECTAR is on top; the alliance with the **bottom** NECTAR gets **5**. NECTAR in a flower before 1:00 is left is a **major foul** (G410, 20 points to the other alliance).
- **Gardens:** each element in your garden at the end scores **1**. **PARK:** **5** for each robot in its loading zone at the end.
- **AUTO** points (tips, LEAVE, PARK) carry over from your uploaded code's AUTO.
- **AUTO shooting zones** stay on each alliance's own side of the field: the zone in front of the up cell stops where the robot would cross the center line, so the red and blue zones never overlap. Contacting an opposing robot on its side in AUTO is a major foul (G402).
- No powered movement in the transition or after 0:00 (G403, G404). Scoring is counted once everything comes to rest.
- **Ranking points:** SWARM (LEAVE + PARK ≥ 16), POLLINATOR 1 and 2 (4 and 7 tips), WIN 3 / TIE 1.

The simulator is a practice tool: launch accuracy, intake speeds and robot contact are estimates, and referees make the real calls.

---

## Running with your alliance partner

This is where the simulator helps most – making sure two autos don't get in each other's way.

1. Ask your partner for their auto files (they stay private – the simulator only runs on your computer).
2. Upload yours to one card and theirs to the matching card **on the same alliance**: one *audience* card and one *rear* card.
3. Fill in **both** robot cards – their timing matters as much as yours.
4. Turn off the other alliance's cards with the switch at the top of each card if you only want your alliance.
5. Press Play and check **Match events → Rules**.

**Partner has no code yet?** Click **Open code** on their card and type a simple stand-in (field-center inches, heading in degrees), then click **Run this code**:

```
start -11.5 63.25 -90
wait 2
forward 24
```

| You see | It usually means | Try |
|---|---|---|
| *"… collides with …"* | Both robots want the same space at the same time | Have one robot wait, or take a different lane around the hive. |
| One robot waits a long time to launch | Its cell isn't up yet | Change who launches first, or launch into the other cell. |
| Both head for the same parking spot | Your park routes overlap | Agree who takes the upper and who takes the lower spot. |
| *"crosses onto the other alliance's side (G402)"* | A path or turn swings over the center line | Move that waypoint or turn farther from the line. |

---

## If your code isn't fully understood

Try these in order – each takes a little more effort than the last.

**1. Read the notes** (under the card and in **Open code**). They usually say exactly what to do, like *"select Tunables.java together with your auto."*

**2. Add a `// @sim` comment** anywhere in your code. Your robot ignores comments.

| Comment | Use it when |
|---|---|
| `// @sim start -11.5 -63.25 90` | The simulator can't tell where your robot starts (field-center inches, heading in degrees). |
| `// @sim shoot` | Your launch call has a name it doesn't recognize. |
| `// @sim intake on` / `// @sim intake off` | Same, for the intake. |
| `// @sim wait 1.5` | Something takes time but isn't a drive. |
| `// @sim vision-shoot` | Your robot launches automatically whenever the Limelight sees an up cell. |
| `// @sim fullspeed 55` / `// @sim track 14` | Timed or encoder SDK autos: top speed (in./s) and wheel spacing (in.). |

**3. Use Translate** for code built on your own classes or a command framework (e.g. `robot.driveToGoal()`):

1. Click **Translate** on your card.
2. Answer only what's listed – type `x y heading` for a drive, or pick what an action does.
3. Choose whether your points are **Corner 0–144 (Pedro)** or **Field center** inches.
4. Tick **Use my answers**, then check **What the simulator will run**.

**4. Record a log on your real robot** (most accurate). The simulator replays exactly where your robot went – see **[Record your real robot](#record-your-real-robot-most-accurate)** below.

---

## Record your real robot (most accurate)

Instead of reading your code, the simulator can replay a run your robot **actually drove**. Use this when your code is built in a way the simulator can't read, when your robot makes decisions with sensors while it runs, or when you want to see exactly what happened on your practice field.

You need:
- **`SimRecorder.java`** from this repository (one small file – it's yours to use and change),
- a robot that knows where it is: **Pedro Pathing, Road Runner, goBILDA Pinpoint, SparkFun OTOS** or your own odometry,
- a laptop, and your Control Hub's USB-C cable (or the robot's Wi-Fi).

### Step 1 – Add SimRecorder.java to your code

- **Android Studio:** download [`SimRecorder.java`](SimRecorder.java) and put it in `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/`. If you put it in a different folder, change the first line (`package …`) to match.
- **OnBot Java:** connect your laptop to the robot's Wi-Fi, open the Robot Controller Console at **http://192.168.43.1:8080**, choose **OnBot Java**, and upload `SimRecorder.java` (or create a file with that name and paste it in). Click **Build Everything**.

### Step 2 – Add five lines to your auto

Every recorder needs the same five things: **create** it, **start** it when the match starts, give it your robot's **pose** every loop, mark **events**, and **save** at the end.

Positions are in **inches**, heading in **degrees** (counter-clockwise). Pick the frame that matches your localizer:
- `SimRecorder.Frame.CORNER` – 0 to 144 from a corner (Pedro Pathing's usual coordinates). This is the default.
- `SimRecorder.Frame.CENTER` – −72 to 72 from the field centre (Road Runner and most odometry).

**Pedro Pathing** (iterative `OpMode`):
```java
private SimRecorder rec;

@Override public void init() {
    // ... your init ...
    rec = new SimRecorder("RedAudience");                  // a short name for this auto, no spaces
}
@Override public void start() {
    rec.start();
    // ... your start ...
}
@Override public void loop() {
    follower.update();
    Pose p = follower.getPose();
    rec.pose(p.getX(), p.getY(), Math.toDegrees(p.getHeading()));
    // ... your state machine ...
}
@Override public void stop() {
    rec.save();
}
```

**Road Runner 1.0** (`LinearOpMode` with `Actions.runBlocking`) – record in parallel with your auto using a `RaceAction`, which ends when your auto ends:
```java
SimRecorder rec = new SimRecorder("BlueRear", SimRecorder.Frame.CENTER);
waitForStart();
rec.start();
Action record = new Action() {
    @Override public boolean run(@NonNull TelemetryPacket packet) {
        Pose2d p = drive.localizer.getPose();              // older quickstarts: drive.pose
        rec.pose(p.position.x, p.position.y, Math.toDegrees(p.heading.toDouble()));
        return true;                                        // keep recording
    }
};
Actions.runBlocking(new RaceAction(yourAutoAction, record));
rec.save();
```
To mark events in a Road Runner sequence, add `.stopAndAdd(new InstantAction(() -> rec.event("shoot")))` (or put `rec.event(...)` inside your own launch action).

**goBILDA Pinpoint** (the same idea works for SparkFun OTOS or your own odometry – use its position in inches and degrees) (`LinearOpMode` with your own loop). Set the localizer to your real starting spot first, so its numbers are field positions:
```java
SimRecorder rec = new SimRecorder("RedRear", SimRecorder.Frame.CENTER);
odo.setPosition(new Pose2D(DistanceUnit.INCH, -11.5, 63.25, AngleUnit.DEGREES, -90));   // your start
waitForStart();
rec.start();
boolean autoDone = false;                                  // set true when your auto is finished
while (opModeIsActive() && !autoDone) {
    odo.update();
    Pose2D p = odo.getPosition();
    rec.pose(p.getX(DistanceUnit.INCH), p.getY(DistanceUnit.INCH), p.getHeading(AngleUnit.DEGREES));
    // ... your auto ...
}
rec.save();
```
If your auto uses `sleep(...)`, the recorder sees nothing during it. Replace each `sleep` with a short loop that keeps calling `rec.pose(...)` until the time is up.

**Events** – add one line wherever your code does these:

| Your robot… | Add |
|---|---|
| Starts a launch (everything it holds) | `rec.event("shoot");` |
| Turns the intake on / off | `rec.event("intake_on");` / `rec.event("intake_off");` |
| Starts spinning the flywheel | `rec.event("spinup");` |

**Optional:** show where the file went on the Driver Hub with `telemetry.addData("Sim log", rec.savedTo());`.

### Step 3 – Run your auto

Set the robot at its real starting spot and run the auto from the **Driver Hub** as usual (**INIT**, then **▶**). Let it finish, or press **■ Stop** – the log is saved when the auto ends. Run it on a field laid out like the real one; the replay shows what your robot really did there.

### Step 4 – Get the log off your robot

The log is saved on the **Control Hub** (the robot), not on the Driver Hub. There are two ways to get it.

**A. USB-C cable – gets the `.csv` file**

1. Keep the battery connected and the Control Hub on.
2. Plug the Control Hub's **USB-C** port into your laptop.
3. Open the Control Hub like a phone:
   - **Windows:** File Explorer → **This PC** → **Control Hub v1.0** → **Internal shared storage**.
   - **Mac:** install the free **Android File Transfer** app (Macs can't open Android devices without it), then open **Control Hub v1.0** → **Internal shared storage**.
4. Open **FIRST** → **simlogs** and copy the newest file, e.g. `RedAudience_1025_143012.csv` (name, month-day, time).

If the file isn't there yet, restart the Control Hub and plug it in again.

**B. No cable – gets the Robot Controller log**

The recorder also copies every row into the robot's own log.
1. Connect your laptop to your robot's Wi-Fi network.
2. Open **http://192.168.43.1:8080** (the Robot Controller Console).
3. Click **Manage**, then **Download Logs**. You get `robotControllerLog.txt` in your Downloads folder.

Upload that whole file – the simulator finds the recorded rows inside it and replays the **most recent** run. Download it soon after your run; the robot log only keeps recent activity.

**Advanced:** with Android's `adb` tool, `adb pull /sdcard/FIRST/simlogs` copies every log at once.

### Step 5 – Replay it in the simulator

1. On your robot card, click **Upload** and choose the `.csv` (or `robotControllerLog.txt`).
2. The line under the card should read *"Robot log replay: … poses"*.
3. Press **Play**. Your robot starts where it really started and drives exactly where it really drove.

**If the replay is turned or mirrored** compared with the real field, your localizer's directions differ from the simulator's. The simulator uses: field centre (0, 0), **+x toward the blue alliance wall**, **+y toward the rear wall** (away from the audience), heading 0° along +x, counter-clockwise positive. Add `rec.rotate(90);` (or `180`, `270`) right after creating the recorder, record again, and check the start spot matches.

**What a replay shows – and what it doesn't**
- **Exact:** where your robot drove, and when it launched and ran its intake.
- **Still simulated:** whether each launch scores, the hive, and other robots.
- **Not in a log:** servo moves. Upload your code to check servos.
- **Doesn't react:** the robot follows the recorded path even if another robot gets in the way.

---

## Keyboard

| Key | Does |
|---|---|
| **Space** | Play / pause |
| **← / →** | Step back / forward (hold **Shift** for 1 second) |
| **Home / End** | Jump to the start / finish |
| **F11** | Full screen match |
| **Esc** | Leave full screen |

---

## Troubleshooting

| Problem | Fix |
|---|---|
| The robot log file isn't on the Control Hub | Check that `rec.save()` runs (in `stop()` or after your main loop). Restart the Control Hub before plugging it in, or use **Manage → Download Logs** instead. |
| Card says *No route found* | Upload the other files your auto uses, add `// @sim start`, or use **Translate**. |
| Robot starts in the wrong place | Check you're on the right card (alliance and side). Add `// @sim start x y heading` if needed. |
| Robot drives a mirror image | Check the card's alliance and whether your code mirrors for blue. In **Open code**, switch the coordinates between *Field center* and *Corner 0–144 (Pedro)*. |
| Distances are a little off | Upload your `Tunables.java` / constants file with the auto, and check your robot card numbers. |
| A launch or intake doesn't happen | Add `// @sim shoot` or `// @sim intake on` there, or use **Translate**. If a servo launches or runs the intake, set its **Job** on the card. |
| A servo isn't listed | Upload the file where it's created with `hardwareMap.get(...)` along with your auto. |
| A servo spins when it should hold (or the reverse) | Check its **Mode** on the card matches how you programmed the servo, and that your code uses `setPosition` for standard servos and `setPower` for continuous ones. |
| Robot sits at a flower and pulls nothing | Holding 4 already (the G407 limit), the flower bar isn't down yet, or the intake is off. Check **Match events → Servos**. |
| 3-D view is blank | It needs internet. School networks sometimes block it; Top view works offline. |
| Start fresh | **Open code → Clear** on a card, or **Restore defaults** in **Game & robot settings**. |

---

## What the results mean – and what they don't

- **Modeled:** paths and timing, the hive and tipping, flower and garden pickups, servo travel and spin speeds, launch zones, collisions, the main AUTO rules (including the 4-element limit, G407), and scoring.
- **Approximate:** launch accuracy (random misses), drivetrain speed (from your card's numbers), servo speed under load (85% of the maker's rating – change **Servo speed under load** in settings if you've timed yours), and timed SDK moves.
- **Read, not run:** the simulator reads your code instead of running it. When your robot makes a decision while running (like a sensor choosing a branch), it follows the first branch written – the notes tell you where. A robot log avoids this.
- **Rules:** the simulator flags likely problems, but the referees and the current BIOBUZZ Competition Manual have the final word.

**Your code is never saved.** Keep your files in your own project and re-upload them each session. Only your robot card numbers, team name, servo choices and settings are remembered, in your browser only. On a shared computer, use **Restore defaults** when you're done.

For more detail on any feature, see **[TEAM_GUIDE.md](TEAM_GUIDE.md)**.

---

*BIOBUZZ Auto Simulator by Largo Robotics – Largo High School, Largo, FL. Questions or ideas: largoroboticsteam@gmail.com*
