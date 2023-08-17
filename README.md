# Robot-Maze

## Introduction
A project that me and my friends had created in high school, it utilizes the becker.robots package which until recently I did not have access to, and as such was unable to upload the project.

After, finally downloading the necessary software and packages, I was able to once again play this game we had created, and I could not help but feel nostalgia. However, I soon realized it was unfinished and disrupted the intended gameplay. Due to time constraints, this was not seen as critical back then, but like everyone with nostalgic memories they would like to revisit, I decided to take some time to fix problems I deemed necessary before sharing it with others.

## How Does It Work?
The user is able to play as a robot whose objective is to collect all "things" or "beepers" (depending on what documentation you view) and then return to a specified location in order to complete the level.

Note: An intersection is defined by (street, avenue), similar to an (x, y) coordinate system on a grid where the bottom-left corner of the screen would be set as the origin (0, 0) as seen below. Streets run horizontally (East-West) and avenues run vertically (North-South).

![beckerRobotsCoordinateSys2](https://github.com/DylJFern/Robot-Maze/assets/128000630/4fd3eaac-3a8d-4605-9390-732e3f571729)

The constructor to generate a city (or a grid) is represented by the following: City(int numVisibleStreets, int numVisibleAvenues)

However, in the case of our GUI one has to consider the inverse when reading the code. To represent a standard coordinate system, the pairing is written and displayed as (x, y) but our pairing is written and displayed as (y, x) or (avenue, street). This is solely due to how we had originally defined the locations of "things", robots, and walls. In addition, our origin (0, 0) is located in the top-left corner of the screen.

## Gameplay
While attempting to collect all "things" and return to a specified location to complete the level, the user will have to navigate the level using keyboard inputs to control and pick/drop "things” while avoiding enemy robots that follow a pre-programmed path.

There are 4 different levels that were designed and programmed. Each level has its own theme, as such its own graphics and layout that attempt to fit that theme. Although this excludes the ‘GuardBot’ design which will be consistent and distinguishable for all of the levels. The user can also expect each level to have its own difficulty associated with it (whether this difficulty increases with each level is up to interpretation). The level design and difficulty is based on various factors such as:

1) The number of GuardBots and/or modified speeds as well as paths.
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
  - 9 GuardBots to avoid (at the start only 8 are visible, 1 is invisible)
  - 2 out of 9 GuardBots change their transparency state (visible and invisible) during gameplay

![SamusLevel](https://github.com/DylJFern/Robot-Maze/assets/128000630/407621cf-6b4f-4c94-92b4-2428e75e5a28)

## How To Play
In this section I am going to cover:
1) The necessary software and files needed to compile and run the program.
2) Walk you through an example run showcasing the possible outputs.

