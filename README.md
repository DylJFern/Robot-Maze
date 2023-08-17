# Robot-Maze

## Introduction
A project that me and my friends had created in high school, it utilizes the becker.robots package which until recently I did not have access to, and as such was unable to upload the project.

After, finally downloading the necessary software and packages, I was able to once again play this simple game we had created, and I could not help feel nostalgia. However, I soon realized it was unfinished and disrupted the intended gameplay. Due to time constraints, this was not seen as critical back then, but like everyone with nostalgic memories they would like to revisit, I decided to take some time to fix problems I deemed necessary before sharing it with others.

## How Does It Work?
The user is able to play as a robot whose objective is to collect all "things" or "beepers" (depending on what documentation you view) and then return to a specified location in order to complete the level.

Note: An intersection is defined by (street, avenue), similar to an (x, y) coordinate system on a grid where the bottom-left corner of the screen would be set as the origin (0, 0) as seen below. Streets run horizontally (East-West) and avenues run vertically (North-South).

![beckerRobotsCoordinateSys2](https://github.com/DylJFern/Robot-Maze/assets/128000630/4fd3eaac-3a8d-4605-9390-732e3f571729)

The constructor to generate a city (or a grid) is represented as the following: City(int numVisibleStreets, int numVisibleAvenues)

However, in the case of our GUI one has to consider the inverse when reading the code. To represent a standard coordinate system, the pairing is written and displayed as (x, y) but out pairing is written and displayed as (y, x) or (avenue, street). This is solely due to how we had originally defined the locations of "things", robots, and walls. In addition, our origin (0, 0) is located in the top-left corner of the screen.

## Gameplay
While attempting to collect all "things" and return to a specified location to complete the level, the user will have to navigate the map using keyboard inputs to control and pick/drop "things” while avoiding enemy robots that follow a pre-programmed path.

There are 4 different levels that were designed and programmed. Each level has its own theme, as such its own graphics and layout that attempt to fit that theme. Although this excludes the ‘GuardBot’ design which will be consistent and distinguishable for all of the levels. The user can also expect each level to have its own difficulty associated with it (whether this difficulty increases with each level is up to interpretation). The level design and difficulty is based on various factors such as:

1) The number of ‘GuardBots’ and/or modified speeds as well as paths.
2) The number of "things" the user would have to pick up while navigating.
3) The map size (based on the theme) affecting the number of safe spots and their ability to navigate.

### Level 1: Mushroom Level
  - 8 things to collect
  - 4 GuardBots to avoid

![MushroomLevel](https://github.com/DylJFern/Robot-Maze/assets/128000630/8b7310fa-ffe3-4d15-a23a-da9713b3eacb)

### Level 2: Poke Level
  - 24 things to collect
  - 3 GuardBots to avoid

![PokeLevel](https://github.com/DylJFern/Robot-Maze/assets/128000630/0019e147-f67a-4c79-a662-1b8bba9c4d0d)

### Level 3: Sonic Level
  - 13 things to collect
  - 6 GuardBots to avoid

![SonicLevel2](https://github.com/DylJFern/Robot-Maze/assets/128000630/7d67c49c-74af-44f9-bc04-d26e22737626)

### Level 4: Samus Level
  - 11 things to collect
  - 9 GuardBots to avoid (at the start only 8 are visible and 1 is invisible)
  - 2 out of 9 GuardBots change their transparency states (visible and invisible) during gameplay

![SamusLevel](https://github.com/DylJFern/Robot-Maze/assets/128000630/407621cf-6b4f-4c94-92b4-2428e75e5a28)

## How To Play
In this section I am going to cover:
1) The necessary software and files needed to compile and run the program.
2) Walk you through an example run showcasing the possible outputs.

### Compile
1) To compile and run this program I used [DrJava](https://sourceforge.net/projects/drjava/files/) since this was the IDE we had used originally. However, other related software (like Eclipse which has a DrJava plug-in) should be sufficient, but keep in mind it may required additional steps than those listed here.
2) Download the correct [Java JDK](https://www.oracle.com/java/technologies/downloads/#java8) (JDK or Java Development Kit is an "environment for building applications, applets, and components using the Java programming language"). Make sure to install the correct product for your operating system (e.g. Windows) and processor architecture (e.g. 64-bit OS, x64-based processor). For instance, this information can be found on Windows under System > System Type either through a search conducted on the taskbar or from the control panel.
3) Download and extract the [Ready Classes folder](https://github.com/DylJFern/Robot-Maze/blob/master/Ready%20Classes-20230813T054836Z-001.zip) to any location of choice. Open DrJava (if it is not already) and click Edit > Preferences > Add Extra Classpath > Select the extracted folder (by either searching for it or providing the link to the file path as the “File Name”). Make sure to apply the changes.
4) Download the [becker.zip file](https://github.com/DylJFern/Robot-Maze/blob/master/becker.zip), but do not extract it. Similar to the procedure for the Ready Classes folder, add the classpath but for the zipped file. Make sure to apply the changes.

### Example Run - Level 3: Sonic Level
In this subsection we are going to compile and run the 'SonicLevel' program. Along the way we are going to discuss how to control the user’s robot and the various expected outputs to the screen.
1) Open all the necessary files: “GuardBotDesign”, “SonicBot”, “SonicBotDesign”, “SonicGuardBot1”, “SonicGuardBot2”, “SonicGuardBot3”, “SonicGuardBot4”, “SonicGuardBot5”, “SonicGuardBot6”, “SonicLevel”, and “SonicThing”.
2) Compile and run “SonicLevel.java”, here the user will be introduced to their first information dialog. It informs them that they have three lives to collect all the "things", when they have all the "things" they are to go to position (y, x) = (11, 11) to beat the level. You can close out of these particular dialogs by clicking “OK” or pressing the 'enter' key on your keyboard.

    ![SonicLevel - InfoDialog1](https://github.com/DylJFern/Robot-Maze/assets/128000630/0a266e6e-84e3-42b4-b277-83207ef5c98a)

3) Upon closing out of the dialog, the corresponding map level will load up with the user placed at a specific location. At this point, it is recommended you maximize the pop-up window and adjust the zoom slider as well as the vertical and horizontal scrollbars accordingly. However, it is not recommended that you adjust the speed slider as it is not the way the game was intended. 

    When you are ready click “Start”, you will notice the ‘GuardBots’ will start moving while the user’s robot will remain stationary. Before moving you may need to click on the screen (e.g. anywhere on the grid) and ensure the “Stop” button under controls does not have a faint dotted-box around it.

    **Note 1:** In every level the ‘GuardBots’ will have the black and red coloured bodies to distinguish them from the user’s  robot.

   **Note 2:** On levels where there are a lot of GuardBots (e.g. the SamusLevel), I would suggest waiting a few seconds before giving any keyboard inputs (e.g. 'w') after clicking "Start" and then anywhere on the screen. For instance, when I run the SamusLevel and give an input immediately after clicking anywhere on the screen, the GUI pop-up (that you interact with) freezes; this could be due the amount of threads that are initialized and running simultaneously, the code not being fully optimized, the DrJava IDE, etc.  
