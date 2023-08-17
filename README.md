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
3) Download and extract the Ready Classes folder to any location of choice. Open DrJava (if it is not already) and click Edit > Preferences > Add Extra Classpath > Select the extracted folder (by either searching for it or providing the link to the file path as the “File Name”). Make sure to apply the changes.
4) Download the becker.zip file, but do not extract it. Similar to the procedure for the Ready Classes folder, add the classpath but for the zipped file. Make sure to apply the changes.
