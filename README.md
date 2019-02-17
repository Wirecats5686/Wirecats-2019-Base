# Getting Started
 
## Overview
Welcome to the base code repository for the Wirecats FRC 2019 season. The files here contain all of the logic and execution steps for the robot, including its various subsystems. Essentially, it's the behind-the-scenes magic that makes everything work. Prepare to be blown away! :shipit:

## What's new for 2019?

* VS Code replaced Eclipse as the official IDE where we'll write our code
* Using Gradle tool to build code
* Configured Shuffleboard with default Driver Station View
* Using Timed Robot (vs. Command-Based Robot) as project template

## Install Software

1. [VS Code Installation Instructions](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/1027503-installing-c-and-java-development-tools-for-frc)
2. [FRC 2019 Update Suite Installation Instructions](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/1027504-installing-the-frc-update-suite-all-languages)
3. Create a [sample Robot program](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/1027062-creating-a-robot-program) to ensure everything is set up correctly.

## Git Commands

Here are the Git commands you'll need to download a copy of this repository and upload your changes to GitHub. :octocat:

**Remember the difference between Git and GitHub: GitHub is just the site where we post our code whereas Git is the commands we write on the command line to get and upload changes.**


```bash
# Run this the first time you open VS Code 
git clone https://github.com/Wirecats5686/Wirecats-2019-Base.git
cd Wirecats-2019-Base

# Work your sick skills on the keyboard; change and (always) test your code

# Do this when your change works and you're ready to share it with the team; 
# If you installed Git for Windows you can use the Git plugin (looks like a Y) 
# on the lefthand side of VS Code. Otherwise, run the below commands:

# Repeat git add for each file changed
git add filename.java
git commit -m "Description of changes"
git push origin master

# Congrats, you submitted your change! At the beginning of each practice, 
# remember to run this to grab everyone else's changes:
git pull
```

## Deploy code to Robot

0. Ensure the RoboRio is turned on and connect the programming laptop to its Wifi (named "5686").
1. Once code changes are done and tested, right click the ```build.gradle``` file and choose "Build Robot Code".
2. Build again once any found issues are resolved and re-tested.
3. Right click ```build.gradle``` again and choose "Deploy Robot Code". This will deploy the code to the RoboRio.
4. Open the **Driver Station** program. Ensure all joysticks and gamepads are connect and click the green "Enable" to run the code.
5. Test away on the robot and click the red "Disabled" button when done.

## Additional Resources

* [Wiki](https://github.com/Wirecats5686/Wirecats-2019-Base/wiki) of this repository
* [FRC Java Programming Articles](https://wpilib.screenstepslive.com/s/currentCS/m/java)
* [FRC Java API](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/272787-frc-java-wpilib-api-documentation)
* [Chief Delphi](https://www.chiefdelphi.com/c/technical/programming)
* [Learn Java](https://www.codecademy.com/learn/learn-java)
* [Learn Git & GitHub](https://www.codecademy.com/learn/learn-git)