### Compile
1) To compile and run this program I used [DrJava](https://sourceforge.net/projects/drjava/files/) since it was the IDE we had originally used. However, other related software (like Eclipse which has a DrJava plug-in) should be sufficient, but keep in mind it may require additional steps than those listed here.
2) Download the correct [Java JDK](https://www.oracle.com/java/technologies/downloads/#java8) (JDK or Java Development Kit is an "environment for building applications, applets, and components using the Java programming language"). Make sure to install the correct product for your operating system (e.g. Windows) and processor architecture (e.g. 64-bit OS, x64-based processor). For instance, this information can be found on Windows under System > System Type either through a search conducted on the taskbar or from the control panel.
3) Download and extract the [Ready Classes folder](https://github.com/DylJFern/Robot-Maze/blob/master/Ready%20Classes-20230813T054836Z-001.zip) to any location of choice. Open DrJava (if it is not already) and click Edit > Preferences > Add Extra Classpath > Select the extracted folder (by either searching for it or providing the link to the file path as the “File Name”). Make sure to apply the changes.
4) Download the [becker.zip file](https://github.com/DylJFern/Robot-Maze/blob/master/becker.zip), but do not extract it. Similar to the procedure for the Ready Classes folder, add the classpath but for the zipped file. Make sure to apply the changes.

### Example Run - Level 3: Sonic Level
In this subsection we are going to compile and run the 'SonicLevel' program. Along the way we are going to discuss how to control the user's robot, interact with the levels, and the corresponding exxpected outputs.
1) Open all the necessary files: “GuardBotDesign”, “SonicBot”, “SonicBotDesign”, “SonicGuardBot1”, “SonicGuardBot2”, “SonicGuardBot3”, “SonicGuardBot4”, “SonicGuardBot5”, “SonicGuardBot6”, “SonicLevel”, and “SonicThing”.
2) Compile and run “SonicLevel.java”, here the user will be introduced to their first information dialog. It informs them that they have three lives to collect all the "things", when they have all the "things" they are to go to position (y, x) = (11, 11) to complete the level. You can close out of these particular dialogs by selecting “OK” or pressing the 'enter' key on your keyboard.

    ![SonicLevel - InfoDialog1](https://github.com/DylJFern/Robot-Maze/assets/128000630/0a266e6e-84e3-42b4-b277-83207ef5c98a)

3) Upon closing out of the dialog, the corresponding level will load up with the user placed at a specific location. At this point, it is recommended you maximize the pop-up window and adjust the zoom slider as well as the vertical and horizontal scrollbars accordingly. However, it is not recommended that you adjust the speed slider as it is not the way the game was intended. 

    When you are ready click “Start”, you will notice the GuardBots will start moving while the user’s robot will remain stationary. Before moving you will need to click on the screen (e.g. anywhere on the grid) and ensure the “Stop” button under controls is deselected (does not have a faint dotted-box around it).

    **Note 1:** In every level the GuardBots will have the black and red coloured bodies to distinguish them from the user’s  robot.

   **Note 2:** On levels where there are a lot of GuardBots (e.g. the SamusLevel), I would suggest waiting a few seconds before giving any keyboard inputs (e.g. 'w'), after having already clicking "Start" followed by anywhere on the screen to deselect "Stop". For instance, when I run the SamusLevel and give an input immediately after clicking anywhere on the screen, the GUI pop-up (that you interact with) freezes; this could be due the amount of threads that are initialized and running simultaneously, the code not being fully optimized, the DrJava IDE, etc.  
4) To control your robot you use the following keyboard inputs:
    - ‘w’ to move up
    - ‘a’ to move left
    - ‘s’ to move down
    - ‘d’ to move right
    - ‘4’ to pick "things" from the ground and place them into the user’s backpack (only if their robot and "thing" share the same intersection)
    - ‘6’ to put (remove) "things" from the user’s backpack and place them on the ground at the intersection where the key is pressed (only if their robot has "things" in its backpack).
