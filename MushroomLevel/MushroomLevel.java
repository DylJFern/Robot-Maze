/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: Main program for the MushroomLevel
 */

import becker.robots.*;
import javax.swing.JOptionPane;

public class MushroomLevel
{
  public static void main(String[] args)
  {
    //Tell the user what they need to do
    JOptionPane.showMessageDialog(null, "\nYou have three lives to collect all the things.\nWhen you have all the things go to position (16, 9).   \nGood luck!", "Level 1", JOptionPane.INFORMATION_MESSAGE);

    //Declare the initial variable(s)    
    int lives = 3;
    
    //Make the city
    City mushroomLVL = new City(30, 40);
    
    //Make the bot the player will use
    MushroomBot baquial = new MushroomBot(mushroomLVL, 16, 8, Direction.NORTH);
    baquial.setIcon(new MushroomBotDesign());
    baquial.setSpeed(20);
    
    //Create the link between this file and the "ThreadBot" files
    MushroomGuardBot1 dinith = new MushroomGuardBot1(mushroomLVL, 11, 16, Direction.NORTH);
    dinith.setIcon(new GuardBotDesign());
    MushroomGuardBot2 dylan = new MushroomGuardBot2(mushroomLVL, 11, 1, Direction.NORTH);
    dylan.setIcon(new GuardBotDesign());
    MushroomGuardBot3 william = new MushroomGuardBot3(mushroomLVL, 1, 6, Direction.EAST);
    william.setIcon(new GuardBotDesign());
    MushroomGuardBot4 bailey = new MushroomGuardBot4(mushroomLVL, 13, 5, Direction.EAST);
    bailey.setIcon(new GuardBotDesign());
    
    Thread dinithThread = new Thread(dinith);
    Thread dylanThread = new Thread(dylan);
    Thread williamThread = new Thread(william);
    Thread baileyThread = new Thread(bailey);
    
    //Create the things
    Thing Coin1 = new Thing(mushroomLVL, 12, 7);
    Coin1.setIcon(new MushroomThing());
    Thing Coin2 = new Thing(mushroomLVL, 12, 10);
    Coin2.setIcon(new MushroomThing());
    Thing Coin3 = new Thing(mushroomLVL, 14, 3);
    Coin3.setIcon(new MushroomThing());
    Thing Coin4 = new Thing(mushroomLVL, 14, 14);
    Coin4.setIcon(new MushroomThing());
    Thing Coin5 = new Thing(mushroomLVL, 8, 1);
    Coin5.setIcon(new MushroomThing());
    Thing Coin6 = new Thing(mushroomLVL, 8, 16);
    Coin6.setIcon(new MushroomThing());
    Thing Coin7 = new Thing(mushroomLVL, 1, 8);
    Coin7.setIcon(new MushroomThing());
    Thing Coin8 = new Thing(mushroomLVL, 1, 9);
    Coin8.setIcon(new MushroomThing());
    
    //Make walls for the North direction
    Wall w01 = new Wall(mushroomLVL, 1, 6, Direction.NORTH);
    Wall w02 = new Wall(mushroomLVL, 1, 7, Direction.NORTH);
    Wall w03 = new Wall(mushroomLVL, 1, 8, Direction.NORTH);
    Wall w04 = new Wall(mushroomLVL, 1, 9, Direction.NORTH);
    Wall w05 = new Wall(mushroomLVL, 1, 10, Direction.NORTH);
    Wall w06 = new Wall(mushroomLVL, 1, 11, Direction.NORTH);
    Wall w07 = new Wall(mushroomLVL, 2, 5, Direction.NORTH);
    Wall w08 = new Wall(mushroomLVL, 2, 4, Direction.NORTH);
    Wall w09 = new Wall(mushroomLVL, 2, 12, Direction.NORTH);
    Wall w010 = new Wall(mushroomLVL, 2, 13, Direction.NORTH);
    Wall w011 = new Wall(mushroomLVL, 3, 3, Direction.NORTH);
    Wall w012 = new Wall(mushroomLVL, 3, 14, Direction.NORTH);
    Wall w013 = new Wall(mushroomLVL, 4, 2, Direction.NORTH);
    Wall w014 = new Wall(mushroomLVL, 4, 15, Direction.NORTH);
    Wall w015 = new Wall(mushroomLVL, 6, 1, Direction.NORTH);
    Wall w016 = new Wall(mushroomLVL, 6, 16, Direction.NORTH);
    
    //Make walls for the West direction
    Wall w11 = new Wall(mushroomLVL, 1, 6, Direction.WEST);
    Wall w12 = new Wall(mushroomLVL, 2, 4, Direction.WEST);
    Wall w13 = new Wall(mushroomLVL, 3, 3, Direction.WEST);
    Wall w14 = new Wall(mushroomLVL, 4, 2, Direction.WEST);
    Wall w15 = new Wall(mushroomLVL, 5, 2, Direction.WEST);
    Wall w16 = new Wall(mushroomLVL, 6, 1, Direction.WEST);
    Wall w17 = new Wall(mushroomLVL, 7, 1, Direction.WEST);
    Wall w18 = new Wall(mushroomLVL, 8, 1, Direction.WEST);
    Wall w19 = new Wall(mushroomLVL, 9, 1, Direction.WEST);
    Wall w120 = new Wall(mushroomLVL, 10, 1, Direction.WEST);
    Wall w121 = new Wall(mushroomLVL, 11, 1, Direction.WEST);
    Wall w122 = new Wall(mushroomLVL, 12, 2, Direction.WEST);
    Wall w123 = new Wall(mushroomLVL, 13, 3, Direction.WEST);
    Wall w124 = new Wall(mushroomLVL, 14, 3, Direction.WEST);
    Wall w125 = new Wall(mushroomLVL, 12, 5, Direction.WEST);
    Wall w126 = new Wall(mushroomLVL, 15, 4, Direction.WEST);
    Wall w127 = new Wall(mushroomLVL, 16, 5, Direction.WEST);
    Wall w128 = new Wall(mushroomLVL, 12, 7, Direction.WEST);
    Wall w129 = new Wall(mushroomLVL, 12, 10, Direction.WEST);
    Wall w130 = new Wall(mushroomLVL, 16, 8, Direction.WEST);
    
    //Make walls for the East direction
    Wall w21 = new Wall(mushroomLVL, 1, 11, Direction.EAST);
    Wall w22 = new Wall(mushroomLVL, 2, 13, Direction.EAST);
    Wall w23 = new Wall(mushroomLVL, 3, 14, Direction.EAST);
    Wall w24 = new Wall(mushroomLVL, 4, 15, Direction.EAST);
    Wall w25 = new Wall(mushroomLVL, 5, 15, Direction.EAST);
    Wall w26 = new Wall(mushroomLVL, 6, 16, Direction.EAST);
    Wall w27 = new Wall(mushroomLVL, 7, 16, Direction.EAST);
    Wall w28 = new Wall(mushroomLVL, 8, 16, Direction.EAST);
    Wall w29 = new Wall(mushroomLVL, 9, 16, Direction.EAST);
    Wall w210 = new Wall(mushroomLVL, 10, 16, Direction.EAST);
    Wall w211 = new Wall(mushroomLVL, 11, 16, Direction.EAST);
    Wall w212 = new Wall(mushroomLVL, 12, 15, Direction.EAST);
    Wall w213 = new Wall(mushroomLVL, 13, 14, Direction.EAST);
    Wall w214 = new Wall(mushroomLVL, 14, 14, Direction.EAST);
    Wall w215 = new Wall(mushroomLVL, 12, 12, Direction.EAST);
    Wall w216 = new Wall(mushroomLVL, 15, 13, Direction.EAST);
    Wall w217 = new Wall(mushroomLVL, 16, 12, Direction.EAST);
    Wall w218 = new Wall(mushroomLVL, 12, 7, Direction.EAST);
    Wall w219 = new Wall(mushroomLVL, 12, 10, Direction.EAST);
    Wall w220 = new Wall(mushroomLVL, 16, 9, Direction.EAST);
    
    //Make walls for the South direction
    Wall w31 = new Wall(mushroomLVL, 11, 1, Direction.SOUTH);
    Wall w32 = new Wall(mushroomLVL, 11, 16, Direction.SOUTH);
    Wall w33 = new Wall(mushroomLVL, 12, 2, Direction.SOUTH);
    Wall w34 = new Wall(mushroomLVL, 12, 15, Direction.SOUTH);
    Wall w35 = new Wall(mushroomLVL, 12, 3, Direction.SOUTH);
    Wall w36 = new Wall(mushroomLVL, 12, 14, Direction.SOUTH);
    Wall w37 = new Wall(mushroomLVL, 12, 4, Direction.SOUTH);
    Wall w38 = new Wall(mushroomLVL, 12, 13, Direction.SOUTH);
    Wall w39 = new Wall(mushroomLVL, 14, 3, Direction.SOUTH);
    Wall w310 = new Wall(mushroomLVL, 14, 14, Direction.SOUTH);
    Wall w311 = new Wall(mushroomLVL, 11, 5, Direction.SOUTH);
    Wall w312 = new Wall(mushroomLVL, 11, 6, Direction.SOUTH);
    Wall w313 = new Wall(mushroomLVL, 11, 7, Direction.SOUTH);
    Wall w316 = new Wall(mushroomLVL, 11, 10, Direction.SOUTH);
    Wall w317 = new Wall(mushroomLVL, 11, 11, Direction.SOUTH);
    Wall w318 = new Wall(mushroomLVL, 11, 12, Direction.SOUTH);
    Wall w319 = new Wall(mushroomLVL, 15, 4, Direction.SOUTH);
    Wall w320 = new Wall(mushroomLVL, 15, 13, Direction.SOUTH);
    Wall w321 = new Wall(mushroomLVL, 16, 5, Direction.SOUTH);
    Wall w322 = new Wall(mushroomLVL, 16, 6, Direction.SOUTH);
    Wall w323 = new Wall(mushroomLVL, 16, 7, Direction.SOUTH);
    Wall w324 = new Wall(mushroomLVL, 16, 8, Direction.SOUTH);
    Wall w325 = new Wall(mushroomLVL, 16, 9, Direction.SOUTH);
    Wall w326 = new Wall(mushroomLVL, 16, 10, Direction.SOUTH);
    Wall w327 = new Wall(mushroomLVL, 16, 11, Direction.SOUTH);
    Wall w328 = new Wall(mushroomLVL, 16, 12, Direction.SOUTH);
    
    //Start all the robot threads to make them move
    dinithThread.start();
    dylanThread.start();
    williamThread.start();
    baileyThread.start();
    
    while(true)   
    {
      if(baquial.getStreet() == 16 && baquial.getAvenue() == 9 && baquial.countThingsInBackpack() == 8)
      {
        //If the user has the required amount of things and is at the intersection (16,9) they will complete the first level
        JOptionPane.showMessageDialog(null, "You beat the first level! Congratulations!   ", "Mushroom Level", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);       
      }
      else if(baquial.getStreet() == 16 && baquial.getAvenue() == 9 && baquial.countThingsInBackpack() != 13)
      {
        //If the user doesnt have the required amount of things and is at the intersection (16,9) they will be told to collect more things and will be moved out of that location
        String msg1 = String.format("You have collected %d/8 things. Keep collecting!   ", baquial.countThingsInBackpack());
        JOptionPane.showMessageDialog(null, msg1, "Mushroom Level", JOptionPane.INFORMATION_MESSAGE);
        baquial.turnAround();
        baquial.move();
      }
     
      //If the GuardBot(s) are at the same intersection as the MushroomBot baquial, the user's bot will crash
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
            baquial = new MushroomBot(mushroomLVL, 16, 8, Direction.NORTH, 0);
            baquial.setIcon(new MushroomBotDesign());   
            baquial.setSpeed(20);
            //Used to create things at user's respawn location with the proper icon display and place them in their backpack 
            for(int i = 0; i < inventory; inventory--)
            {
              Thing Coin = new Thing(mushroomLVL, 16, 8);
              Coin.setIcon(new MushroomThing());
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
          JOptionPane.showMessageDialog (null, "You have ran out of lives! Game over!   ", "Game Over", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }
      }
    }
  }
}








