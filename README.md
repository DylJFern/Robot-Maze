# Robot-Maze

## Introduction
A project that me and my friends had created in high school, it utilizes the becker.robots package which until recently I did not have access to, and as such was unable to uploading the project.

After, finally downloading the necessary software and packages, I was able to play this simple game we had created, and could not help feel nostalgic. However, I soon realized it was unfinished and disrupted the intended gameplay. Due to time constraints, this was not seen as critical back then, but like everyone with nostalgic memories they like to revisit, I decided to take some time to fix problems I deemed necessary before sharing it with others.

## How Does It Work?
The user is able to play as a robot whose objective is to collect all ‘Things’ (something that can exist on an intersection) and return to a specified location in order to complete the level. Traditionally, the origin is set at (0, 0) in the bottom-left of the screen using the conventional grid format represented by (x, y) or in becker.robots terminology (streets, avenues) where streets run horizontally (East-West) and avenues run vertically (North-South). However, in our case we defined the GUI using the inverse with the origin set at (0, 0) in the top-left of the screen using (y, x) or (avenues, streets).

While attempting to collect all ‘Things’ and return to a specified location in order to complete the level, the user will have to navigate the map using keyboard inputs to control and pick/drop “Things” while avoiding enemy robots that follow a pre-programming path. 

There are 4 different levels that were designed and programmed. Each level has its own theme, as such its own graphics and layout that attempt to fit that theme. However, this excludes the ‘GuardBot’ design which will be consistent for all of the levels. The user can also expect each level to have its own difficulty associated with it (whether this difficulty increases with each level is up to interpretation), based on various factors such as:
i) The number of ‘GuardBots’ and/or modified their speeds as well as paths.
ii) The number of ‘Things’ the user would have to pick up while navigating.
iii) The map size affecting the number of safe spots and their ability to navigate.
