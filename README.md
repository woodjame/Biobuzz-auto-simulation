# BIOBUZZ Auto Simulator – for FTC Teams

Test your 2026–27 **BIOBUZZ** autonomous before you get to the field. Upload your real robot code and watch it run a full 30-second AUTO: paths, launches, hive tips, flower and garden pickups, servos, parking, the score, and anything that could draw a penalty.

### ▶ AUTO simulator: **https://woodjame.github.io/Biobuzz-auto-simulation/**
### ▶ TeleOp simulator: **https://woodjame.github.io/Biobuzz-auto-simulation/teleop.html**
### ▶ Full match simulator: **https://woodjame.github.io/Biobuzz-auto-simulation/match.html**
### ▶ Records: **https://woodjame.github.io/Biobuzz-auto-simulation/records.html**

The three pages link to each other at the top. **AUTO** runs your autonomous by itself. **TeleOp** is 2:00 of driver control, starting from a typical end-of-AUTO field with both alliances at 0 points – drive with your own controller and buttons or your own TeleOp code, aim with the shooting path, and play **online** against another alliance from different laptops. **Full match** runs everyone's AUTO code, the transition, then TeleOp. The TeleOp and full match pages share their robot cards, controllers and settings in your browser.

It runs in Chrome, Edge, Firefox or Safari on a laptop or Chromebook. Nothing to install and no account needed. The 3-D view needs an internet connection.

> **Your code stays private.** The simulator runs entirely in your browser. Your code is never uploaded to a server, never saved, and cleared when you close or reload the page. Other teams using the simulator can't see it.

