/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: Main program for the PokeLevel
 */

import becker.robots.*;
import javax.swing.JOptionPane;

public class PokeLevel 
{ 
  public static void main(String[] args) 
  {
    //Tell the user what they need to do
    JOptionPane.showMessageDialog(null, "You have three lives to collect all the things.\nWhen you have all the things go to position (y, x) = (8, 6).   \nGood luck!", "Level 2", JOptionPane.INFORMATION_MESSAGE); 
    
    //Declare the initial variable(s)
    int lives = 3;
    
    //Make the city
    City pokeLVL = new City(40, 50);
    
    //Make the bot the player will use
    PokeBot baquial = new PokeBot(pokeLVL, 8, 7, Direction.NORTH);
    baquial.setIcon(new PokeBotDesign());
    baquial.setSpeed(20);
    
    //Create the link between this file and the "ThreadBot" files
    PokeGuardBot1 dinith = new PokeGuardBot1(pokeLVL, 6, 1, Direction.EAST);
    dinith.setIcon(new GuardBotDesign());
    PokeGuardBot2 dylan = new PokeGuardBot2(pokeLVL, 7, 3, Direction.EAST);
    dylan.setIcon(new GuardBotDesign());
    dylan.setSpeed(5);
    PokeGuardBot3 william = new PokeGuardBot3(pokeLVL, 8, 5, Direction.NORTH);
    william.setIcon(new GuardBotDesign());
    william.setSpeed(1);
    
    Thread dinithThread = new Thread(dinith);
    Thread dylanThread = new Thread(dylan);
    Thread williamThread = new Thread(william);
    
    //Create the things
    Thing Pokeball1 = new Thing(pokeLVL, 4, 5);
    Pokeball1.setIcon(new PokeThing());
    Thing Pokeball2 = new Thing(pokeLVL, 4, 8);
    Pokeball2.setIcon(new PokeThing());
    Thing Pokeball3 = new Thing(pokeLVL, 8, 3);
    Pokeball3.setIcon(new PokeThing());
    Thing Pokeball4 = new Thing(pokeLVL, 8, 10);
    Pokeball4.setIcon(new PokeThing());
    Thing Pokeball5 = new Thing(pokeLVL, 12, 5);
    Pokeball5.setIcon(new PokeThing());
    Thing Pokeball6 = new Thing(pokeLVL, 12, 6);
    Pokeball6.setIcon(new PokeThing());
    Thing Pokeball7 = new Thing(pokeLVL, 12, 7);
    Pokeball7.setIcon(new PokeThing());
    Thing Pokeball8 = new Thing(pokeLVL, 12, 8);
    Pokeball8.setIcon(new PokeThing());
    Thing Pokeball9 = new Thing(pokeLVL, 1, 5);
    Pokeball9.setIcon(new PokeThing());
    Thing Pokeball10 = new Thing(pokeLVL, 1, 6);
    Pokeball10.setIcon(new PokeThing());
    Thing Pokeball11 = new Thing(pokeLVL, 1, 7);
    Pokeball11.setIcon(new PokeThing());
    Thing Pokeball12 = new Thing(pokeLVL, 1, 8);
    Pokeball12.setIcon(new PokeThing());
    Thing Pokeball13 = new Thing(pokeLVL, 2, 3);
    Pokeball13.setIcon(new PokeThing());
    Thing Pokeball14 = new Thing(pokeLVL, 2, 10);
    Pokeball14.setIcon(new PokeThing());
    Thing Pokeball15 = new Thing(pokeLVL, 3, 2);
    Pokeball15.setIcon(new PokeThing());
    Thing Pokeball16 = new Thing(pokeLVL, 3, 11);
    Pokeball16.setIcon(new PokeThing());
    Thing Pokeball17 = new Thing(pokeLVL, 5, 1);
    Pokeball17.setIcon(new PokeThing());
    Thing Pokeball18 = new Thing(pokeLVL, 5, 12);
    Pokeball18.setIcon(new PokeThing());
    Thing Pokeball19 = new Thing(pokeLVL, 10, 2);
    Pokeball19.setIcon(new PokeThing());
    Thing Pokeball20 = new Thing(pokeLVL, 10, 11);
    Pokeball20.setIcon(new PokeThing());
    Thing Pokeball21 = new Thing(pokeLVL, 11, 3);
    Pokeball21.setIcon(new PokeThing());
    Thing Pokeball22 = new Thing(pokeLVL, 11, 10);
    Pokeball22.setIcon(new PokeThing());
    Thing Pokeball23 = new Thing(pokeLVL, 8, 4);
    Pokeball23.setIcon(new PokeThing());
    Thing Pokeball24 = new Thing(pokeLVL, 8, 9);
    Pokeball24.setIcon(new PokeThing());
    
    //Make walls for the North direction
    Wall w01 = new Wall(pokeLVL, 1, 5, Direction.NORTH);
    Wall w02 = new Wall(pokeLVL, 1, 6, Direction.NORTH);
    Wall w03 = new Wall(pokeLVL, 1, 7, Direction.NORTH);
    Wall w04 = new Wall(pokeLVL, 1, 8, Direction.NORTH);
    Wall w05 = new Wall(pokeLVL, 2, 4, Direction.NORTH);
    Wall w06 = new Wall(pokeLVL, 2, 3, Direction.NORTH);
    Wall w07 = new Wall(pokeLVL, 2, 9, Direction.NORTH);
    Wall w08 = new Wall(pokeLVL, 2, 10, Direction.NORTH);
    Wall w09 = new Wall(pokeLVL, 3, 2, Direction.NORTH);
    Wall w010 = new Wall(pokeLVL, 3, 11, Direction.NORTH);
    Wall w011 = new Wall(pokeLVL, 5, 1, Direction.NORTH);
    Wall w012 = new Wall(pokeLVL, 5, 12, Direction.NORTH);
    Wall w013 = new Wall(pokeLVL, 6, 6, Direction.NORTH);
    Wall w014 = new Wall(pokeLVL, 6, 7, Direction.NORTH);
    Wall w015 = new Wall(pokeLVL, 7, 6, Direction.NORTH);
    Wall w016 = new Wall(pokeLVL, 7, 7, Direction.NORTH);
    Wall w017 = new Wall(pokeLVL, 9, 6, Direction.NORTH);
    Wall w018 = new Wall(pokeLVL, 9, 7, Direction.NORTH);
    Wall w019 = new Wall(pokeLVL, 8, 4, Direction.NORTH);
    Wall w020 = new Wall(pokeLVL, 8, 9, Direction.NORTH);
    Wall w021 = new Wall(pokeLVL, 7, 2, Direction.NORTH);
    Wall w022 = new Wall(pokeLVL, 7, 1, Direction.NORTH);
    Wall w023 = new Wall(pokeLVL, 7, 11, Direction.NORTH);
    Wall w024 = new Wall(pokeLVL, 7, 12, Direction.NORTH);
    Wall w025 = new Wall(pokeLVL, 5, 4, Direction.NORTH);
    Wall w026 = new Wall(pokeLVL, 4, 5, Direction.NORTH);
    Wall w027 = new Wall(pokeLVL, 5, 6, Direction.NORTH);
    Wall w028 = new Wall(pokeLVL, 5, 7, Direction.NORTH);
    Wall w029 = new Wall(pokeLVL, 4, 8, Direction.NORTH);
    Wall w030 = new Wall(pokeLVL, 5, 9, Direction.NORTH);
    
    //Make walls for the West direction
    Wall w1 = new Wall(pokeLVL, 1, 5, Direction.WEST);
    Wall w2 = new Wall(pokeLVL, 2, 3, Direction.WEST);
    Wall w3 = new Wall(pokeLVL, 3, 2, Direction.WEST);
    Wall w4 = new Wall(pokeLVL, 4, 2, Direction.WEST);
    Wall w5 = new Wall(pokeLVL, 5, 1, Direction.WEST);
    Wall w6 = new Wall(pokeLVL, 6, 1, Direction.WEST);
    Wall w7 = new Wall(pokeLVL, 7, 1, Direction.WEST);
    Wall w8 = new Wall(pokeLVL, 8, 1, Direction.WEST);
    Wall w9 = new Wall(pokeLVL, 9, 2, Direction.WEST);
    Wall w10 = new Wall(pokeLVL, 10, 2, Direction.WEST);
    Wall w11 = new Wall(pokeLVL, 11, 3, Direction.WEST);
    Wall w12 = new Wall(pokeLVL, 12, 5, Direction.WEST);
    Wall w13 = new Wall(pokeLVL, 8, 2, Direction.WEST);
    Wall w14 = new Wall(pokeLVL, 9, 6, Direction.WEST);
    Wall w15 = new Wall(pokeLVL, 8, 6, Direction.WEST);
    Wall w16 = new Wall(pokeLVL, 6, 6, Direction.WEST);
    Wall w17 = new Wall(pokeLVL, 7, 5, Direction.WEST);
    Wall w18 = new Wall(pokeLVL, 8, 4, Direction.WEST);
    Wall w19 = new Wall(pokeLVL, 8, 11, Direction.WEST);
    Wall w110 = new Wall(pokeLVL, 7, 11, Direction.WEST);
    Wall w111 = new Wall(pokeLVL, 6, 4, Direction.WEST);
    Wall w112 = new Wall(pokeLVL, 5, 4, Direction.WEST);
    Wall w113 = new Wall(pokeLVL, 4, 5, Direction.WEST);
    Wall w114 = new Wall(pokeLVL, 4 ,8, Direction.WEST);
    
    //Make walls for the East direction
    Wall w21 = new Wall(pokeLVL, 1, 8, Direction.EAST);
    Wall w22 = new Wall(pokeLVL, 2, 10, Direction.EAST);
    Wall w23 = new Wall(pokeLVL, 3, 11, Direction.EAST);
    Wall w24 = new Wall(pokeLVL, 4, 11, Direction.EAST);
    Wall w25 = new Wall(pokeLVL, 5, 12, Direction.EAST);
    Wall w26 = new Wall(pokeLVL, 6, 12, Direction.EAST);
    Wall w27 = new Wall(pokeLVL, 7, 12, Direction.EAST);
    Wall w28 = new Wall(pokeLVL, 8, 12, Direction.EAST);
    Wall w29 = new Wall(pokeLVL, 9, 11, Direction.EAST);
    Wall w210 = new Wall(pokeLVL, 10, 11, Direction.EAST);
    Wall w211 = new Wall(pokeLVL, 11, 10, Direction.EAST);
    Wall w212 = new Wall(pokeLVL, 12, 8, Direction.EAST);
    Wall w213 = new Wall(pokeLVL, 8, 11, Direction.EAST);
    Wall w214 = new Wall(pokeLVL, 9, 7, Direction.EAST);
    Wall w215 = new Wall(pokeLVL, 8, 7, Direction.EAST);
    Wall w216 = new Wall(pokeLVL, 6, 7, Direction.EAST);
    Wall w217 = new Wall(pokeLVL, 7, 8, Direction.EAST);
    Wall w218 = new Wall(pokeLVL, 8, 9, Direction.EAST);
    Wall w219 = new Wall(pokeLVL, 8, 2, Direction.EAST);
    Wall w220 = new Wall(pokeLVL, 7, 2, Direction.EAST);
    Wall w221 = new Wall(pokeLVL, 4, 5, Direction.EAST);
    Wall w222 = new Wall(pokeLVL, 4, 8, Direction.EAST);
    Wall w223 = new Wall(pokeLVL, 5, 9, Direction.EAST);
    Wall w224 = new Wall(pokeLVL, 6, 9, Direction.EAST);
    
    //Make walls for the South direction
    Wall w31 = new Wall(pokeLVL, 8, 1, Direction.SOUTH);
    Wall w32 = new Wall(pokeLVL, 8, 12, Direction.SOUTH);
    Wall w33 = new Wall(pokeLVL, 10, 2, Direction.SOUTH);
    Wall w34 = new Wall(pokeLVL, 10, 11, Direction.SOUTH);
    Wall w35 = new Wall(pokeLVL, 11, 3, Direction.SOUTH);
    Wall w36 = new Wall(pokeLVL, 11, 4, Direction. SOUTH);
    Wall w37 = new Wall(pokeLVL, 11, 10, Direction.SOUTH);
    Wall w38 = new Wall(pokeLVL, 11, 9, Direction.SOUTH);
    Wall w39 = new Wall(pokeLVL, 12, 5, Direction.SOUTH);
    Wall w310 = new Wall(pokeLVL, 12, 6, Direction.SOUTH);
    Wall w311 = new Wall(pokeLVL, 12, 7, Direction.SOUTH);
    Wall w312 = new Wall(pokeLVL, 12, 8, Direction.SOUTH);
    Wall w313 = new Wall(pokeLVL, 7, 1, Direction.SOUTH);
    Wall w314 = new Wall(pokeLVL, 7, 12, Direction.SOUTH);
    Wall w315 = new Wall(pokeLVL, 8, 2, Direction.SOUTH);
    Wall w316 = new Wall(pokeLVL, 8, 4, Direction.SOUTH);
    Wall w317 = new Wall(pokeLVL, 8, 5, Direction.SOUTH);
    Wall w318 = new Wall(pokeLVL, 8, 11, Direction.SOUTH);
    Wall w319 = new Wall(pokeLVL, 8, 9, Direction.SOUTH);
    Wall w320 = new Wall(pokeLVL, 8, 8, Direction.SOUTH);
    Wall w321 = new Wall(pokeLVL, 9, 6, Direction.SOUTH);
    Wall w322 = new Wall(pokeLVL, 9, 7, Direction.SOUTH);
    
    //Start all the robot threads to make them move 
    dinithThread.start();  
    dylanThread.start();  
    williamThread.start();
    
    while(true)
    {
      if(baquial.getStreet() == 8 && baquial.getAvenue() == 6 && baquial.countThingsInBackpack() == 24)
      {
        //If the user has the required amount of things and is at the intersection (8,6) they will complete the second level
        JOptionPane.showMessageDialog(null, "You beat the second level! Congratulations!   ", "Poke Level", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
      }
      else if(baquial.getStreet() == 8 && baquial.getAvenue() == 6 && baquial.countThingsInBackpack() != 24)
      {
        //If the user doesnt have the required amount of things and is at the intersection (8,6) they will be told to collect more things and will be moved out of that location
        String msg1 = String.format("You have collected %d/24 things. Keep collecting!   ", baquial.countThingsInBackpack());
        JOptionPane.showMessageDialog(null, msg1, "Poke Level", JOptionPane.INFORMATION_MESSAGE);
        baquial.turnAround();
        baquial.move();
      }
           
      //If the GuardBot(s) are at the same intersection as the PokeBot baquial, the bot will "crash"
      if(baquial.getIntersection() == william.getIntersection()
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
            baquial = new PokeBot(pokeLVL, 8, 7, Direction.NORTH, 0);
            baquial.setIcon(new PokeBotDesign());   
            baquial.setSpeed(20);
            //Used to create things at user's respawn location with the proper icon display and place them in their backpack 
            for(int i = 0; i < inventory; inventory--)
            {
              Thing Pokeball = new Thing(pokeLVL, 8, 7);
              Pokeball.setIcon(new PokeThing());
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