5) If the user tries to go to the location required to complete the level before collecting all of the "things". They will receive another information dialog informing them of the current number of "things" in their backpack compared to the total that they are required to collect. Again, you can close out of the dialog by selecting “OK” or pressing the 'enter' key on your keyboard.

    ![SonicLevel - InfoDialog2](https://github.com/DylJFern/Robot-Maze/assets/128000630/4c14f32a-b3b0-44c8-aec2-ada67d6b6089)  

    Upon closing out of the dialog, the program will automatically move the user’s robot out of the location.
6) If at any point during the level the user's robot is at the same intersection as the GuardBot(s), they will 'crash' and will be presented with a confirmation dialog.

    ![SonicLevel - ConfirmDialog1](https://github.com/DylJFern/Robot-Maze/assets/128000630/8ddfbbb1-2a18-4efa-8b4b-8e5a1758d685)

    This confirmation dialog will inform the user they have been caught and will display the number of lives that remain. It will also present the user with two options: whether they want to continue playing or quit. 

    The default option is “Yes” (continue playing), if the user selects “Yes” or presses the 'enter' key on their keyboard, a new user robot will respawn at the initial (program) starting location with all the "things" they have collected thus far. If the user selects “No”, the program will close.
7) If the user successfully collects all "things" and returns to the required location, they will receive an information dialog that congratulates them and informs them they have completed the level. Upon closing out of the dialog, the program will close.

    ![SonicLevel - InfoDialog3](https://github.com/DylJFern/Robot-Maze/assets/128000630/551f9994-10e0-4140-b964-d6fac40095ce)
8)  If at any point during the level the user’s runs out of lives, an information dialog will pop-up. It states the user has run out of lives and the game is now over. Upon closing out of the dialog, the program will close. 

    ![SonicLevel - InfoDialog4](https://github.com/DylJFern/Robot-Maze/assets/128000630/d04538d3-cfa5-4853-b05c-f8d65bf91573)

## Documentation Reference
Should you need it, you can find a link to documentation [here](https://courses.cs.duke.edu/spring06/cps001/doc/becker/becker/robots/package-summary.html).

## Improvements Made & Future Considerations
As I had previously mentioned this was a project completed awhile back by me and my friends, I just never got the chance to upload it until recently. As such, you will see lines of code that are repeated (especially for the GuardBots since their paths are pre-programmed and repetitive). My intention was to fix any gameplay issues, clean up the code (to an extent), modify and include new code, but maintain the existing structure and design of what was originally created. In this way, it also helps serve as a recollection of what I have previously done and a reminder for how far I have come.

### Improvements Made
I have made many improvements to our original design intent for the sake of nostalgia, in this subsection I will list out what I have done since I had last worked on it.

1) A problem can occur when the robot receives a move message (in our case, based on keyboard input), but there is a wall in front of it. This results in a 'crash' and causes the robot to break (in other words, no longer respond). The functions to help prevent this from happening are
   ```
   .frontIsClear();
   .isFacingSouth();
   .isFacingSouth();
   .isFacingSouth();
   .isFacingSouth();
   ```
   we had used these in combination with
   ```
   .move();
   .turnRight();
   .turnLeft();
   .turnAround();
   ```
   in such a way that every time the user would attempt to move forward into a wall, the program would turn them around. Although the concept was there, this would could the movement to feel sluggish and sometimes lead to the user's robot infinitely spinning in a circle when surrounded by multiple walls. I corrected both these problems by modifying the if/else-if/else structure.

   Original
   ```
    if(this.frontIsClear())
    {
      //Key commands for when the user presses the 'w' key
      if (key == 'w')
      {
        if (this.isFacingEast())
        {
          this.turnLeft();
        }
        else if (this.isFacingSouth())
        {
          this.turnAround();
        }
        else if (this.isFacingWest())
        {
          this.turnRight();
        }
        else
        {
          this.move();
        }
      }
    }
    else
    {
      this.turnAround();
    }
   ```
   Modified
   ```
    //Key command for when the user presses the 'w' key
    if(key == 'w')
    {
      if(this.isFacingEast())
      {
        this.turnLeft();
      }
      else if(this.isFacingSouth())
      {
        this.turnAround();
      }
      else if(this.isFacingWest())
      {
        this.turnRight();
      }
      else
      {
        if(this.frontIsClear())
        {
          this.move();
        }
        else 
        {
          this.turnAround();
        }
      }
    }
   ```
2) A problem can also occur when the robot attempts to pick up a "thing" at its current intersection, that is not actually there. And when the robot attempts to drop a "thing" at its current intersection, that it does not actually have. When these events occur they also result in a 'crash' that was previously mentioned. There are many more related and variations of functions for picking and dropping things than there are for avoidance. To prevent the crash from happening, I modified the code such that it would first check to see if the user can pick "thing" or had "things" in their backpack before  reading input, as opposed to how it was done previously where it would read input and then check.
3) The JOptionPane information and confirmation dialogs provide the user with information and pose them with a yes/no option. In the program, issues arose when attempting to append strings with variables, a simple fix to this was to format the string using
   ```
   String.format();
   ```