> **Your language.** Pick a language from the globe menu at the top of any simulator page – or from the same menu on the check-in box and the tour’s welcome card, so you can choose it before anything else – and the whole page switches to it: instructions, robot cards and their menus, match events, the check-in and the guided tour. Your code, team names and OpMode names stay as they are. In **Chrome 138 or newer on a computer** this uses Chrome's built-in translator: it runs on your computer, so nothing is sent anywhere. The menu lists exactly the 38 languages it has – Spanish, French, Portuguese, German, Italian, Dutch, Polish, Romanian, Czech, Slovak, Slovenian, Croatian, Bulgarian, Hungarian, Lithuanian, Greek, Turkish, Russian, Ukrainian, Swedish, Danish, Norwegian, Finnish, Arabic, Hebrew, Hindi, Bengali, Marathi, Tamil, Telugu, Kannada, **Chinese (Mandarin, Simplified)**, Chinese (Traditional), Japanese, Korean, **Vietnamese**, Thai and Indonesian – each shown in its own script with its English name. The first time you pick a language, Chrome downloads it (a minute or two); a **bold banner at the top of the page** shows the download and then the translation, with a progress bar, and says when the page is done. If Chrome asks for one more tap, the banner shows a **Tap to download** button. On a **phone or tablet**, in **Safari**, **Firefox** or an older Chrome, picking a language shows the few taps for your browser's own *Translate* (your browser's steps are highlighted). For a language not in the menu, choose **Other language…**. The labels drawn on the field itself stay in English. To read this guide in another language, use your browser's translate button on this page.

> **One-time check-in.** The first time you open the simulator on a computer, it asks two questions – your **team number** (or tick **Not on a team**) and your **role**: Student, Mentor, Coach, Parent or Other. No names or emails, and you won't be asked again on that computer. Your answer is sent to Largo Robotics so we know which teams use the simulator, and on each later day you open the AUTO, TeleOp or Full match page, one more visit is counted with the same answer (at most once a day). Your team is outlined in green on the Top 10 scores. Your robot code is never sent.

> **On a phone.** The field comes first, at the top of the screen; scroll down for the robot cards and settings. The robot cards stay hidden until you choose how many robots you're simulating.

> **Guided tour.** Right after the check-in, a one-minute tour offers to show you around – choose **Show me around** or **Skip tour**. It lights up each part of the page in turn: on the AUTO page, choosing how many robots, your robot card, uploading your code, checking what was read, **Open code**, **Translate** and **SimRecorder**; on the TeleOp and Full match pages, choosing how many robots, your controller, the robot card, the Live controllers panel where you set your buttons, running your own TeleOp code, the views, the Driver Hub and online play. Use **Back** / **Next** (or the arrow keys) and **Esc** to close. Start it again any time with the **Tour** button at the top of the page.

> **Code built on your own classes? Use Translate.** The simulator *reads* your code – it doesn't run it. If your auto calls your own methods, like `robot.driveToGoal()` or `shooter.fireAll()`, it can't see inside them. Click **Translate your code** on the robot card (it turns **gold** when it's probably needed), say what each call does, and tick **Use my answers**. It takes about two minutes – see **[Translate – teach the simulator your own code](#translate--teach-the-simulator-your-own-code)**.

> **Usage counting.** To see how many teams use the simulator, these pages count visits (with the country and region they come from, using GoatCounter, without cookies) and the team numbers typed onto robot cards, code uploads, match runs and which features are used (3-D view, online play, controller brand, driving mode, browser language, kind of device). The public site also uses **Google Analytics** to count how many minutes each team practices: a minute counts only while the simulator tab is in front and someone has clicked, typed or used a controller in the last 2 minutes, and it's counted under the team number from your check-in. Google's ad features are switched off. If you came from a campaign link (one ending in `?utm_campaign=…`), its name is counted too, for 60 days. Your code, names and anything personal are never sent.

> **Leaderboards.** Every AUTO you play to 0:00, every solo or duo TeleOp you play to the end, and every solo or duo full match, can go on that page's **Top 10** card and the **[Records page](https://woodjame.github.io/Biobuzz-auto-simulation/records.html)**. See **[How the leaderboards work](#how-the-leaderboards-work)** below.

> **Feedback.** Tell us what worked, what didn't and what you'd like next: click **Feedback** at the top of any simulator page, or use https://forms.gle/3GBBndVtxXPdDvw2A. It takes a minute and helps us improve the simulator for every team.

---

## Step-by-step

### Step 1 – Choose how many robots

At the top of the **Robots** panel, choose **how many robots you're simulating: 1 or 2** (the AUTO page runs at most 2 robots; the TeleOp and Full match pages still allow up to 4). The robot cards stay hidden until you choose; then they open in a drop-down below. Until you choose, the two Red robots stand on the field.

- **1 robot:** pick its **starting spot** – only that robot's card is shown, and only it plays.
- **2 robots:** pick **Both Red**, **Both Blue** or **One of each**.

You can change the number any time; robots you don't choose are left out of the match. Each card is named for where its robot starts:

| Card | Your robot starts… |
|---|---|
| **Red audience** | Red alliance, on the audience side |
| **Red rear** | Red alliance, on the rear (far) side |
| **Blue audience** | Blue alliance, on the audience side |
| **Blue rear** | Blue alliance, on the rear (far) side |

The card decides your alliance. If your code mirrors for blue using `red()`, `isRed()` or `RED`, the simulator answers that from the card, so a blue card gets your blue poses automatically.

### Step 1½ – Place your robot (before or after uploading code)

Your robot is on the field **as soon as you choose it – you don't need code first.** At **0:00**, in the **top view** or **3-D view**:

- **Move it:** drag the robot to where you'll set it on the real field. It snaps against the wall.
- **Turn it:** use the **start bar** on the field (↺ / ↻ turn 15°, or **Face Rear / Audience / Red / Blue**), press **Q** or **E** (Shift = 5°), or scroll over the robot. The robot stays against the wall it was touching.
- **Or type it:** the **Starting spot** box on the robot card has **x**, **y** and **Facing** boxes and the same turn buttons, plus the `new Pose(…)` line to paste into your code.
- The card checks the spot is **legal** (G304: on your side, touching the wall, off the FLOWERS, out of the loading zone).
- **Two robots on one alliance (Both Red or Both Blue):** each robot can keep its 4 POLLEN inside or put some on the mat touching it (manual 10.3.4). At 0:00, **drag a POLLEN out of the robot's tray** onto the mat – in the **top view** the tray is the row of 4 dots under the robot; in the **3-D view** it floats above the robot ("drag to the mat"). It snaps against whichever side of the robot you drop it by – **front, back, left or right** – as long as that side isn't against the field wall (the robot must start touching the wall, so at least one side is always blocked). Drag a POLLEN along the robot to move it, or drop it on the robot to load it back. While you drag, a gold ring shows where it will land (in 3-D it shows through the robot). The start bar's **＋ On the mat** and **All in robot** buttons do the same in either view. The tip warns you if a POLLEN would cross the center line, sit under your partner or touch a FLOWER.

When you upload code afterward, **the robot starts where you placed it** and your code runs from there, as if its `startPose` were that spot. To use the start pose written in your code instead, click **Back to the code's start** on the card.

### Step 2 – Enter your team and robot

On your card:

1. Type your **team number** and **team name**.
2. Fill in how your robot is built. Time these on your real robot with a phone stopwatch – the simulator is only as accurate as these numbers.

The card shows the basics:

| Setting | What to enter |
|---|---|
| **Handles** | *POLLEN only* if your intake rejects NECTAR, otherwise *POLLEN and NECTAR*. |
| **Launches** | *No – leave and park* if your robot can't score yet. |
| **Seconds to pull 4 POLLEN from a flower** | Time it on your robot. |
| **Seconds to intake the 4 garden POLLEN** | Time it on your robot. |
| **Seconds to launch all 4 into the hive** | From the first launch to the last. |
| **Seconds for the flywheel to reach speed** | Time it from a stopped flywheel to launching speed. Launches wait this long after your code first spins the flywheel up. |

Below them the card says which AprilTag camera the robot uses. Everything else is under **Advanced customization** (click it to open), in groups:

| Group | What's in it |
|---|---|
| **AprilTag recognition** (required) | **Camera** – *Limelight 3A*, *Logitech C270 webcam*, *Logitech C920 webcam* or *None*. There's no default: until you choose, the robot has no camera and its scores don't count for Top AUTO (Advanced customization opens by itself until you do). The Limelight updates fastest; the C270 sees farthest but narrowest; the C920 sees widest but not as far; webcams run on the Control Hub, so they update about half as often. Then where the camera is: lens height, tilt, how far in front of the robot's center, and (turret robots) whether it's on the turret. |
| **Robot size and weight** | Robot footprint (18 in. max) and weight. Heavier robots speed up more slowly. |
| **Drivetrain and robot** | Localization (*Odometry pods + Pinpoint* with both pod offsets, or *Drive encoders + Hub IMU*), drive motor RPM, mecanum wheel, intake camera, where the 4 preloaded POLLEN start, elements it can hold, acceleration, turn rate, drive efficiency, drive power without an intake camera, and servo speed under load. **Copy Pedro Constants** gives you a Pedro `Constants.java` with these numbers. |
| **Flywheel shooter** | Turret or fixed shooter (and turret rotation), flywheel RPM, launch angle, whether the flywheel adjusts for distance, accuracy, flywheel wheel diameter, and ball speed compared with the rim speed. |
| **Shooting position** | Closest shot to the hive, the shooting cone, and how deep and wide the shooting zone is. They start at the BIOBUZZ field's values. |
| **Servos** | Your servo model, the mode you programmed it to, and its job. |

Under the card's second fold-out, **Error**, set how much your robot's position tracking drifts: *odometry pod error* for pods, or *drive-encoder error forward/strafing* and *Control Hub IMU drift* for drive encoders.

Most teams only need the camera and the servos – the other defaults are typical robots. **Every robot setting can be set to match your robot and still count for Top AUTO** – timings, accuracy, drivetrain, camera, shooter and error. The match itself (the human player, ranking-point thresholds, the random seed), the field layout (parking zones, flowers, gardens) and the AprilTag IDs under each cell run in the background with the BIOBUZZ manual's values and can't be changed.

**Hive tips** – the same in AUTO and TeleOp. A cell tips once **POLLEN + 1.65 × NECTAR ≥ 7.48**. The manual gives the sizes, not the weights: POLLEN ≈ 2.8 in., NECTAR ≈ 3.6 in., both Gopher ResisDent polyethylene balls (manual 9.8). Taking them as hollow balls with the same wall, weight goes with diameter², so one NECTAR weighs (3.6 ÷ 2.8)² ≈ **1.65 POLLEN** (solid balls would make it 2.1 – then 4 NECTAR would tip, which they don't). The threshold comes from the three known tipping loads – **8 POLLEN**, **5 NECTAR**, **3 NECTAR + 3 POLLEN**, each the smallest of its kind: it has to be more than 7 and at most 7.96, and the simulator uses the middle, 7.48. Every smallest tipping load:

| NECTAR in the cell | POLLEN it takes to tip |
|---|---|
| 0 | 8 |
| 1 | 6 |
| 2 | 5 |
| 3 | 3 |
| 4 | 1 |
| 5 | 0 (5 NECTAR tip it alone) |

Anything heavier tips too, and heavier loads tip faster. Each up cell starts AUTO with 3 NECTAR, so 3 POLLEN – or 1 NECTAR + 1 POLLEN, or 2 more NECTAR – tip it the first time. The hive's hint under each cell shows the quickest way to tip it and the POLLEN-only way. The three known loads are under **Settings → Hive**; change them and every other mix is worked out again (a run with changed tip rules doesn't count for the records).

Each number is a **slider**: drag it, use the arrow keys, or click the number to type an exact value. Short choices (camera, shooter, drive motor RPM, wheel size…) are **tiles** – tap the one that matches your robot.

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
   - *"No route found"* means the drives are inside your own classes – use **[Translate](#translate--teach-the-simulator-your-own-code)**.
   - Orange because of calls to your own methods? The card says *"Some of this code wasn't understood"* and the **Translate your code** button turns gold – see **[Translate](#translate--teach-the-simulator-your-own-code)**.
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

1. The match waits for you – nothing moves until you press **Play (▶)** or the **Space bar**. Then it goes full screen, with the clock and both scores in the top-left corner.
2. Move the mouse to bring back the play bar. Press **Esc** to leave full screen.
3. Use the speed buttons: **4×** to check a whole match quickly, **¼×** to study one moment. Drag the timeline to jump anywhere.
4. The field opens in the **3-D view** – use the camera buttons or **Ride along** to follow your robot. Switch to **Top view** or **Broadcast view** any time. (If a computer can't show 3-D, it opens in Top view.)
5. **Start anywhere:** at **0:00**, in the top or 3-D view, **drag a robot** to a new starting spot and turn it with the **start bar** on the field, **Q** / **E**, or by scrolling over it (Shift = finer). The AUTO runs again from there. On the card, **What the code knows** picks how your code reacts:
   - **Code starts here** – as if you changed `startPose` to this spot; every path still goes to the same places on the field.
   - **Moved, code didn't** – your code still thinks it's at its old `startPose`, so the whole route shifts and turns with the robot (what odometry would do).

   The card shows the `new Pose(...)` line to paste into your code, checks the spot against **G304** (your side, touching the wall, off the flowers, out of the loading zone), and has **Back to the code's start**. A moved start counts on the leaderboard only if it's legal.

### Step 7 – Read the results

Scroll to **Match events** after every run:

| Filter | Look for |
|---|---|
| **Rules** | Collisions, crossing the center line (G402), hitting the hive frame or a flower, running into opponent NECTAR (G408). |
| **Servos** | How long each servo move takes, servos told to move again before they arrived, a flower bar that wasn't down yet, mode mismatches. |
| **Scoring** | Every element into the hive, tips, LEAVE and PARK. |
| **All** | Everything, with times. Click any event to jump the replay to that moment. |

Also watch the right side of the screen: **Servos** (a live dial for each servo on the robot you pick) and, once the AUTO has played to the end, **Auto score** (including ranking point progress). The hives and your AprilTag camera still work exactly the same behind the scenes – their panels just aren't shown – and every tip and camera read is listed under **Match events**.

### Step 8 – Fix and re-run

Change your code in your own project, click **Upload** again, check the line under the card, and press Play at 4×. Change one thing at a time.

**Fair comparisons:** misses are random but repeat the same way every run, so when you change one thing in your code, the difference you see comes from your change.

---

## Translate – teach the simulator your own code

**What it is.** The simulator never runs your code – it *reads* it and works out the route: every drive, turn, wait, launch and intake. Pedro Pathing, Road Runner, SDK-style autos and the FTC helper library are read automatically. But when your auto calls **your own methods** – `robot.driveToGoal()`, `shooter.fireAll()`, `scoreSequence()`, a command framework – the simulator can't see what's inside them. **Translate** is a short questionnaire where you tell it what each of those calls does on the field. Your answers are slotted in exactly where those calls are in your code, alongside everything it already reads.

**When to use it** – any of these:
- The line under your card is **orange**, and the card says *"Some of this code wasn't understood"* (the **Translate your code** button turns **gold**).
- The card says *"No route found"* or *"No drives were found in this code"*.
- You press Play and a drive, a launch or the intake is **missing**, or the robot just sits there.

### How to use it, step by step

1. **Upload your code first** (Step 3), then click **Translate your code** on that robot's card. The window opens with a short guide at the top, and a line that says how much is already understood – for example *"The simulator already reads 0 drive steps and 2 actions from this code. 2 calls need an answer, 1 guess to check."*
2. **Work down the list.** Calls are grouped:
   - **Needs your answer** – the simulator can't work these out: drives with no target point, actions with names it doesn't know. Answer every one.
   - **Check these guesses** – it guessed from the names (e.g. `intake.collect()` → *Intake on*). Fix any that are wrong.
   - **Might be part of the route** – only shown when no drives were found at all. If one of these drives or scores, say what it does.
   - **Show more** – calls already handled or unrelated (telemetry, timers, setup). You rarely need to open this.
3. **For each call, choose *What it does on the field*** and fill in **Details**:

| Choose | Details to type | Example |
|---|---|---|
| Drive to a point | `x y heading` – where the drive **ends**; heading in degrees (optional) | `60 30 90` |
| Curve to a point | `x y heading` – a smooth curve that ends facing that heading | `40 100 0` |
| Turn to a heading | heading in degrees | `270` |
| Follow one of its Pedro paths | the path's name in your code | `scorePreload` |
| Wait | seconds | `0.75` |
| Spin up the shooter | – | |
| Launch everything held | – | |
| Launch some | how many | `2` |
| Intake on / Intake off | – | |
| Several steps (sim script) | one step per line (or separated by `;`) – see below | `move -12 44 270; shoot` |
| Not part of the route | – (ignored) | |

   **Repeats** (1–20): use it when the call sits in a loop – e.g. `for (int k = 0; k < 3; k++) shooter.fireOne();` → *Launch some* `1`, Repeats `3`.

4. **Pick the units of the numbers you type** in **Points I type are in**:
   - **Pedro corner inches (0–144)** – origin in the **audience-side red corner**, +x toward the **blue** wall, +y toward the **rear** wall. Use this if your code uses Pedro poses like `new Pose(60.5, 8.75, …)`.
   - **Field-center inches (–72 to 72)** – origin in the middle of the field (Road Runner style), same directions.
   - Headings are degrees in both: **0° faces the blue wall, 90° the rear wall, 180° the red wall, 270° the audience**.
5. **Tick *Use my answers*.** Nothing changes until you do. The card's button then reads **Translate ✓**.
6. **Check *What the simulator will run*** at the bottom of the window – it lists every step in order – then close it and press **Play**. Wrong? Open Translate again and change an answer; it re-runs immediately.

**A worked example.** Your auto does:

```java
static final Pose GARDEN = new Pose(24, 20, Math.toRadians(180));
...
robot.driveToGoal();      // your own method – drives to the shooting spot
shooter.fireAll();        // launches everything
intake.collect();         // intake on
robot.driveTo(GARDEN);    // your own method – drives to GARDEN
pause(750);
```

The simulator already reads `shooter.fireAll()` and `intake.collect()` from their names (they're under **Show more**), so the window asks only about the rest. It often guesses the kind of call already – then you just type the numbers:

| Group | Call in your code | What it does on the field | Details |
|---|---|---|---|
| Needs your answer | `robot.driveToGoal()` | Drive to a point (guessed) | `60 30 90` |
| Needs your answer | `robot.driveTo(GARDEN)` | Drive to a point (guessed) | `24 20 180` |
| Check these guesses | `pause(750)` | Wait (guessed) | `0.75` – already filled in; just check it |

With **Points I type are in** set to **Pedro corner inches**, tick **Use my answers**: the route becomes *drive to (60, 30) → launch → intake on → drive to (24, 20) → wait 0.75 s*.

**Sim script steps** (for *Several steps*): `move x y [heading]`, `spline x y heading`, `face heading`, `turn degrees`, `forward inches`, `back inches`, `strafe inches` (+ = left), `wait seconds`, `spinup`, `shoot` or `shoot 2`, `intake on`, `intake off`.

**Good to know**
- Translate is **per robot card** – each robot has its own answers.
- Answers are **not saved**: like your code, they're cleared when the page reloads. Keep a note of them (a screenshot works).
- For a single call, a comment in your code does the same job and stays with your code: `// @sim shoot`, `// @sim intake on`, `// @sim wait 1.5`, `// @sim start -11.5 -63.25 90`. Your robot ignores comments.
- If your robot makes decisions with sensors while it runs, Translate can only describe one version of the route. For the exact route your robot drove, **[record a log](#record-your-real-robot-most-accurate)** instead.

---

## Full match simulator – your AUTO, then TeleOp with your own controllers

Open the **Full match simulator** link above for AUTO + TeleOp, or the **TeleOp simulator** for TeleOp alone – everything below works the same on both, except that the TeleOp page has no AUTO and its start button is **Start 2:00 TeleOp**. Up to four teams play a whole match together on one computer – one robot card per team, and up to **8 controllers** (a driver and an operator for each team):

A **2:30 match**, timed like the real field (manual Table 9-1):

- **2:30 → 2:00 AUTO:** each robot runs its uploaded code.
- **0:08 → 0:01 transition:** "Drivers, pick up your controllers… 3, 2, 1". No powered movement (G403); TeleOp code INITs now.
- **2:00 → 0:00 TeleOp:** drivers take over. At **1:00** a voice says *"One minute left. Nectar may go in flowers."* – NECTAR may now go in FLOWERS and human players may enter all their NECTAR. At **0:30** the voice says *"End game, end game"* – the last 30 seconds.
- **When things may go in a FLOWER:** POLLEN any time. NECTAR only when **1:00 or less** is left – each NECTAR a robot puts in a FLOWER earlier is a **MAJOR FOUL: +20 to the other alliance (G410)**. Human players enter 1 NECTAR per hive tip until 1:00, then all the rest; entering one early would be a MINOR FOUL, +5 (G426) – the simulator's human players never do.
- **Results.**

The cues are spoken aloud when the browser can; the **Sound** button turns that off.

### Set up each robot card

**Driving mode** sits right under the team number: **Robot-centric** (the default) or **Field-centric**. Tap to switch. In the sample button setups the **Create** (Share/Back) button also switches it during a match. When it does, the card changes too and **ROBOT-CENTRIC** or **FIELD-CENTRIC** shows over the robot for 3 seconds. If your robot suddenly drives the "wrong" way after turning around, check this first.

- **Robot-centric:** the robot moves relative to the way it faces, like driving from the robot's seat. Pushing the left stick up always drives toward the robot's front – its intake. If the robot turns 180° so it faces you, stick up drives it toward you. Stick left slides toward the robot's own left (screen-right when it faces you), and the right stick pushed right turns it clockwise.
- **Field-centric:** stick up always drives the way the robot's intake faced at its starting spot (like a real robot whose IMU is zeroed when the match starts), whichever way it faces now. **Reset heading** makes the way it faces now "up".

A robot pushed into a wall, a corner, the hive frame or a flower can always drive back out – only moves that would push it in deeper are stopped.

**Team number and team name are required.** Every robot card starts blank – type your own team number and team name (the boxes stay orange until you do). A match won't start, and you can't create or join an online match, until every robot in it has both.

1. **Connect the controllers.** Plug in each controller (PlayStation, Xbox, REV or Logitech) with USB, or pair it with Bluetooth, then **press any button on it** – browsers only see a controller after a button is pressed. The **Controllers** panel lists them as *Controller 1* to *Controller 8*, in the order they connect, and each keeps its number while it stays connected.
   - **Up to 4 controllers:** Chrome, Edge or Firefox.
   - **5 to 8 controllers: use Firefox.** Chrome and Edge only ever see 4 controllers – that's a limit built into those browsers, not the simulator.
   - **Plugging in 8:** use a powered USB hub, or a mix of USB and Bluetooth. A computer's Bluetooth usually handles only about 7 devices at once, and fewer smoothly.
   - **Check every controller** before the match: press a button and watch its row light up in the **Controllers** panel, then make sure it's on the right robot in the **Live controllers** panel. If a row says "non-standard layout", plug that controller in with USB.
2. **Choose how many robots** at the top of the Robots panel (1–4) – and, for 1 or 2, which starting spots. Only those robots' cards are shown, and only they play.
   - **AI opponents:** with 1 or 2 robots, set **Other alliance** to an AI team instead of **Empty**, and the empty spots on the other alliance are driven by AI:
     - **Highly competitive** – quick robots that cycle fast and park with about 12 seconds left. Each has a **Limelight 3A** looking forward (about 9 ft) and **two webcams** looking left and right (about 4½ ft); the faint wedges on the field show what they see, and a dashed gold line shows what each one is going for. They only know about elements their cameras have seen (another robot in the way blocks the view), and they go for the **biggest clump for the shortest trip**: POLLEN and their own NECTAR on the floor, POLLEN in **either garden** (a garden isn't a protected zone, G411), and POLLEN at the bottom of a **flower** (never one their own alliance owns, and never NECTAR out of a flower, G418). In TeleOp they **cross to your side of the field** when that's where the clumps are. Seeing nothing, they drive a loop of the field, turning so the cameras sweep. They collect 3, or 4 if one more is close by, then launch from their launch zone into the cell that's tipped up, and **about 85% of their launches go in** (they only launch once they've stopped). **Two Highly competitive robots work as a team:** both keep their intakes on and go for the nearest elements their cameras see. The first one ready launches into the up cell, then drives to the **other side of the hive** – the side that will be up after the next tip – collects there and waits at that cell with its flywheel spinning; when its cameras see that cell tip up, it launches first again. The other robot works out how much more the up cell needs to tip (the hive tip table below) and launches as soon as its load is enough – so one robot sets each tip up and the other finishes it, tip after tip. If the waiting robot is loaded and its partner isn't about to tip, it helps fill the up cell instead of standing still. The match events say who's doing what.
     - **Heavy defense** – two heavy robots that **both score**: they collect **POLLEN only** (anywhere on the field) and launch into their own up cell (about 60% go in). Pushing comes first, but only when it's right there: when one of your robots is in a **shooting sequence** (holding an element and spinning its flywheel, lined up near its launch spot, or launching) and an AI robot is **within one tile** of it, that AI robot drives into it to push it off its spot, and keeps at it until your robot has **launched everything** – then goes back to scoring. A launch made while it's being pushed **misses 40–80% of the time** – about 40% for a light, short bump, rising the harder it pushes and the longer it has been pushing (the most after 2 s); the shot's note says how hard and how long. Every AI robot backs right off if a pin count starts (and leaves that robot alone for 8 s), so they don't give away G421 fouls.
     - **Moderate** – average robots that collect 2 anywhere on the field (they cross to your side too), take a moment to line up their shots, **make 50–60% of their launches**, and park early.

     Heavy defense and Moderate robots have no cameras. Every AI robot launches only once it has stopped, so its launches go in at its style's rate.

     The AI robots drive in practice and in TeleOp (in a full match they wait out AUTO, because they have no AUTO code). They follow the same rules as everyone else – the same driving, intake, flywheel, turret, aim path, pushing and fouls – because each one is driven through a virtual controller, just like yours. Matches with AI robots have opponents, so they don't go on the Records page. AI robots aren't available in online matches.
3. **Upload code** – select your **AUTO and TeleOp files together**, with every helper file they use (like `Shooter.java`, `Intake.java`, Pedro's `Constants.java`), or drag them onto the card. Files with `@Autonomous` run in AUTO, files with `@TeleOp` run in TeleOp, and helper files go to both. The card shows what was read, like *Pedro Pathing: 10 paths, 3 launches*. No AUTO code? The robot sits still in AUTO. No TeleOp code? You drive with the button menus (step 5). Like the AUTO page, **your code is never saved or sent anywhere** – it's gone when the page closes.
4. **In the Live controllers panel** (top right), under **Controllers and buttons**, pick the robot, then its **Driver controller (gamepad1)**, and an **Operator controller (gamepad2)** if your team uses one. No controller? Choose **Keyboard** (W A S D drive, J / L turn, Q intake, Space launch).
5. **No TeleOp code uploaded? The card uses the Sample TeleOp.** The robot runs the button setup in the **Live controllers** panel – the same controls as **SampleTeleOp.java**, a real FTC TeleOp the simulator writes for you. Press **View sample code** to read it or **Download SampleTeleOp.java** to put it on your robot (change the device names to match your configuration and tune the constants at the top); change a button in the panel and the code changes with it. Upload it back, or your own official TeleOp, to run it as code. When you upload your own TeleOp, the simulator reads its buttons into the menus, and **In TeleOp → Use the button menus instead** lets you change every button and servo setting by hand.

   **Start from a sample button setup.** In the **Live controllers** panel, pick one under **Button setup**. **Live controllers** at the top shows every connected controller at once – up to 8, a driver and an operator for each of the 4 robots – each with a live picture that lights up as you press. Use a controller's **Drives** menu to choose its robot and whether it's the **Driver** (gamepad1), the **Operator** (gamepad2) or **Driver + operator** (one controller does both). So the Red audience robot can have Controller 1 as its driver and Controller 2 as its operator, Red rear Controllers 3 and 4, and so on, and every controller's buttons can be set on their own. Each controller's functions are folded away: open **Driver functions** or **Operator functions** to see every button, then use each button's drop-down to change its job (the setup picker then says *Custom*). With only one controller connected, the **Operator functions** stay hidden until a second controller is connected. Buttons light up as you press them:

   | Button (PlayStation / Xbox) | **Sample – one controller** (gamepad1) | **Sample – two controllers** |
   |---|---|---|
   | Left stick / right stick | Drive / turn | Driver: drive / turn |
   | L1 / LB | Intake on/off | Driver: intake on/off · Operator: turret to its left preset |
   | ○ / B | Intake reverse (hold) | Driver: intake reverse · Operator: place NECTAR in flower |
   | L2 / LT | Slow mode (hold) – about half speed | Driver: slow mode · Operator: turret to its right preset |
   | ✕ / A | Flower bar down/up (servo) | Driver: flower bar down/up |
   | △ / Y | Flywheel on/off | Operator: flywheel on/off |
   | R2 / RT | Transfer (hold) – kicks elements up into the flywheel | Operator: transfer (hold) |
   | R1 / RB | Place NECTAR in flower | Operator: transfer one (tap) |
   | D-pad ◀ / ▶ | **Aim** left / right (hold) – turns the turret, or the whole robot for a fixed shooter | Operator: same |
   | D-pad ▲ / ▼ | **Aim** farther / shorter – flywheel faster / slower | Operator: same |
   | L3 / R3 (press a stick) | Automatic flywheel speed / turret straight ahead | Operator: same · Share/Back: flywheel off |
   | □ / X | Place POLLEN in flower | Operator: place POLLEN in flower |
   | Create / Back, Options / Start | Field-centric on/off, reset heading | Driver: same |

   With two controllers the driver has the driving, the intake and the flower bar, and the operator has the transfer, flywheel and turret – choose an **Operator controller** for it. Hover over a button to see its FTC name, like `gamepad1.right_trigger`.
6. **Servo controls** (when you're not running TeleOp code): the turret – how far it turns, how fast its servo swings (also how fast the hold buttons turn it), and where the **Turret left** and **Turret right** buttons send it; the flower bar servo's time to go down or up and whether it must be down to pull from a flower; and the transfer – how long it takes to kick all 4 up and launch them, and the flywheel spin-up time.
7. **Check Robot build and timing.** It starts from your AUTO card in the same browser: what it handles, preloads, intake and flower times, flywheel RPM and angle, shooter type, drive motors, wheels and weight, and the **Slow mode speed** (0.5 = half speed).

### Real physics
POLLEN and NECTAR roll, bounce off each other, the walls, the hive frame and the flowers, and robots push them.
  - **Launches are real balls.** They leave your shooter at your flywheel's speed and angle, plus the robot's own motion, so shooting while driving moves the shot. A shot goes in only if it actually flies into the cell's opening or drops into a flower's top.
  - **Shots aim at the middle of the cell's opening.** From close in, a slow flywheel can fall short and clip the cell's bottom edge. That's real: move back, raise the angle or spin faster.
  - **The hives are real seesaws.** Balls stay in the cell, ride along when it turns and fall out when it tips. A hive tips when its up cell's load reaches the manual's tipping load (8 POLLEN, 5 NECTAR, 3 NECTAR + 3 POLLEN and so on). Each ball counts by its weight and by how far out from the axle it sits.
  - The hive frame is its real bars, so balls can roll under it.
- **Human player NECTAR:** the human player tosses each NECTAR over the wall. It drops into the loading zone, bounces and rolls on out of it like a real thrown ball.

### Play

- **Start full match** runs everyone's AUTO, then the transition, then TeleOp. **Skip ▸▸** jumps ahead to the next period. **TeleOp only (2:00)** (and the TeleOp page's **Start 2:00 TeleOp**) skips AUTO. **Both alliances start at 0 points**, on a field that looks like it does after a typical AUTO:
  - **Score:** 0–0 at the start – no AUTO tip, LEAVE or PARK points are given.
  - **Robots:** every robot in the match starts parked in its alliance's loading zone (two robots side by side), holding nothing.
  - **Hives:** each alliance's garden-side cell has tipped, so the other cell is up and empty. The tipped cell's 4 preloaded POLLEN and 3 NECTAR fly out the way a real tip throws them, then bounce and roll until they stop – a different spread every match.
  - **NECTAR (G426):** each human player enters 1 NECTAR at the start, so 1 is dropped into each loading zone at the start. It bounces off the parked robots and rolls a little, ending up just in front of the zone. The other 4 stay in the alliance area and are entered one at a time once 1:00 is left, along with 1 more for every hive tip in TeleOp.
  - Gardens and flowers start as staged. **Defense rules** (pushing, shots taken while being pushed, PIN fouls) work the same as in a full match. **Stop** ends the match early.
- Before a match the field is in **practice** mode: drive around with the game elements, no clock.
- **3-D view:** press **3-D view** under the field (on the TeleOp and Full match pages) to watch in 3-D, like the AUTO simulator. Pick a camera at the top of the field – **Audience**, **Red drivers** or **Blue drivers** (from behind that alliance's wall), **Overhead**, **Hive close-up**, or **Ride along** with the robot you choose – or drag to orbit, right-drag to pan and scroll to zoom. It works in online matches too, and the page remembers your choice. **2-D view** switches back.
- **View from** turns the field so your drivers' wall is at the bottom. **Full screen** keeps the clock and both scores in the corner.
- During the match the live score is in the header; the full **Score** breakdown appears on the right only when the match ends. The total counts only what's been scored so far: AUTO, TeleOp hive tips and fouls. Like the real field (manual 10.5), what's left in the up cell, FLOWERS, the bottom-NECTAR bonus, GARDENS and TeleOp PARK are scored at **0:00**, once everything is at rest. Gardens count every POLLEN and NECTAR in them at the end, including the 4 POLLEN staged there. At the end, a **results** window shows every scoring line and the ranking points.

### Your TeleOp code

When you upload a TeleOp, the simulator **runs your real code** – your `runOpMode()` or `loop()`, your helper classes, your toggles and state machines – about 50 times a second, like a Control Hub. Your controllers feed `gamepad1` and `gamepad2`, and your motors and servos move the simulated robot. If your code has a bug, you see it here first.

- **When it runs:** in practice mode it starts right away (**Restart my code** runs INIT and START again). In a match it INITs during the 8 s transition and STARTs when TeleOp begins, then stops at 0:00 – like pressing INIT, ▶ and ■ on the Driver Hub. If your `init()` moves a servo, the event log warns you: that's powered movement during the transition (G403).
- **Driver Hub panel** (under *Robot status*): your `telemetry` lines, live. If your code throws an exception, it stops just like on the robot, and the panel shows the error with the file and line number.
- **Your robot's hardware:** every device your code asks `hardwareMap` for is listed on the card with its **job** – Drive FL/FR/BL/BR, Intake, Channel, Feeder, Flywheel, Turret, Flower bar, Kicker, Gate, Hood. Jobs are guessed from the names; change any that are wrong.
  - **Launching:** a **Feeder** launches while it runs forward; a **Kicker** servo launches one element each time it moves; a **Gate** servo launches while it's open and the channel or intake runs. With none of those, the **Channel** feeds the flywheel.
  - **Flywheel:** it spins at the speed your code commands (`setVelocity` or `setPower`), up to your card's max RPM, taking your card's spin-up time. Shots use that real speed: if it's too slow or too fast for the distance, the event log says the shot fell short or sailed over, and what RPM it needed.
- **How your code's numbers become motion** (on the card): wheel directions (if the robot drives the wrong way, try flipping a side – then fix the `setDirection` calls on the real robot too), which way the intake turns, the flywheel motor's ticks per revolution, the turret servo's straight-ahead position and how far it turns, and whether your localizer knows where the robot is at the start of TeleOp.
- **What's simulated:** `LinearOpMode` and `OpMode`; motors (power, velocity, encoders, RUN_TO_POSITION), servos and CR servos; the IMU, goBILDA Pinpoint and SparkFun OTOS (they count from where your code resets them, like the real ones); the Limelight 3A (AprilTags on the hive cells, with `tx`, `ty` and botpose); distance and colour sensors (they see an element when the robot holds one); `ElapsedTime`, `sleep()`, gamepad edge detection (`aWasPressed()` and copies of `Gamepad`), `telemetry`. Drive libraries: Pedro Pathing's `follower.setTeleOpDrive()` and `getPose()`, and Pedro Pathing 3's `follower.manual(forward, lateral, turn)`, `ManualDrive.fieldCentric(...)`, `ManualDrive.driveOrHold(...)` and `follower.pose()` (as in the [Pedro TeleOp guide](https://pedropathing.com/docs/pathing/guide/teleop-usage) – `follower.manual` is robot-centric); Road Runner's `MecanumDrive.setDrivePowers()` and pose; FTCLib's `MecanumDrive`, `Motor`, `GamepadEx` and `PIDFController`.
- **Not simulated:** camera vision processors (VisionPortal), code in other threads, FTCLib's command scheduler, following Pedro or Road Runner paths during TeleOp, and Kotlin. The card's **Notes on your code** lists every call the simulator skipped.
- **"In TeleOp: Use the button menus instead"** switches back to the menus if you'd rather not run your code.

### Defense

Robots push each other. A heavier robot pushes harder (lower drive RPM helps a little), and a robot that isn't driving still resists. Pushing an opponent while it launches throws off its shots. By default, while an opponent is touching it, a launching robot makes:

- **25%** of its shots when the two robots are a similar weight (within 15%);
- **75%** when it is much heavier than the defender (40% or more);
- **10%** when it is much lighter.

In between, the percentage slides between those numbers. Change any of these under **Defense rules** in the right column. Robots touching an opponent get an orange outline.

**Pins (G421):** pushing an opponent into a wall, the hive frame, a flower or another robot so it can't move is a PIN. A count appears over the pinned robot, and after 3 s it's a **MAJOR FOUL**, plus another every 3 s it goes on. A count ends once the robots have been 2 ft apart, or either has moved 2 ft, for 3 s. Very hard hits are noted in the event log (repeated high-speed ramming that causes damage is a foul, G419).

### Aiming your shots
- **The aim path:** while a robot holds POLLEN or NECTAR, a dashed line shows exactly where a launch would go right now – on the 2-D field and in the 3-D view. **Green** = it would go in (unless it's missed or pushed), **orange** = it wouldn't, **grey** = the flywheel is off. Turn it off with **Aim path: off** under the field.
- **Robot status** (right side) says what to fix: *aim 12° more to the left*, *move into the launch zone in front of the cell*, *falls short – needs about 2,300 RPM*, *sails over*…, and shows the flywheel speed.
- **Aim with the D-pad** (in the sample setups): ◀ / ▶ turn the turret – or, for a fixed shooter, turn the whole robot slowly. ▲ / ▼ make the flywheel faster (farther) or slower (shorter); the first press switches the flywheel to **manual speed**, starting from the speed it needs right now. **L3** (press the left stick) goes back to **automatic speed for distance**. Set how much each press changes (RPM) and how fast a fixed shooter turns under **Servo controls → Aiming**.
- Running your own TeleOp code? The aim path uses your code's turret, flywheel speed and hood, so you can check your aiming code too.

### What each button menu job does (without TeleOp code)

| Job | In the simulator |
|---|---|
| Intake on/off, Intake (hold) | Picks up POLLEN (and your own NECTAR, if your robot handles it) from the floor at your card's intake speed. Driven into the front of a flower, it pulls POLLEN out of the bottom. Never more than 4 (G407); opponent NECTAR is pushed away, not picked up (G408). |
| Intake reverse (hold) | Spits out what the robot holds, one at a time. |
| Flywheel on/off, Flywheel (hold) | Spins up for your card's spin-up time. |
| Transfer (hold) | Kicks what the robot holds up into the flywheel one at a time, at your card's transfer time – only once the flywheel is on and at speed. Let go to stop. |
| Transfer one (tap) | Kicks a single element up into the flywheel. |
| Flywheel + transfer (hold) | One button: spins the flywheel up, then transfers and launches while you hold it; letting go stops both. |
| Launch volley | Starts the flywheel if it's off, waits until it's at speed, then launches **everything** the robot holds over your card's launch time – it can't be stopped once started. Each shot goes toward the up cell it's aimed at; it scores only if the robot is in the launch area in front of that cell, far enough away, with enough flywheel RPM for the distance, and is aimed within a few degrees. Shots while driving miss more. |
| Place POLLEN / Place NECTAR in flower | Face a flower, close up, and drop one into its top. You can also launch into a flower's top by aiming the shooter at it. |
| Aim left / right (hold), Aim farther / shorter, Aim: automatic flywheel speed | See *Aiming your shots* above. |
| Turret presets / Turret left or right (hold) | Turns the turret at your card's servo swing speed; the presets go where you set them in **Servo controls**. Or set **Turret aiming** to auto-aim at your up cell. |
| Flower bar down/up | Moves the bar in your card's time. |
| Field-centric on/off, Reset heading | Driving starts **robot-centric** (change it with **Driving mode** at the top of the card). Field-centric: stick forward drives the way the robot's intake faced at its starting spot. **Reset heading** makes "forward" the way the robot faces now, like resetting the IMU. |
| Slow mode | Drives at the **Slow mode speed** on your card – 0.5 (about half speed) to start. |

The **Live controllers** panel lights up each button and stick as you press them, next to what that button does. Button choices are remembered in this browser; code is not.

### The rules the simulator follows (BIOBUZZ manual)

- **Hives** tip at the same counts as the AUTO page (game settings there). Each tip in TeleOp scores **20**. What's left in your up cell at the end scores **2** each.
- **Human players** enter **1 NECTAR** into their loading zone for each tip of their own hive, and **all the rest** once 1:00 is left (G426) – automatically.
- **Flowers:** POLLEN or NECTAR go in the top; only POLLEN comes out the bottom (G418). Elements in the scoring part of a flower score **2** each for the alliance whose NECTAR is on top; the alliance with the **bottom** NECTAR gets **5**. NECTAR in a flower before 1:00 is left is a **major foul** (G410, 20 points to the other alliance).
- **Gardens:** each element in your garden at the end scores **1**. **PARK:** **5** for each robot in its loading zone at the end.
- **AUTO** points (tips, LEAVE, PARK) carry over from your uploaded code's AUTO.
- **Shooting zones** run along the wall behind the up cell (36 in. deep) **from your alliance-wall corner to the hive** – anywhere in that stretch counts – and on past the hive only in the cone in front of the cell. In AUTO the zone stops where the robot would cross the center line, so the red and blue zones never overlap; contacting an opposing robot on its side in AUTO is a major foul (G402). In TeleOp it reaches 3 ft past the hive. (The manual doesn't define a shooting zone – this is the simulator's model of where a shot can reach the cell's opening.)
- No powered movement in the transition or after 0:00 (G403, G404). Scoring is counted once everything comes to rest.
- **Ranking points:** SWARM (LEAVE + PARK ≥ 16), POLLINATOR 1 and 2 (4 and 7 tips), WIN 3 / TIE 1.

The simulator is a practice tool: launch accuracy, intake speeds and robot contact are estimates, and referees make the real calls.

---

## Play TeleOp with friends

### On one computer
Up to four teams can play a full match or TeleOp on one computer, each with a driver and an operator controller (8 controllers in all). Plug in each controller (PlayStation, Xbox, REV or Logitech) (or pair it by Bluetooth), **press a button on it**, then choose it on a robot card as **Driver controller** or **Operator controller**. Chrome and Edge only see 4 controllers – use **Firefox** for more. No controller? Choose **Keyboard** for one driver.

### Online – each driver on their own laptop
The **TeleOp simulator** has a built-in **Play online** button. Up to 4 laptops play one 2:00 TeleOp match – you and a teammate against another alliance – and **each driver uses their own controller, their own button setup and their own TeleOp code**, exactly as they practice alone.

**Before you join – set up your own robot card (every player, on their own laptop):**
1. Open **https://woodjame.github.io/Biobuzz-auto-simulation/teleop.html** in **Chrome, Edge or Firefox**.
2. Plug in your controller – **PlayStation (PS5/PS4), Xbox, REV or Logitech** – with USB or Bluetooth and **press a button** on it.
3. Choose **1 robot** and your starting spot, then type your **team number and team name** (both required) on its card. In the **Live controllers** panel, choose your controller as **Driver controller** (and a second one as **Operator controller** if you have an operator on the same laptop).
4. Either set what each button does in the **Live controllers** panel (open **Driver functions** or **Operator functions**, then use each button's drop-down), or **Upload code** on the card to run your real TeleOp. Set **Robot build and timing** to match your robot. Your card is saved in your browser, so you only do this once.
5. Drive around in practice to check it feels right.

**The host (one laptop – the one with the best internet):**
1. Choose how many robots are yours on this laptop (usually 1) and their spots. Every other spot stays open for online players.
2. Press **Play online → Create a room**. You get a 6-letter **room code** – send it (or **Copy invite link**) to your teammate and the other alliance.
3. Watch the list fill in. Everyone can practice driving on the same field while you wait.
4. When everyone is in, close the box and press **Start 2:00 TeleOp**. The host's laptop runs the field, the clock, scoring, fouls and the human players.

**Joining:**
1. Press **Play online**, type the **room code**, choose **your robot card and where it starts** (Red audience, Red rear, Blue audience or Blue rear), and press **Join**. If that spot is taken you get another one on the same alliance.
2. You now see the host's field. Drive with your own controller. The host starts the match; when it ends, everyone gets the results.
3. **Leave online match** puts your robot cards back the way they were.

**Your own view.** Each player chooses their own view on their own laptop – 2-D (from the audience or either drivers' wall) or any 3-D camera, including **Ride along** with your robot – plus their own driving mode and aim path. It doesn't change what anyone else sees.

**Room chat.** While you're in a room, a **Room chat** box appears on the right. Type a message and press Enter, or tap a quick message (*Ready!*, *I'll defend*, *Going to park*, *GG*…). Choose **Everyone** or **My alliance** next to the box – alliance messages only go to your partner. Chat is text only (no voice), goes only to the laptops in your room, and **isn't saved**. The host can **Remove** a player from the room (in the Play online box).

**Your code stays on your laptop.** Your TeleOp runs only in your own browser; just what it tells the robot to do (drive power, intake, flywheel speed, launches, turret, flower bar) goes to the host. Your button setup and robot card (team number, speeds, timing) are shared so the host can run your robot.

**If it won't connect:** laptops connect directly to each other. Some school networks block that – try a **phone hotspot** or home Wi-Fi, or use Parsec (below). Keep the simulator tab **in front** on every laptop (browsers pause hidden tabs, and a laptop that stops answering for 8 seconds is dropped). Everyone needs the **same version** of the page – if you're told to reload, press **Ctrl+Shift+R** (**⌘+Shift+R** on a Mac). Expect a short delay (usually 50–150 ms, shown next to each player) – about like a slow Bluetooth controller.

### Over the internet with Parsec (the full match, or if online won't connect)
For a **full match** (AUTO + TeleOp) together, or when laptops can't connect directly, use **Parsec**, a free screen-sharing app made for playing games with friends:

1. **The host** (a Windows computer) installs **Parsec** from parsec.app. In Parsec's **Settings → Host**, turn on **Parsec Virtual USB Gamepads** (it installs a small driver) and restart Parsec.
2. The host opens the **Full match** or **TeleOp** simulator in **Firefox** (it sees up to 8 controllers; Chrome and Edge see 4), turns on the robot cards, and uploads everyone's code.
3. **Friends** install Parsec (Windows or Mac), plug in their controllers, and join the host's computer from the host's invite link or friend list.
4. Each friend's controller shows up on the host as a game controller. **Each friend presses a button**, then the host chooses that controller on the friend's robot card as **Driver controller** (and another for **Operator controller**). Check the **Controllers** panel: each controller's row lights up when its buttons are pressed.
5. The host presses **Start full match** (or **Start 2:00 TeleOp**). Everyone sees the host's screen and drives their own robot.

With Parsec the host runs everyone's code and button setups, so each team's code has to be uploaded on the host's computer. Parsec's guest controllers appear as Xbox-style controllers, which line up with the PS5 layout (Cross = A, Circle = B, Square = X, Triangle = Y).

**Scores:** online matches, and any TeleOp played with opponents (both alliances), aren't sent to the Records page – only **solo** (one robot) and **duo** (two robots on one alliance, no opponents or AI robots) runs on one computer are: **Start 2:00 TeleOp** on the TeleOp page goes on the **TeleOp** lists, and **Start full match** on the Full match page goes on the **Full match** lists (AUTO + TeleOp, up to 1200). TeleOp and full-match scores are kept apart by **TeleOp code**: **Sample code** if a robot used the Sample TeleOp (button setup), **Own code** if every robot ran its team's uploaded TeleOp.

## How the leaderboards work

**Fresh start (November 4, 2026):** every board restarted when real physics became the way the simulator works, so all scores are set under the same physics.

There are two boards, both fed by the same score sheet:

- **Top 10** – a gold-framed card at the top right of every simulator page, showing only that page's scores (best per team or pair, solo and duo together): the **AUTO** page shows the top 10 AUTO scores (above **Servos**); the **TeleOp** page shows the top 10 TeleOp scores in two lists, **Sample code** and **Own code** (above the **Live controllers**); the **Full match** page shows the top 10 full-match scores. Each has with medals for the top 3, your own team outlined in green, and a link to all the records. On a phone they scroll in a band under the page header instead. In full screen on the AUTO page, the top 3 AUTO also show under the Red and Blue scores.
- **[Records page](https://woodjame.github.io/Biobuzz-auto-simulation/records.html)** – the full rankings, like a game's high-score table: **AUTO**, **TeleOp** or **Full match**, **Solo** or **Duo**, **Sample code** or **Own code** (TeleOp and Full match), filtered by robot (turret, fixed shooter, Limelight, webcam, no camera). Type your team number to see your team's best, average and number of runs in each category.

**What gets recorded**
- **AUTO:** every AUTO you play through to 0:00 on the AUTO page, one row per alliance that runs a team's own code. One robot on the alliance = **Solo**; two robots = **Duo** (both team numbers are shown, e.g. 18522 + 27426).
- **TeleOp:** on the **TeleOp simulator**, press **Start 2:00 TeleOp** with one robot (**Solo**) or two robots on the same alliance (**Duo**), no robots on the other alliance, and play to the end. (Practice driving and full matches with opponents aren't recorded.)
- Only team numbers, the score, the robot type and a fingerprint of the code are sent – never your code. After each run, a message on the field says whether the score counts and, if not, why.

**What counts**
- Every robot has a **team number**. **AUTO** (and the AUTO part of a full match) runs the team's **own code**; **TeleOp** can use the Sample TeleOp or the team's own code; for AUTO, an **AprilTag camera** is chosen (None is fine).
- **No robot crosses onto the other alliance's side in AUTO** (G402, a major foul). Warnings such as bumping the hive frame don't stop a score.
- The **standard hive tip rules**.
- **AUTO:** your team's **own AUTO code** (not sample code). Every robot setting – timings, accuracy, drivetrain, camera, shooter, error – can be set to whatever your robot really does. Only the game itself (the hive tip rules and the field layout) must stay standard.
- **TeleOp and full match:** the same freedom – set every robot setting to match your robot. **TeleOp** can be the **Sample TeleOp** (button setup) or your own uploaded TeleOp code. A **full match** needs your team's **own AUTO code**.

**How it's ranked**
- Each team (or pair of teams) shows its **best** score in each category; ties go to whoever got there first. Your other runs count towards your number of runs and your average.
- New scores show up within about 5 minutes (the boards refresh every 2 minutes).
- AUTO scores come from your code, so they repeat exactly. TeleOp scores come from a driver, so they're on the honor system – please play fair. Largo Robotics may remove any score.
- TeleOp scores recorded before October 28, 2026 included 36 free AUTO points (TeleOp now starts both alliances at 0), so the Records page leaves them off. Online matches aren't recorded.

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
| `// @sim vision-shoot` | Your robot launches automatically whenever its AprilTag camera sees an up cell (choose the camera on the card). |
| `// @sim fullspeed 55` / `// @sim track 14` | Timed or encoder SDK autos: top speed (in./s) and wheel spacing (in.). |

**3. Use Translate** for code built on your own classes or a command framework (e.g. `robot.driveToGoal()`): click **Translate your code** on the card, say what each call does, tick **Use my answers** – full steps in **[Translate – teach the simulator your own code](#translate--teach-the-simulator-your-own-code)**.

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
| Launches one element – call it for **each** POLLEN or NECTAR as it leaves (more accurate, see below) | `rec.shot();` |
| Turns the intake on / off | `rec.event("intake_on");` / `rec.event("intake_off");` |
| Starts spinning the flywheel | `rec.event("spinup");` |

**`rec.shot()` vs `rec.event("shoot")`:** `shoot` makes the replay fire everything it holds at the robot card's pace. `shot()` fires one element at the exact moment your real robot did, so the replay shows whether your fast shots get into the cell before the hive swings too far while it tips. Use `shot()` if your code knows when each element leaves (a kicker or feeder step, or a ball sensor going clear). Logs from the older SimRecorder still work.

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
| 3-D view is blank, or the page opens in Top view | 3-D needs internet. School networks sometimes block it; Top view works offline. |
| Start fresh | **Open code → Clear** on a card, and set any changed numbers back on the card. |

---

## What the results mean – and what they don't

- **Modeled:** paths and timing, the hive and tipping, flower and garden pickups, servo travel and spin speeds, launch zones, collisions, the main AUTO rules (including the 4-element limit, G407), and scoring.
- **Approximate:** launch accuracy (random misses), drivetrain speed (from your card's numbers), servo speed under load (85% of the maker's rating – change **Servo speed under load** in settings if you've timed yours), and timed SDK moves.
- **Read, not run:** the simulator reads your code instead of running it. When your robot makes a decision while running (like a sensor choosing a branch), it follows the first branch written – the notes tell you where. A robot log avoids this.
- **Rules:** the simulator flags likely problems, but the referees and the current BIOBUZZ Competition Manual have the final word.

**Your code is never saved.** Keep your files in your own project and re-upload them each session. Only your robot card numbers, team name, servo choices and settings are remembered, in your browser only. On a shared computer, use **Restore defaults** when you're done.

For more detail on any feature, see **[TEAM_GUIDE.md](TEAM_GUIDE.md)**.

---

*BIOBUZZ Auto Simulator by Largo Robotics – Largo High School, Largo, FL. Feedback: https://forms.gle/3GBBndVtxXPdDvw2A · Questions: largoroboticsteam@gmail.com*

## License

© 2026 Largo Robotics, Largo High School. All rights reserved. The BIOBUZZ Simulator is **free to use** under the [BIOBUZZ Simulator License](LICENSE.md): use it, share the link, and post screenshots and videos with credit – but please don't copy, re-host, modify or sell it, or try to extract its code. Your robot code stays yours and never leaves your browser. `SimRecorder.java` may be used and changed in your own robot code. The Simulator is a student-built practice tool and isn't affiliated with or endorsed by *FIRST*®; *FIRST*®, FIRST® Tech Challenge and *BIOBUZZ* are trademarks of *FIRST*.