4) To control your robot you use the following keyboard inputs:
    - ‘w’ to move up, ‘a’ to move left, ‘s’ to move down, and ‘d’ to move right
    - ‘4’ will pick "things" from the ground and place them into the robot’s backpack (only if the user’s robot and "thing" share the same intersection)
    - ‘6’ will put (take) "things" from the user’s backpack and place them on the ground at the intersection where the key is pressed (only if the user’s robot has "things" in their backpack).
5) If the user tries to go to the required location to complete the level before collecting all of the "things". They will get an information dialog that informs them the current number of "things" of the total that they have collected. Again, you can close out of the dialog by clicking “OK” or pressing the 'enter' key on your keyboard.

    ![SonicLevel - InfoDialog2](https://github.com/DylJFern/Robot-Maze/assets/128000630/4c14f32a-b3b0-44c8-aec2-ada67d6b6089)  

    Upon closing out of the dialog, the program will automatically move the user’s robot out of the location.
6) If at any point during the level the user’s robot intersection is the same as the GuardBot’s intersection they will 'crash' and will be presented with a confirmation dialog.

    ![SonicLevel - ConfirmDialog1](https://github.com/DylJFern/Robot-Maze/assets/128000630/8ddfbbb1-2a18-4efa-8b4b-8e5a1758d685)

    This confirmation dialog will inform the user they have been caught and display the number of lives that remain. It will also present the user with two options: whether they want to continue playing or quit. 

    The default option is “Yes”, if the user clicks “Yes” or presses the 'enter' key on their keyboard, a new user robot will spawn at the initial (program) starting location with all the "things" they have collected thus far. If the user clicks “No”, the program will close.
7) If the user successfully collects all things and returns to the requested location they will receive an information dialog that congratulates them and informs them they have beat the level. Upon closing out of the dialog, the program will close.

    ![SonicLevel - InfoDialog3](https://github.com/DylJFern/Robot-Maze/assets/128000630/551f9994-10e0-4140-b964-d6fac40095ce)
8)  If at any point during the level the user’s runs out of lives an information dialog with pop-up.  It states the user has run out of lives and the game is now over. Upon closing out of the dialog, the program will close. 

    ![SonicLevel - InfoDialog4](https://github.com/DylJFern/Robot-Maze/assets/128000630/d04538d3-cfa5-4853-b05c-f8d65bf91573)

## Documentation Reference
Should you need it, you can find a link to documentation [here](https://courses.cs.duke.edu/spring06/cps001/doc/becker/becker/robots/package-summary.html).

## Fixes & Future Considerations
