# BIOBUZZ Auto Simulator – Guide for FTC Teams

Test your autonomous before you get to the field. Load your real robot code, add your alliance partner's code, and watch both run through a full 30-second BIOBUZZ AUTO. The simulator shows your paths, launches, hive tips, flower and garden pickups, parking, the score, and anything that could draw a penalty.

Your code never leaves your computer and is never saved: the simulator runs entirely in your browser, and any code you load is cleared when you reload or close the page. Many teams can use the simulator at the same time, and none of them can see anyone else's code.

**Open it:** go to your team's simulator link, or double-click `index.html` from the download. It works in Chrome, Edge, Firefox or Safari, on a laptop or a Chromebook. The 3-D view needs an internet connection.

---

## The 5-minute start

1. **Pick your slot.** The **Robots** panel has four robot cards: *Red audience*, *Red rear*, *Blue audience* and *Blue rear*. They start empty. Choose the one that matches where your robot starts.
2. **Type your team number and name** on that card.
3. **Click Upload** on the card and choose your auto's `.java` file. If your auto uses other files from your project, select them all at once (see *Which files to upload* below).
4. **Read the line under the card.** It says what the simulator understood, for example *"Pedro Pathing: 6 paths, 3 launches, 2 servos – done at 27.8 s"*. If it says *No route found* or shows notes, see *When your code isn't fully understood* below.
5. **Set up your servos** on the card: which servo each one is, and whether you programmed it for positions or continuous rotation (see *Servos* below).
6. **Press Play (▶)** and watch. The match fills the screen; press **Esc** to leave full screen.

---

## Find your way around the screen

| Area | What it's for |
|---|---|
| **Robots** | One card per robot: team, code, and how the robot is built. Untick a card to leave that robot out. |
| **Game & robot settings** | Field and game numbers (tip thresholds, camera height and angle, random seed). Your robot's own timings, like flywheel spin-up, are on its robot card. Most teams never need to change these. |
| **Top view / Broadcast view / 3-D view** | Switch views. In 3-D, use the camera buttons (*Audience*, *Red side*, *Blue side*, *Overhead*, *Hive close-up*) or **Ride along** on any robot. |
| **Planned paths / Trails / Shooting zones / Coordinates** | Overlays. Turn on **Shooting zones** to see where launches are legal, and **Coordinates** to read positions off the field. |
| **Speed (¼× to 4×)** and the timeline | Use 4× to check a whole match quickly, or ¼× to study one moment. Drag the timeline to jump anywhere. |
| **Hives** and **Limelight view** | Each hive cell's contents and which side is up, plus what your Limelight would see at that moment. |
| **Servos** | A live dial for each servo on the robot you pick: where it is, where it's headed and how long it has to go, or how fast it's spinning. |
| **Auto score** | Points for each alliance, including the tip, leave and park bonuses. |
| **Match events** | Everything that happened, with times: **All**, **Scoring**, **Rules** or **Servos**. Check **Rules** and **Servos** after every run. |

**Keyboard:** **Space** plays and pauses. **← / →** step a frame. **Home** jumps to the start and **End** to the finish. **F11** puts the match in full screen and **Esc** leaves it.

**Full screen:** the field fills the screen, with the clock and both alliance scores in the top-left corner. The play bar fades while the match runs; move the mouse to bring it back.

---

## Set up your robot card (do this once)

The simulator can only be as accurate as these numbers. Time them on your real robot with a phone stopwatch.

| Setting | What to enter |
|---|---|
| **Handles** | *POLLEN only* if your intake rejects NECTAR, otherwise *POLLEN and NECTAR*. |
| **Launches** | *No – leave and park* if your robot can't score yet. |
| **Seconds to pull 4 POLLEN from a flower** | Timed on your robot. |
| **Seconds to intake the 4 garden POLLEN** | Timed on your robot. |
| **Seconds to launch all 4 into the hive** | Timed from the first launch to the last. |
| **Seconds for the flywheel to reach speed** | Time it from a stopped flywheel to launching speed. Launches wait this long after your code first spins the flywheel up. |
| **Shooter** | *Turret*, *Fixed – intake side* or *Fixed – opposite intake*. With a turret, set **Turret rotation** too. |
| **Robot weight (lb)** | Heavier robots speed up more slowly. |
| **Localization** | *Odometry pods + Pinpoint* or *Drive encoders + Hub IMU*. Encoders drift more, and the simulator shows a dashed outline where the robot *thinks* it is. |
| **Drive motor RPM** and **goBILDA mecanum wheel** | From your drivetrain build. |
| **Flywheel RPM (max)** and **Flywheel adjusts its speed for distance** | From your launcher. A fixed-speed flywheel misses long shots. |
| **Intake camera** | Tick it if your robot has a camera that finds game elements. |