4) Everytime the user would respawn their speed would not update, this was fixed by reinitializing
   ```
   .setSpeed();
   ```
5) Due to the time constraints previously, there were a lot of unused functions left behind that served no purpose, and a lot of the code that was either unoptimized or attempted to solve a problem which could have been better solved by utilizing more appropriate functions and/or methods listed in the becker.robots documentation. As such, I had decided to spend some time refactoring the code. A very simple example of this is a procedure to detect whether the user's robot and the GuardBot occupy the same intersection. There are many alternative ways of improving it, but just the simple act of using a more appropriate function make it appear cleaner.

   Original
   ```
   baquial.getAvenue() == dylan.getAvenue()  && baquial.getStreet() == dylan.getStreet();
   ```
   
   Modified
   ```
   baquial.getIntersection() == dylan.getIntersection();
   ```
7) When the user dies, anything they collected prior should still be in their backpack for when they respawn. An issue I encountered only recently (when doing thorough testing for possible problems) was that when the user died, even though they kept their collected "things" (assuming they have lives remaining), when they would respawn and drop their "things" (for whatever reason) the icon graphics for the "things" would disppear. I thought of various ways of correcting this issue, but the one I stuck with was to set a countThingsInBackpack() to a variable ("inventory"), but also initialize its value as 0 when respawning a new user robot. Then I could iterate through the variable; create, set the icon graphics, and have the user pick up "things" (automatically as if they respawned with them) at the intersection they would respawn at (as this information is known in advance).
8) When reviewing and fixing up the code, I had also decided it would be fun to increase the difficulty of each level. I did so by modifying the paths for almost all the GuardBots, I adjusted their speeds (and made them more variable - change throughout their pre-programmed path), as well as added more GuardBots to the "SonicLevel" and "SamusLevel". I made their movements more sporadic; however, this did require writing a lot more code (since it was done line-by-line instead of implementing functions to perform repetitive sections). But, most of their movements are no longer just a single path/route that they follow, I added multiple detours/alternate routes that the GuardBot may take if a condition is met. Additionally, for added fun I made a GuardBot pick up and move a "thing" from one location to another, only if the user has not already collected it.

### Future Considerations
This is project is not something I see myself working on again, rather it is used to serve as a placeholder for a memory that I can possibly revisit. On that note, in this subsection I had planned on providing suggestions of other implementations for anyone who may want to try this program out and make improvements.

1) As I may have mentioned, I did not want to invest too much time into refactoring this fun project. But one of the biggest things that could be improved would be better optimization of the code. For instance, the GuardBots, they recycle a lot of simple methods over and over to achieve this pre-programmed path that was laid out. But it is just lines of unnnecessary code that could be reworked and split into blocks/sections and implemented as functions.
2) Can have a JOptionPane display the (y, x) intersection the user should go to when they have collected the required amount of "things" since the coordinate pairing is only provided once, when the program first opens (and the user may forget).
3) I am unsure if this is possible, but a way to link all four levels together such that when the user completes level 1, the program prompt the user with a question of whether or not they want to proceed to the next level, replay the current level, or quit. This saves the hassle of compiling and running the current or new level each time.
4) I believe the controls interface when the program loads is part of the becker.robots package, I think it would be interesting if when the program launches, the level would automatically resize and center (if possible) without having the user to manually make adjustments to the slider.
5) In the program I had added an option for putting (or dropping) "things" on the ground; however, I did really implement any use for it. Perhaps, it could be used to make the level completion more unique by having the user drop "things" at specific locations to be able to proceed to the next level.
7) GuardBot difficulty can also be modified, instead of the pre-programmed line-by-line paths they could have alternative routes that they can follow (which I did introduce), but with the implementation of functions to simplify the code and may be a random number generator to select the path, it could make them harder to track.
8) Lastly, I was previously working on a way of modifying the user's speed based on the number of "things" they had in their backpack. Although, I eventually ended up scrapping the idea as its implementation was not a priority, but perhaps that is something to consider. 
