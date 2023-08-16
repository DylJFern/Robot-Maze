/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: Main program for the SonicLevel
 */

import becker.robots.*;
import javax.swing.JOptionPane;

public class SonicLevel 
{
  public static void main(String[] args) 
  {
    //Tell the user what they need to do
    JOptionPane.showMessageDialog(null, "\nYou have three lives to collect all the things.\nWhen you have all the things go to position (11, 11).   \nGood luck!", "Level 3", JOptionPane.INFORMATION_MESSAGE); 
    
    //Declare the initial variable(s)
    int lives = 3;
    
    //Make the city  
    City sonicLVL = new City(40, 50);
    
    //Make the bot the player will use  
    SonicBot baquial = new SonicBot(sonicLVL, 11, 21, Direction.NORTH);
    baquial.setIcon(new SonicBotDesign());
    baquial.setSpeed(20);
    
    //Create the link between this file and the "ThreadBot" files 
    SonicGuardBot1 bailey = new SonicGuardBot1(sonicLVL, 2, 6, Direction.EAST);  
    bailey.setIcon(new GuardBotDesign());
    SonicGuardBot2 dinith = new SonicGuardBot2(sonicLVL, 12, 19, Direction.WEST);  
    dinith.setIcon(new GuardBotDesign());
    SonicGuardBot3 william = new SonicGuardBot3(sonicLVL, 15, 3, Direction.NORTH);
    william.setIcon(new GuardBotDesign());
    SonicGuardBot4 dylan = new SonicGuardBot4(sonicLVL, 5, 10, Direction.EAST);
    dylan.setIcon(new GuardBotDesign());
    
    Thread baileyThread = new Thread(bailey); 
    Thread dinithThread = new Thread(dinith);  
    Thread williamThread = new Thread(william); 
    Thread dylanThread = new Thread(dylan);
    
    //Create the things
    Thing Ring1 = new Thing(sonicLVL, 13, 10);
    Ring1.setIcon(new SonicThing());
    Thing Ring2 = new Thing(sonicLVL, 5, 2);
    Ring2.setIcon(new SonicThing());
    Thing Ring3 = new Thing(sonicLVL, 15, 1);
    Ring3.setIcon(new SonicThing());
    Thing Ring4 = new Thing(sonicLVL, 12, 17);
    Ring4.setIcon(new SonicThing());
    Thing Ring5 = new Thing(sonicLVL, 1, 9);
    Ring5.setIcon(new SonicThing());
    Thing Ring6 = new Thing(sonicLVL, 2, 8);
    Ring6.setIcon(new SonicThing());
    Thing Ring7 = new Thing(sonicLVL, 22, 4);
    Ring7.setIcon(new SonicThing());
    Thing Ring8 = new Thing(sonicLVL, 22, 13);
    Ring8.setIcon(new SonicThing());
    Thing Ring9 = new Thing(sonicLVL, 22, 14);
    Ring9.setIcon(new SonicThing());
    Thing Ring10 = new Thing(sonicLVL, 22, 15);
    Ring10.setIcon(new SonicThing());
    Thing Ring11 = new Thing(sonicLVL, 22, 16);
    Ring11.setIcon(new SonicThing());
    Thing Ring12 = new Thing(sonicLVL, 1, 8);
    Ring12.setIcon(new SonicThing());
    Thing Ring13 = new Thing(sonicLVL, 1, 10);
    Ring13.setIcon(new SonicThing());
    
    //Make walls for the North directions 
    Wall w01 = new Wall(sonicLVL, 1, 7, Direction.NORTH);
    Wall w02 = new Wall(sonicLVL, 1, 8, Direction.NORTH);
    Wall w03 = new Wall(sonicLVL, 1, 9, Direction.NORTH);
    Wall w04 = new Wall(sonicLVL, 1, 10, Direction.NORTH);
    Wall w05 = new Wall(sonicLVL, 1, 11, Direction.NORTH);
    Wall w06 = new Wall(sonicLVL, 2, 6, Direction.NORTH);
    Wall w07 = new Wall(sonicLVL, 2, 12, Direction.NORTH);
    Wall w08 = new Wall(sonicLVL, 2, 13, Direction.NORTH);
    Wall w09 = new Wall(sonicLVL, 3, 5, Direction.NORTH);
    Wall w010 = new Wall(sonicLVL, 3, 4, Direction.NORTH);
    Wall w011 = new Wall(sonicLVL, 3, 14, Direction.NORTH);
    Wall w012 = new Wall(sonicLVL, 3, 15, Direction.NORTH);
    Wall w013 = new Wall(sonicLVL, 4, 3, Direction.NORTH);
    Wall w014 = new Wall(sonicLVL, 4, 16, Direction.NORTH);
    Wall w015 = new Wall(sonicLVL, 5, 2, Direction.NORTH);
    Wall w016 = new Wall(sonicLVL, 4, 17, Direction.NORTH);
    Wall w017 = new Wall(sonicLVL, 9, 4, Direction.NORTH);
    Wall w018 = new Wall(sonicLVL, 10, 3, Direction.NORTH);
    Wall w019 = new Wall(sonicLVL, 11, 2, Direction.NORTH);
    Wall w020 = new Wall(sonicLVL, 13, 1, Direction.NORTH);
    Wall w021 = new Wall(sonicLVL, 6, 18, Direction.NORTH);
    Wall w022 = new Wall(sonicLVL, 7, 19, Direction.NORTH);
    Wall w023 = new Wall(sonicLVL, 7, 20, Direction.NORTH);
    Wall w024 = new Wall(sonicLVL, 8, 21, Direction.NORTH);
    Wall w025 = new Wall(sonicLVL, 17, 5, Direction.NORTH);
    Wall w026 = new Wall(sonicLVL, 19, 4, Direction.NORTH);
    Wall w027 = new Wall(sonicLVL, 2, 8, Direction.NORTH);
    Wall w028 = new Wall(sonicLVL, 2, 10, Direction.NORTH);
    Wall w029 = new Wall(sonicLVL, 3, 7, Direction.NORTH);
    Wall w030 = new Wall(sonicLVL, 3, 11, Direction.NORTH);
    Wall w031 = new Wall(sonicLVL, 8, 20, Direction.NORTH);
    Wall w032 = new Wall(sonicLVL, 8, 19, Direction.NORTH);
    Wall w033 = new Wall(sonicLVL, 11, 18, Direction.NORTH);
    Wall w034 = new Wall(sonicLVL, 12, 17, Direction.NORTH);
    Wall w035 = new Wall(sonicLVL, 11, 16, Direction.NORTH);
    Wall w036 = new Wall(sonicLVL, 10, 15, Direction.NORTH);
    Wall w037 = new Wall(sonicLVL, 8, 14, Direction.NORTH);
    Wall w038 = new Wall(sonicLVL, 7, 13, Direction.NORTH);
    Wall w039 = new Wall(sonicLVL, 7, 12, Direction.NORTH);
    Wall w040 = new Wall(sonicLVL, 7, 11, Direction.NORTH);
    Wall w041 = new Wall(sonicLVL, 7, 10, Direction.NORTH);
    Wall w042 = new Wall(sonicLVL, 8, 9, Direction.NORTH);
    Wall w043 = new Wall(sonicLVL, 14, 15, Direction.NORTH);
    Wall w044 = new Wall(sonicLVL, 4, 12, Direction.NORTH);
    Wall w045 = new Wall(sonicLVL, 17, 12, Direction.NORTH);
    Wall w046 = new Wall(sonicLVL, 18, 13, Direction.NORTH);
    Wall w047 = new Wall(sonicLVL, 18, 14, Direction.NORTH);
    Wall w048 = new Wall(sonicLVL, 5, 10, Direction.NORTH);
    Wall w049 = new Wall(sonicLVL, 6, 9, Direction.NORTH);
    Wall w050 = new Wall(sonicLVL, 9, 11, Direction.NORTH);
    Wall w051 = new Wall(sonicLVL, 9, 12, Direction.NORTH);
    Wall w052 = new Wall(sonicLVL, 11, 11, Direction.NORTH);
    Wall w146 = new Wall(sonicLVL, 14, 11, Direction.NORTH);
    Wall w147 = new Wall(sonicLVL, 14, 12, Direction.NORTH);
    
    //Make walls for the West directions
    Wall w1 = new Wall(sonicLVL, 1, 7, Direction.WEST);
    Wall w2 = new Wall(sonicLVL, 2, 6, Direction.WEST);
    Wall w3 = new Wall(sonicLVL, 3, 4, Direction.WEST);
    Wall w4 = new Wall(sonicLVL, 4, 3, Direction.WEST);
    Wall w5 = new Wall(sonicLVL, 5, 2, Direction.WEST);
    Wall w6 = new Wall(sonicLVL, 6, 3, Direction.WEST);
    Wall w7 = new Wall(sonicLVL, 7, 4, Direction.WEST);
    Wall w8 = new Wall(sonicLVL, 8, 5, Direction.WEST);
    Wall w9 = new Wall(sonicLVL, 9, 4, Direction.WEST);
    Wall w10 = new Wall(sonicLVL, 10, 3, Direction.WEST);
    Wall w11 = new Wall(sonicLVL, 11, 2, Direction.WEST);
    Wall w12 = new Wall(sonicLVL, 12, 2, Direction.WEST);
    Wall w13 = new Wall(sonicLVL, 13, 1, Direction.WEST);
    Wall w14 = new Wall(sonicLVL, 14, 1, Direction.WEST);
    Wall w15 = new Wall(sonicLVL, 15, 1, Direction.WEST);
    Wall w16 = new Wall(sonicLVL, 16, 6, Direction.WEST);
    Wall w17 = new Wall(sonicLVL, 17, 5, Direction.WEST);
    Wall w18 = new Wall(sonicLVL, 18, 5, Direction.WEST);
    Wall w19 = new Wall(sonicLVL, 19, 4, Direction.WEST);
    Wall w110 = new Wall(sonicLVL, 20, 4, Direction.WEST);
    Wall w111 = new Wall(sonicLVL, 21, 4, Direction.WEST);
    Wall w112 = new Wall(sonicLVL, 22, 4, Direction.WEST);
    Wall w113 = new Wall(sonicLVL, 21, 10, Direction.WEST);
    Wall w114 = new Wall(sonicLVL, 22, 13, Direction.WEST);
    Wall w115 = new Wall(sonicLVL, 1, 9, Direction.WEST);
    Wall w116 = new Wall(sonicLVL, 2, 8, Direction.WEST);
    Wall w118 = new Wall(sonicLVL, 8, 19, Direction.WEST);
    Wall w119 = new Wall(sonicLVL, 9, 19, Direction.WEST);
    Wall w120 = new Wall(sonicLVL, 10, 19, Direction.WEST);
    Wall w121 = new Wall(sonicLVL, 11, 18, Direction.WEST);
    Wall w122 = new Wall(sonicLVL, 7, 10, Direction.WEST);
    Wall w123 = new Wall(sonicLVL, 8, 9, Direction.WEST);
    Wall w124 = new Wall(sonicLVL, 9, 9, Direction.WEST);
    Wall w125 = new Wall(sonicLVL, 10, 9, Direction.WEST);
    Wall w126 = new Wall(sonicLVL, 11, 9, Direction.WEST);
    Wall w127 = new Wall(sonicLVL, 12, 10, Direction.WEST);
    Wall w128 = new Wall(sonicLVL, 13, 10, Direction.WEST);
    Wall w129 = new Wall(sonicLVL, 14, 11, Direction.WEST);
    Wall w130 = new Wall(sonicLVL, 3, 7, Direction.WEST);
    Wall w131 = new Wall(sonicLVL, 4, 7, Direction.WEST);
    Wall w132 = new Wall(sonicLVL, 5, 7, Direction.WEST);
    Wall w133 = new Wall(sonicLVL, 6, 7, Direction.WEST);
    Wall w134 = new Wall(sonicLVL, 7, 7, Direction.WEST);
    Wall w135 = new Wall(sonicLVL, 17, 12, Direction.WEST);
    Wall w136 = new Wall(sonicLVL, 18, 13, Direction.WEST);
    Wall w137 = new Wall(sonicLVL, 3, 10, Direction.WEST);
    Wall w138 = new Wall(sonicLVL, 4, 11, Direction.WEST);
    Wall w139 = new Wall(sonicLVL, 5, 10, Direction.WEST);
    Wall w140 = new Wall(sonicLVL, 6, 9, Direction.WEST);
    Wall w141 = new Wall(sonicLVL, 2, 9, Direction.WEST);
    Wall w142 = new Wall(sonicLVL, 9, 11, Direction.WEST);
    Wall w143 = new Wall(sonicLVL, 10, 11, Direction.WEST);
    Wall w144 = new Wall(sonicLVL, 12, 11, Direction.WEST);
    Wall w145 = new Wall(sonicLVL, 13, 11, Direction.WEST);
    
    //Make walls for the East directions
    Wall w21 = new Wall(sonicLVL, 1, 11, Direction.EAST);
    Wall w22 = new Wall(sonicLVL, 2, 13, Direction.EAST);
    Wall w23 = new Wall(sonicLVL, 3, 15, Direction.EAST);
    Wall w24 = new Wall(sonicLVL, 4, 17, Direction.EAST);
    Wall w25 = new Wall(sonicLVL, 5, 17, Direction.EAST);
    Wall w26 = new Wall(sonicLVL, 6, 18, Direction.EAST);
    Wall w27 = new Wall(sonicLVL, 7, 20, Direction.EAST);
    Wall w28 = new Wall(sonicLVL, 8, 21, Direction.EAST);
    Wall w29 = new Wall(sonicLVL, 9, 21, Direction.EAST);
    Wall w210 = new Wall(sonicLVL, 10, 21, Direction.EAST);
    Wall w211 = new Wall(sonicLVL, 11, 21, Direction.EAST);
    Wall w212 = new Wall(sonicLVL, 12, 20, Direction.EAST);
    Wall w213 = new Wall(sonicLVL, 13, 20, Direction.EAST);
    Wall w214 = new Wall(sonicLVL, 14, 20, Direction.EAST);
    Wall w215 = new Wall(sonicLVL, 15, 20, Direction.EAST);
    Wall w216 = new Wall(sonicLVL, 16, 20, Direction.EAST);
    Wall w217 = new Wall(sonicLVL, 17, 20, Direction.EAST);
    Wall w218 = new Wall(sonicLVL, 18, 20, Direction.EAST);
    Wall w219 = new Wall(sonicLVL, 22, 4, Direction.EAST);
    Wall w220 = new Wall(sonicLVL, 21, 6, Direction.EAST);
    Wall w221 = new Wall(sonicLVL, 22, 16, Direction.EAST);
    Wall w222 = new Wall(sonicLVL, 21, 18, Direction.EAST);
    Wall w223 = new Wall(sonicLVL, 20, 19, Direction.EAST);
    Wall w224 = new Wall(sonicLVL, 19, 19, Direction.EAST);
    Wall w225 = new Wall(sonicLVL, 1, 9, Direction.EAST);
    Wall w226 = new Wall(sonicLVL, 2, 10, Direction.EAST);
    Wall w227 = new Wall(sonicLVL, 11, 20, Direction.EAST);
    Wall w228 = new Wall(sonicLVL, 10, 20, Direction.EAST);
    Wall w229 = new Wall(sonicLVL, 9, 20, Direction.EAST);
    Wall w230 = new Wall(sonicLVL, 11, 16, Direction.EAST);
    Wall w231 = new Wall(sonicLVL, 10, 15, Direction.EAST);
    Wall w232 = new Wall(sonicLVL, 9, 14, Direction.EAST);
    Wall w233 = new Wall(sonicLVL, 8, 14, Direction.EAST);
    Wall w234 = new Wall(sonicLVL, 7, 13, Direction.EAST);
    Wall w235 = new Wall(sonicLVL, 14, 14, Direction.EAST);
    Wall w236 = new Wall(sonicLVL, 13, 15, Direction.EAST);
    Wall w237 = new Wall(sonicLVL, 12, 19, Direction.EAST);
    Wall w238 = new Wall(sonicLVL, 3, 11, Direction.EAST);
    Wall w239 = new Wall(sonicLVL, 4, 12, Direction.EAST);
    Wall w240 = new Wall(sonicLVL, 17, 12, Direction.EAST);
    Wall w241 = new Wall(sonicLVL, 18, 14, Direction.EAST);
    Wall w242 = new Wall(sonicLVL, 14, 12, Direction.EAST);
    Wall w243 = new Wall(sonicLVL, 13, 12, Direction.EAST);
    Wall w244 = new Wall(sonicLVL, 12, 12, Direction.EAST);
    Wall w245 = new Wall(sonicLVL, 11, 12, Direction.EAST);
    Wall w246 = new Wall(sonicLVL, 10, 12, Direction.EAST);
    Wall w247 = new Wall(sonicLVL, 9, 12, Direction.EAST);
    Wall w248 = new Wall(sonicLVL, 11, 11, Direction.EAST);
    
    //Make walls for the South directions
    Wall w31 = new Wall(sonicLVL, 5, 2, Direction.SOUTH);
    Wall w32 = new Wall(sonicLVL, 6, 3, Direction.SOUTH);
    Wall w33 = new Wall(sonicLVL, 7, 4, Direction.SOUTH);
    Wall w34 = new Wall(sonicLVL, 11, 21, Direction.SOUTH);
    Wall w35 = new Wall(sonicLVL, 18, 20, Direction.SOUTH);
    Wall w36 = new Wall(sonicLVL, 15, 1, Direction.SOUTH);
    Wall w37 = new Wall(sonicLVL, 15, 2, Direction.SOUTH);
    Wall w38 = new Wall(sonicLVL, 15, 3, Direction.SOUTH);
    Wall w39 = new Wall(sonicLVL, 15, 4, Direction.SOUTH);
    Wall w310 = new Wall(sonicLVL, 15, 5, Direction.SOUTH);
    Wall w311 = new Wall(sonicLVL, 22, 4, Direction.SOUTH);
    Wall w312 = new Wall(sonicLVL, 21, 5, Direction.SOUTH);
    Wall w313 = new Wall(sonicLVL, 21, 6, Direction.SOUTH);
    Wall w314 = new Wall(sonicLVL, 20, 7, Direction.SOUTH);
    Wall w315 = new Wall(sonicLVL, 20, 8, Direction.SOUTH);
    Wall w317 = new Wall(sonicLVL, 20, 9, Direction.SOUTH);
    Wall w318 = new Wall(sonicLVL, 21, 10, Direction.SOUTH);
    Wall w319 = new Wall(sonicLVL, 21, 11, Direction.SOUTH);
    Wall w320 = new Wall(sonicLVL, 21, 12, Direction.SOUTH);
    Wall w321 = new Wall(sonicLVL, 22, 13, Direction.SOUTH);
    Wall w322 = new Wall(sonicLVL, 22, 14, Direction.SOUTH);
    Wall w323 = new Wall(sonicLVL, 22, 15, Direction.SOUTH);
    Wall w324 = new Wall(sonicLVL, 22, 16, Direction.SOUTH);
    Wall w325 = new Wall(sonicLVL, 21, 17, Direction.SOUTH);
    Wall w326 = new Wall(sonicLVL, 21, 18, Direction.SOUTH);
    Wall w327 = new Wall(sonicLVL, 20, 19, Direction.SOUTH);
    Wall w328 = new Wall(sonicLVL, 11, 9, Direction.SOUTH);
    Wall w329 = new Wall(sonicLVL, 13, 10, Direction.SOUTH);
    Wall w330 = new Wall(sonicLVL, 14, 11, Direction.SOUTH);
    Wall w331 = new Wall(sonicLVL, 14, 12, Direction.SOUTH);
    Wall w332 = new Wall(sonicLVL, 14, 13, Direction.SOUTH);
    Wall w333 = new Wall(sonicLVL, 14, 14, Direction.SOUTH);
    Wall w334 = new Wall(sonicLVL, 12, 16, Direction.SOUTH);
    Wall w335 = new Wall(sonicLVL, 12, 17, Direction.SOUTH);
    Wall w336 = new Wall(sonicLVL, 12, 18, Direction.SOUTH);
    Wall w337 = new Wall(sonicLVL, 12, 19, Direction.SOUTH);
    Wall w338 = new Wall(sonicLVL, 17, 12, Direction.SOUTH);
    Wall w339 = new Wall(sonicLVL, 18, 13, Direction.SOUTH);
    Wall w340 = new Wall(sonicLVL, 18, 14, Direction.SOUTH);
    Wall w341 = new Wall(sonicLVL, 2, 9, Direction.SOUTH);
    Wall w342 = new Wall(sonicLVL, 3, 10, Direction.SOUTH);
    Wall w343 = new Wall(sonicLVL, 11, 11, Direction.SOUTH);
    Wall w345 = new Wall(sonicLVL, 9, 11, Direction.SOUTH);
    Wall w346 = new Wall(sonicLVL, 9, 12, Direction.SOUTH);
    
    //Start all the robot threads to make them move 
    baileyThread.start(); 
    dinithThread.start(); 
    williamThread.start();  
    dylanThread.start();
    
    while(true) 
    { 
      if(baquial.getStreet() == 11 && baquial.getAvenue() == 11 && baquial.countThingsInBackpack() == 13)
      {
        //If the user has the required amount of things and is at the intersection (11,11) they will complete the third level
        JOptionPane.showMessageDialog(null, "You beat the third level! Congratulations!   ", "Sonic Level", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
      }
      else if(baquial.getStreet() == 11 && baquial.getAvenue() == 11 && baquial.countThingsInBackpack() != 13)
      {
        //If the user doesnt have the required amount of things and is at the intersection (11,11) they will be told to collect more things and will be moved out of that location
        String msg1 = String.format("You have collected %d/13 things. Keep collecting!   ", baquial.countThingsInBackpack());
        JOptionPane.showMessageDialog(null, msg1, "Sonic Level", JOptionPane.INFORMATION_MESSAGE);
        baquial.turnAround();
        baquial.move();
      }
      
      //If the GuardBot(s) are at the same intersection as the SonicBot baquial, the bot will "crash"
      if(baquial.getIntersection() == bailey.getIntersection()
           || baquial.getIntersection() == william.getIntersection()
           || baquial.getIntersection() == dinith.getIntersection()
           || baquial.getIntersection() == dylan.getIntersection())
      {
        int inventory = baquial.countThingsInBackpack();
        baquial.crash();  
        lives--;
        
        //If the user has not died 3 times yet
        if(lives != 0) 
        {
          //An option dialog will popup each time the user dies asking if they would like to continue playing or quit the game
          String msg2 = String.format("You have been caught!\nWould you like to continue?\nOnly %d lives remain!", lives);
          int option = JOptionPane.showConfirmDialog(null, msg2, "Continue Playing?", JOptionPane.YES_NO_OPTION);
          
          //If the option is yes, the user will respawn
          if(option == JOptionPane.YES_OPTION) 
          {
            //Set numThingsInBackpack = 0 to allow user to respawn with no items in backpack
            baquial = new SonicBot(sonicLVL, 11, 21, Direction.NORTH, 0);
            baquial.setIcon(new SonicBotDesign());   
            baquial.setSpeed(20);
            //Used to create things at user's respawn location with the proper icon display and place them in their backpack 
            for(int i = 0; i < inventory; inventory--)
            {
              Thing Ring = new Thing(sonicLVL, 11, 21);
              Ring.setIcon(new SonicThing());
              baquial.pickThing();
            }
          }
          //If the option is no, the program will quit
          else 
          {
            System.exit(0);
          } 
        }
        //If the user has no lives left, they will be informed the game is over and the program will close
        else if(lives == 0) 
        {
          JOptionPane.showMessageDialog (null, "You have have ran our of lives! Game over!   ", "Game over", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }
      }
    }
  }
}