**Bonus:** **Copy Pedro Constants** gives you a `Constants.java` filled in with these numbers, as a starting point for Pedro Pathing tuning.

---

## Servos

The simulator finds every servo in your code and times what it does. Servo speed matters in AUTO: a bar that isn't down yet, or a kicker that's told to come back before it finished pushing, costs you points.

### What it reads

| In your code | What the simulator does |
|---|---|
| `hardwareMap.get(Servo.class, "name")`, `hardwareMap.servo.get("name")`, `ServoImplEx` | A servo you move with `setPosition(...)` |
| `hardwareMap.get(CRServo.class, "name")`, `hardwareMap.crservo.get("name")`, `CRServoImplEx` | A servo you spin with `setPower(...)` |
| `setPosition(...)` / `setPower(...)` in `init()`, `start()`, a hardware class constructor, or before `waitForStart()` | Where the servo is when the match starts |
| `setPwmRange(new PwmControl.PwmRange(500, 2500))` | The wider pulse range (otherwise the SDK's 600–2400 µs) |
| `scaleRange(min, max)` and `setDirection(...REVERSE)` | Applied exactly as the SDK does |
| `setPwmDisable()` | The servo goes limp |

Calls inside helper methods (like `lowerBar()`), Road Runner `InstantAction`s and Pedro callbacks are found too.

### Set each servo on your robot card

| Setting | Choices |
|---|---|
| **Servo power** | *Hub servo ports – 5 V*, or *Servo power module – 6 V* (REV Servo Power Module or goBILDA servo power injector). Higher voltage = faster. |
| **Servo** | Axon MINI, Axon MAX, goBILDA Torque (25-2), goBILDA Speed (25-3) or goBILDA Super Speed (25-4). The menu shows each one's rated speed at your voltage. |
| **Mode** | *Standard – set positions* or *Continuous rotation*: the mode you **programmed the servo to** (goBILDA: Dual Mode Servo Programmer; Axon: Axon Servo Programmer). This can differ from your code – that's on purpose, so the simulator can catch a mismatch. |
| **Job** | *Flower bar* (POLLEN can only be pulled once it's down), *Intake roller* (runs the intake; its speed sets how fast you pick up), *Kicker* (each full push launches one), *Gate* (launches while open), or *Other* (timing only). |

### What it tells you (Match events → Servos)

- **Every move:** the pulse your code sends, how far the servo turns and how long it takes – for example *"flowerBar.setPosition(0.85) → 2130 µs: 221° of travel, 0.59 s (Axon MAX at 5 V)"*.
- **Told to move again before it arrived:** your wait is too short for that servo. A kicker that never finishes its push launches nothing.
- **At the flower but the bar isn't down yet:** lower the bar earlier, or wait longer before driving in.
- **`setPosition` on a servo programmed for continuous rotation:** it spins instead of holding a position (0.5 = stop).
- **`setPower` on a standard servo:** it moves to a position and holds; it won't spin.
- **`setPower` that's already full speed:** the SDK sends 600–2400 µs for −1…+1, but continuous servos reach full speed sooner (goBILDA Speed/Super Speed at 1000–2000 µs, goBILDA Torque at 900–2100 µs, Axon at 1050–1950 µs). On a goBILDA Speed, `setPower(0.6)` is already full speed.
- **Still moving when the robot drives off:** just so you know how long the move really takes.

The speeds are the makers' no-load ratings. A real bar or gate slows a servo down, so the simulator runs them at 85% of rated speed; change **Servo speed under load** in Game & robot settings if you've timed yours.

---

## Upload your code

### What the simulator reads directly

| If your auto is written with… | It looks like… |
|---|---|
| **Pedro Pathing 3** (current pedropathing.com docs) | `PoseFactory`, `line(...)`, `curve(...)`, `sequential(follow(follower, …))` |
| **Pedro Pathing 2** | `new Pose(...)`, `BezierLine`, `pathBuilder()`, `switch (pathState)` |
| **Road Runner 1.0** | `drive.actionBuilder(...)` |
| **FTC SDK sample autos** | `encoderDrive(...)`, `driveStraight(...)`, `turnToHeading(...)`, timed `setPower(...)` |
| **Crossbotics FTC helper library** (goBILDA / REV / AndyMark / Studica starter bots) | `extends Auto<Robot>`, `s.start(...)`, `.move(...)`, `.action(...)`, `.parkWithSeconds(...)` |

It also handles most of the ways teams organize code:
- **Pose helpers:** your own small functions like `P(x, y, heading)` or a `mirror(...)`.
- **Alliance checks:** `red()`, `isRed()` and `RED` are answered from your slot's alliance, so a blue slot automatically gets your mirrored poses.
- **State machines:** steps are followed in order through `setState(n)` / `setPathState(n)`.
- **Helper methods:** like `startParking()` or `shootIfUp()`, read through in place.

### Which files to upload

**Select every file the auto depends on at the same time** (Ctrl-click or ⌘-click in the file picker). The simulator reads them together as one robot.

| Your project has… | Select together |
|---|---|
| A shared base class plus Red and Blue OpModes | The base class **and** one OpMode, for example `GardenSideAuto.java` + `RedGardenSideAuto.java` |
| Distances and powers in a settings file | The auto **and** `Tunables.java` (or `Constants.java`, `RobotSettings.java`) |
| Shared routes (helper library cookbook) | The auto **and** `Routes.java` (and `Tunables.java`) |
| Pedro paths in one file, the routine in another | Both files |

You don't need hardware classes (`Robot.java`, drivers, subsystems) unless they contain your poses or distances.

### Check that it read correctly

1. **Read the line under the card:** how many paths and launches it found, the park time, and how many notes.
2. **Click Open code.** The bottom of that window lists **What the simulator will run**, step by step, plus any notes. Click a step to highlight the line of code it came from.
3. **Press Play** and watch for anything that doesn't match what your robot does.

---

## When your code isn't fully understood

Work through these in order. Each one takes less effort than the next.

### 1. Read the notes

They usually say exactly what to do, for example:
- *"select Tunables.java together with your auto"*
- *"This auto calls shared route helpers – select that file too"*
- *"State 5 can go two ways – the simulator follows the first one written"*

### 2. Add a `// @sim` comment

Write it anywhere in your code; your robot ignores comments. Useful ones:

| Comment | Use it when |
|---|---|
| `// @sim start -11.5 -63.25 90` | The simulator can't work out where your robot starts. Field-center inches, heading in degrees. |
| `// @sim shoot` | Your launch call has a name it doesn't recognize. |
| `// @sim intake on` / `// @sim intake off` | Same, for the intake. |
| `// @sim wait 1.5` | Something takes time but isn't a drive. |
| `// @sim vision-shoot` | Your robot launches automatically when the Limelight sees an up cell. |
| `// @sim fullspeed 55` / `// @sim track 14` | Timed or encoder SDK autos: your robot's top speed (in./s) and wheel spacing (in.). |

### 3. Use Translate

For code built on your own classes, a command framework, or calls like `robot.driveToGoal()`:

1. Click **Translate** on the robot card. The top line says how much is already understood.
2. Answer only what's listed:
   - **Needs your answer:** a drive with no target point (type `x y heading`), or an action the simulator doesn't recognize.
   - **Check these guesses:** the simulator guessed from the names. Correct any that are wrong.
   - **Might be part of the route:** only shown when no drives were found at all. If one of these drives or scores, say what it does.
3. Pick whether the points you type are **Pedro corner inches (0–144)** or **field-center inches**.
4. Tick **Use my answers**. Your answers are added to everything the simulator already reads, right where those calls are in your code.
5. Check **What the simulator will run** at the bottom of the window.

Everything already understood is folded away under **Show more**. You only need to open it if something is missing.

### 4. Record a log on the real robot (most accurate)

If your robot already runs its auto, this is the most trustworthy option: the simulator replays what your robot actually did.

1. Add [`SimRecorder.java`](SimRecorder.java) (in this repository) to your TeamCode, and add five lines to your auto: create it, `start()`, `pose(x, y, heading)` every loop, `event("shoot")` and the like, and `save()`.
2. Run the auto from your Driver Hub as usual.
3. Get the log off the **Control Hub** (not the Driver Hub): plug in its USB-C cable and copy `FIRST/simlogs/<name>.csv`, or download `robotControllerLog.txt` from the Robot Controller Console (**Manage → Download Logs**).
4. Click **Upload** on your robot card and choose that file.

Step-by-step instructions with code for Pedro Pathing, Road Runner and goBILDA Pinpoint are in the **[README – Record your real robot](README.md#record-your-real-robot-most-accurate)**.

---

## Add your alliance partner's code (or a teammate's)

This is where the simulator helps most: checking that two autos don't get in each other's way.

### Getting the code

- **Ask your partner to send their auto files**, or their robot log. They can stay private; the simulator only runs on your computer.
- **Teammate with a different version or a second robot:** load each version into its own slot, or swap files in one slot between runs.
- **No code yet?** Give their slot a simple stand-in: click **Open code** and type a few lines of sim script (field-center inches, degrees), then set their robot card's times so it moves like their robot does. For example:
  ```
  start -11.5 63.25 -90
  wait 2
  forward 24
  ```

### Running both together

1. **Put each robot in the slot that matches its real start:**
   - same alliance, so red + red or blue + blue
   - one *audience* slot and one *rear* slot
   
   The slot decides the alliance, so mirrored code turns into the right poses automatically.
2. **Fill in both robot cards.** Their timing matters as much as yours.
3. **Untick the other alliance's robots** if you only want to study your alliance. Or leave them on, to see the whole field.
4. **Press Play**, then check **Match events → Rules**.

### What to look for and how to fix it

| You see | It usually means | Try |
|---|---|---|
| *"… collides with …"* | Both robots want the same space at the same time | Have one robot wait (a `waitUntil` on the match clock), or take a different lane around the hive. |
| One robot waits a long time to launch | Its cell isn't up yet, because the other robot hasn't tipped the hive | Reorder who launches first, or launch into the other cell. |
| Both robots head for the same parking spot | Your park routes overlap | Agree who takes the upper and who takes the lower spot. The simulator also swaps spots if that's shorter. |
| The hive tips only once | Not enough POLLEN reached the up cell | Count your shots against the tip threshold, then add a flower or garden pickup. |
| *"crosses onto the other alliance's side (G402)"* | A path or turn swings over the center line | Move that waypoint or turn farther from the line. |

Agree on the plan with your partner using what the simulator shows, then change your code and re-run. Speed up re-checks with **4×** and the timeline.

---

## Work efficiently

- **One change at a time:** change your code, re-upload, check the card line, press Play at 4×, check **Rules**. If something looks off, scrub the timeline to that moment at ¼×.
- **Test for luck:** change **Random seed** in Game & robot settings and re-run a few times. Misses are random, so a plan that only works on one seed isn't reliable.
- **Ride along** on your robot in the 3-D view to see what its Limelight sees and when.
- **Coordinates overlay:** turn it on to read positions off the field grid when planning new waypoints.
- **Your code is not saved.** It lives only in the open page; reloading or closing the page clears it and every robot card goes back to empty (your browser asks first if you have code loaded). Translate answers are cleared too. Keep your code files in your team's project as always, and re-upload them each session. **What is saved, in this browser only:** game settings, the field layout, and each robot card's hardware numbers and team name - so you don't have to re-enter your robot every time. Use **Restore defaults** in Game & robot settings to clear those on a shared computer.
- **Field pieces:** the parking zones, flowers, gardens and AprilTag IDs are fixed to the BIOBUZZ field and can't be moved.

---

## What the results mean, and what they don't

- **Modeled:** paths and timing, the hive and tipping, flower and garden pickups, servo travel and spin speeds, launch zones, collisions, the main AUTO rules (including the 4-element limit of G407), and scoring.
- **Approximate:** launch accuracy (random misses), drivetrain speed (from your card's numbers), and timed SDK moves.
- **Read, not run:** the simulator reads your code without running it. A decision your robot makes while running (for example, a sensor choosing a branch) follows the first branch written; the notes say where. A robot log avoids this completely.
- **Rules:** the simulator flags likely problems, but the referees and the current BIOBUZZ Competition Manual have the final word.

---

## Troubleshooting

| Problem | Fix |
|---|---|
| Card says *No route found* | Upload the other files your auto uses, add a `// @sim start`, or use **Translate**. |
| Robot starts in the wrong place | Check that you're in the right slot (alliance and side). Add `// @sim start x y heading` if needed. |
| Robot drives a mirror image of what you expect | Check the slot's alliance, and whether your code mirrors for blue. **Open code → Coordinates** can switch between *Field center* and *Corner 0–144 (Pedro)*. |
| Distances are a little off | Upload your `Tunables.java` / constants file together with the auto. |
| A launch or intake doesn't happen | Add `// @sim shoot` or `// @sim intake on` at that spot, or answer it in **Translate**. If a servo does the launching or intake, set its **Job** on the robot card. |
| A servo isn't listed on the card | It needs a `hardwareMap.get(Servo.class, "name")` (or `CRServo`) somewhere in the files you uploaded. Upload your hardware class along with the auto. |
| The robot keeps running old code | Re-upload the file. |
| 3-D view is blank | It needs internet the first time. School networks sometimes block it; Top view works offline. |
| Want to start fresh | **Open code → Clear** on a card, or **Restore defaults** in Game & robot settings. |

---

*BIOBUZZ Auto Simulator, by Largo Robotics (Largo High School, Largo, FL). Questions or ideas: largoroboticsteam@gmail.com.*
