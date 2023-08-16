/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: Main program for the SamusLevel
 */

import becker.robots.*;
import javax.swing.JOptionPane;

public class SamusLevel
{
  public static void main(String[] args)
  {
    //Tell the user what they need to do
    String msg1 = String.format("You have three lives to collect all the things.\nWhen you have all the things go to position (y, x) = (13, 22).   \nWatch out for GuardBots that can turn invisible!\nGood luck!");
    JOptionPane.showMessageDialog(null, msg1, "Level 4", JOptionPane.INFORMATION_MESSAGE); 
    
    //Declare the initial variable(s)
    int lives = 3;
    
    //Make the city
    City samusLVL = new City(50, 60);
    
    //Make the bot the player will use  
    SamusBot baquial = new SamusBot(samusLVL, 12, 22, Direction.WEST);
    baquial.setIcon(new SamusBotDesign());
    baquial.setSpeed(20);
    
    //Create the link between this file and the “ThreadBot” files
    SamusGuardBot1 bailey = new SamusGuardBot1(samusLVL, 2, 6, Direction.EAST);
    bailey.setIcon( new GuardBotDesign());
    SamusGuardBot2 william = new SamusGuardBot2(samusLVL, 5, 3, Direction.EAST);
    william.setIcon(new GuardBotDesign());
    SamusGuardBot3 dinith = new SamusGuardBot3(samusLVL, 5, 14, Direction.WEST);
    dinith.setIcon(new GuardBotDesign());
    dinith.setSpeed(10);
    SamusGuardBot4 dylan = new SamusGuardBot4(samusLVL, 12, 11, Direction.EAST);
    dylan.setIcon(new GuardBotDesign());
    dylan.setSpeed(4);
    SamusGuardBot5 paul = new SamusGuardBot5(samusLVL, 11, 11, Direction.WEST);
    paul.setIcon(new GuardBotDesign());
    SamusGuardBot6 seewin = new SamusGuardBot6(samusLVL, 29, 0, Direction.SOUTH);
    seewin.setIcon(new GuardBotDesign());
    seewin.setSpeed(12);
    SamusGuardBot7 tiago = new SamusGuardBot7(samusLVL, 18, 4, Direction.EAST);
    tiago.setIcon(new GuardBotDesign());  
    SamusGuardBot8 diana = new SamusGuardBot8(samusLVL, 33, 14, Direction.SOUTH);
    diana.setIcon(new GuardBotDesign());
    SamusGuardBot9 matthew = new SamusGuardBot9(samusLVL, 20, 5, Direction.SOUTH);
    matthew.setIcon(new InvisibleGuardBotDesign());
    matthew.setSpeed(20);
    
    Thread baileyThread = new Thread(bailey);
    Thread williamThread = new Thread(william);
    Thread dinithThread = new Thread(dinith);
    Thread dylanThread = new Thread(dylan);
    Thread paulThread = new Thread(paul);
    Thread seewinThread = new Thread(seewin);
    Thread tiagoThread = new Thread(tiago);
    Thread dianaThread = new Thread(diana);
    Thread matthewThread = new Thread(matthew);
    
    //Create the things
    Thing Mine1 = new Thing(samusLVL, 34, 15);
    Mine1.setIcon(new SamusThing());
    Thing Mine2 = new Thing(samusLVL, 32, 0);
    Mine2.setIcon(new SamusThing());
    Thing Mine3 = new Thing(samusLVL, 33, 1);
    Mine3.setIcon(new SamusThing());
    Thing Mine4 = new Thing(samusLVL, 34, 2);
    Mine4.setIcon(new SamusThing());
    Thing Mine5 = new Thing(samusLVL, 35, 3);
    Mine5.setIcon(new SamusThing());
    Thing Mine6 = new Thing(samusLVL, 36, 4);
    Mine6.setIcon(new SamusThing());
    Thing Mine7 = new Thing(samusLVL, 1, 9);
    Mine7.setIcon(new SamusThing());
    Thing Mine8 = new Thing(samusLVL, 7, 14);
    Mine8.setIcon(new SamusThing());
    Thing Mine9 = new Thing(samusLVL, 6, 3);
    Mine9.setIcon(new SamusThing());
    Thing Mine10 = new Thing(samusLVL, 19, 4);
    Mine10.setIcon(new SamusThing());
    Thing Mine11 = new Thing(samusLVL, 13, 11);
    Mine11.setIcon(new SamusThing());
    
    //Make walls for the North direction
    Wall w1 = new Wall(samusLVL, 1, 8, Direction.NORTH);
    Wall w2 = new Wall(samusLVL, 1, 9, Direction.NORTH);
    Wall w3 = new Wall(samusLVL, 1, 10, Direction.NORTH);
    Wall w4 = new Wall(samusLVL, 2, 7, Direction.NORTH);
    Wall w5 = new Wall(samusLVL, 2, 6, Direction.NORTH);
    Wall w6 = new Wall(samusLVL, 2, 11, Direction.NORTH);
    Wall w7 = new Wall(samusLVL, 2, 12, Direction.NORTH);
    Wall w8 = new Wall(samusLVL, 3, 5, Direction.NORTH);
    Wall w9 = new Wall(samusLVL, 3, 13, Direction.NORTH);
    Wall w10 = new Wall(samusLVL, 4, 4, Direction.NORTH);
    Wall w11 = new Wall(samusLVL, 4, 14, Direction.NORTH);
    Wall w12 = new Wall(samusLVL, 5, 3, Direction.NORTH);
    Wall w13 = new Wall(samusLVL, 6, 15, Direction.NORTH);
    Wall w14 = new Wall(samusLVL, 10, 3, Direction.NORTH);
    Wall w15 = new Wall(samusLVL, 10, 16, Direction.NORTH);
    Wall w16 = new Wall(samusLVL, 10, 17, Direction.NORTH);
    Wall w17 = new Wall(samusLVL, 10, 18, Direction.NORTH);
    Wall w18 = new Wall(samusLVL, 10, 19, Direction.NORTH);
    Wall w19 = new Wall(samusLVL, 10, 20, Direction.NORTH);
    Wall w120 = new Wall(samusLVL, 11, 21, Direction.NORTH);
    Wall w121 = new Wall(samusLVL, 12, 22, Direction.NORTH);
    Wall w122 = new Wall(samusLVL, 18, 4, Direction.NORTH);
    Wall w123 = new Wall(samusLVL, 26, 4, Direction.NORTH);
    Wall w124 = new Wall(samusLVL, 27, 3, Direction.NORTH);
    Wall w125 = new Wall(samusLVL, 27, 2, Direction.NORTH);
    Wall w126 = new Wall(samusLVL, 28, 1, Direction.NORTH);
    Wall w127 = new Wall(samusLVL, 29, 0, Direction.NORTH);
    Wall w128 = new Wall(samusLVL, 17, 15, Direction.NORTH);
    Wall w129 = new Wall(samusLVL, 20, 10, Direction.NORTH);
    Wall w130 = new Wall(samusLVL, 21, 11, Direction.NORTH);
    Wall w131 = new Wall(samusLVL, 22, 12, Direction.NORTH);
    Wall w132 = new Wall(samusLVL, 23, 13, Direction.NORTH);
    Wall w133 = new Wall(samusLVL, 25, 14, Direction.NORTH);
    Wall w134 = new Wall(samusLVL, 32, 13, Direction.NORTH);
    Wall w135 = new Wall(samusLVL, 33, 14, Direction.NORTH);
    Wall w136 = new Wall(samusLVL, 34, 15, Direction.NORTH);
    Wall w137 = new Wall(samusLVL, 32, 6, Direction.NORTH);
    Wall w138 = new Wall(samusLVL, 6, 13, Direction.NORTH);
    Wall w139 = new Wall(samusLVL, 8, 14, Direction.NORTH);
    Wall w140 = new Wall(samusLVL, 8, 11, Direction.NORTH);
    Wall w141 = new Wall(samusLVL, 9, 12, Direction.NORTH);
    Wall w142 = new Wall(samusLVL, 12, 6, Direction.NORTH);
    Wall w143 = new Wall(samusLVL, 24, 10, Direction.NORTH);
    Wall w144 = new Wall(samusLVL, 25, 11, Direction.NORTH);
    Wall w145 = new Wall(samusLVL, 30, 8, Direction.NORTH);
    Wall w146 = new Wall(samusLVL, 30, 7, Direction.NORTH);
    Wall w147 = new Wall(samusLVL, 31, 6, Direction.NORTH);
    Wall w148 = new Wall(samusLVL, 32, 5, Direction.NORTH);
    
    //Make walls for the West direction
    Wall w01 = new Wall(samusLVL, 1, 8, Direction.WEST);
    Wall w02 = new Wall(samusLVL, 2, 6, Direction.WEST);
    Wall w03 = new Wall(samusLVL, 3, 5, Direction.WEST);
    Wall w04 = new Wall(samusLVL, 4, 4, Direction.WEST);
    Wall w05 = new Wall(samusLVL, 5, 3, Direction.WEST);
    Wall w06 = new Wall(samusLVL, 6, 3, Direction.WEST);
    Wall w07 = new Wall(samusLVL, 7, 3, Direction.WEST);
    Wall w08 = new Wall(samusLVL, 8, 4, Direction.WEST);
    Wall w09 = new Wall(samusLVL, 9, 4, Direction.WEST);
    Wall w010 = new Wall(samusLVL, 10, 3, Direction.WEST);
    Wall w011 = new Wall(samusLVL, 11, 3, Direction.WEST);
    Wall w012 = new Wall(samusLVL, 12, 3, Direction.WEST);
    Wall w013 = new Wall(samusLVL, 13, 3, Direction.WEST);
    Wall w014 = new Wall(samusLVL, 10, 21, Direction.WEST);
    Wall w015 = new Wall(samusLVL, 11, 22, Direction.WEST);
    Wall w016 = new Wall(samusLVL, 14, 4, Direction.WEST);
    Wall w017 = new Wall(samusLVL, 15, 4, Direction.WEST);
    Wall w018 = new Wall(samusLVL, 16, 5, Direction.WEST);
    Wall w019 = new Wall(samusLVL, 17, 5, Direction.WEST);
    Wall w020 = new Wall(samusLVL, 18, 4, Direction.WEST);
    Wall w021 = new Wall(samusLVL, 19, 4, Direction.WEST);
    Wall w022 = new Wall(samusLVL, 20, 4, Direction.WEST);
    Wall w023 = new Wall(samusLVL, 21, 5, Direction.WEST);
    Wall w024 = new Wall(samusLVL, 22, 5, Direction.WEST);
    Wall w025 = new Wall(samusLVL, 23, 5, Direction.WEST);
    Wall w026 = new Wall(samusLVL, 24, 5, Direction.WEST);
    Wall w027 = new Wall(samusLVL, 25, 5, Direction.WEST);
    Wall w028 = new Wall(samusLVL, 26, 4, Direction.WEST);
    Wall w029 = new Wall(samusLVL, 27, 2, Direction.WEST);
    Wall w030 = new Wall(samusLVL, 28, 1, Direction.WEST);
    Wall w031 = new Wall(samusLVL, 29, 0, Direction.WEST);
    Wall w032 = new Wall(samusLVL, 15, 14, Direction.WEST);
    Wall w033 = new Wall(samusLVL, 19, 14, Direction.WEST);
    Wall w034 = new Wall(samusLVL, 19, 11, Direction.WEST);
    Wall w035 = new Wall(samusLVL, 35, 9, Direction.WEST);
    Wall w036 = new Wall(samusLVL, 34, 8, Direction.WEST);
    Wall w037 = new Wall(samusLVL, 36, 4, Direction.WEST);
    Wall w038 = new Wall(samusLVL, 35, 3, Direction.WEST);
    Wall w039 = new Wall(samusLVL, 34, 2, Direction.WEST);
    Wall w040 = new Wall(samusLVL, 33, 1, Direction.WEST);
    Wall w041 = new Wall(samusLVL, 32, 0, Direction.WEST);
    Wall w042 = new Wall(samusLVL, 31, 0, Direction.WEST);
    Wall w043 = new Wall(samusLVL, 30, 0, Direction.WEST);
    Wall w044 = new Wall(samusLVL, 33, 6, Direction.WEST);
    Wall w045 = new Wall(samusLVL, 32, 6, Direction.WEST);
    Wall w046 = new Wall(samusLVL, 6, 13, Direction.WEST);
    Wall w047 = new Wall(samusLVL, 7, 13, Direction.WEST);
    Wall w048 = new Wall(samusLVL, 8, 14, Direction.WEST);
    Wall w049 = new Wall(samusLVL, 8, 11, Direction.WEST);
    Wall w050 = new Wall(samusLVL, 9, 12, Direction.WEST);
    Wall w051 = new Wall(samusLVL, 12, 6, Direction.WEST);
    Wall w052 = new Wall(samusLVL, 24, 10, Direction.WEST);
    Wall w053 = new Wall(samusLVL, 25, 10, Direction.WEST);
    Wall w054 = new Wall(samusLVL, 26, 10, Direction.WEST);
    Wall w055 = new Wall(samusLVL, 30, 7, Direction.WEST);
    Wall w056 = new Wall(samusLVL, 31, 6, Direction.WEST);
    Wall w057 = new Wall(samusLVL, 32, 5, Direction.WEST);
    Wall w058 = new Wall(samusLVL, 33, 5, Direction.WEST);
    
    //Make walls for the East direction
    Wall w20 = new Wall(samusLVL, 1, 10, Direction.EAST);
    Wall w21 = new Wall(samusLVL, 2, 12, Direction.EAST);
    Wall w22 = new Wall(samusLVL, 3, 13, Direction.EAST);
    Wall w23 = new Wall(samusLVL, 4, 14, Direction.EAST);
    Wall w24 = new Wall(samusLVL, 5, 14, Direction.EAST);
    Wall w25 = new Wall(samusLVL, 6, 15, Direction.EAST);
    Wall w26 = new Wall(samusLVL, 7, 15, Direction.EAST);
    Wall w27 = new Wall(samusLVL, 8, 15, Direction.EAST);
    Wall w28 = new Wall(samusLVL, 9, 15, Direction.EAST);
    Wall w29 = new Wall(samusLVL, 12, 22, Direction.EAST);
    Wall w210 = new Wall(samusLVL, 13, 22, Direction.EAST);
    Wall w211 = new Wall(samusLVL, 14, 21, Direction.EAST);
    Wall w212 = new Wall(samusLVL, 15, 20, Direction.EAST);
    Wall w213 = new Wall(samusLVL, 15, 14, Direction.EAST);
    Wall w214 = new Wall(samusLVL, 15, 13, Direction.EAST);
    Wall w215 = new Wall(samusLVL, 16, 14, Direction.EAST);
    Wall w216 = new Wall(samusLVL, 17, 15, Direction.EAST);
    Wall w217 = new Wall(samusLVL, 18, 15, Direction.EAST);
    Wall w218 = new Wall(samusLVL, 19, 14, Direction.EAST);
    Wall w219 = new Wall(samusLVL, 19, 12, Direction.EAST);
    Wall w220 = new Wall(samusLVL, 19, 9, Direction.EAST);
    Wall w221 = new Wall(samusLVL, 20, 10, Direction.EAST);
    Wall w222 = new Wall(samusLVL, 21, 11, Direction.EAST);
    Wall w223 = new Wall(samusLVL, 22, 12, Direction.EAST);
    Wall w224 = new Wall(samusLVL, 23, 13, Direction.EAST);
    Wall w225 = new Wall(samusLVL, 24, 13, Direction.EAST);
    Wall w226 = new Wall(samusLVL, 25, 14, Direction.EAST);
    Wall w227 = new Wall(samusLVL, 26, 14, Direction.EAST);
    Wall w228 = new Wall(samusLVL, 27, 13, Direction.EAST);
    Wall w229 = new Wall(samusLVL, 28, 12, Direction.EAST);
    Wall w230 = new Wall(samusLVL, 29, 12, Direction.EAST);
    Wall w231 = new Wall(samusLVL, 30, 12, Direction.EAST);
    Wall w232 = new Wall(samusLVL, 31, 12, Direction.EAST);
    Wall w233 = new Wall(samusLVL, 32, 13, Direction.EAST);
    Wall w234 = new Wall(samusLVL, 33, 14, Direction.EAST);
    Wall w235 = new Wall(samusLVL, 34, 15, Direction.EAST);
    Wall w236 = new Wall(samusLVL, 35, 14, Direction.EAST);
    Wall w237 = new Wall(samusLVL, 34, 6, Direction.EAST);
    Wall w238 = new Wall(samusLVL, 35, 7, Direction.EAST);
    Wall w239 = new Wall(samusLVL, 36, 7, Direction.EAST);
    Wall w240 = new Wall(samusLVL, 33, 6, Direction.EAST);
    Wall w241 = new Wall(samusLVL, 32, 6, Direction.EAST);
    Wall w242 = new Wall(samusLVL, 6, 13, Direction.EAST);
    Wall w243 = new Wall(samusLVL, 7, 13, Direction.EAST);
    Wall w244 = new Wall(samusLVL, 8, 14, Direction.EAST);
    Wall w245 = new Wall(samusLVL, 8, 11, Direction.EAST);
    Wall w246 = new Wall(samusLVL, 9, 12, Direction.EAST);
    Wall w247 = new Wall(samusLVL, 12, 6, Direction.EAST);
    Wall w248 = new Wall(samusLVL, 24, 10, Direction.EAST);
    Wall w249 = new Wall(samusLVL, 25, 11, Direction.EAST);
    Wall w250 = new Wall(samusLVL, 26, 11, Direction.EAST);
    Wall w251 = new Wall(samusLVL, 33, 7, Direction.EAST);
    Wall w252 = new Wall(samusLVL, 32, 7, Direction.EAST);
    Wall w253 = new Wall(samusLVL, 31, 7, Direction.EAST);
    Wall w254 = new Wall(samusLVL, 30, 8, Direction.EAST);
    
    //Make walls for the South direction
    Wall w30 = new Wall(samusLVL, 7, 3, Direction.SOUTH);
    Wall w31 = new Wall(samusLVL, 13, 22, Direction.SOUTH);
    Wall w32 = new Wall(samusLVL, 13, 3, Direction.SOUTH);
    Wall w33 = new Wall(samusLVL, 14, 21, Direction.SOUTH);
    Wall w34 = new Wall(samusLVL, 15, 4, Direction.SOUTH);
    Wall w35 = new Wall(samusLVL, 20, 4, Direction.SOUTH);
    Wall w36 = new Wall(samusLVL, 15, 20, Direction.SOUTH);
    Wall w37 = new Wall(samusLVL, 15, 19, Direction.SOUTH);
    Wall w38 = new Wall(samusLVL, 15, 18, Direction.SOUTH);
    Wall w39 = new Wall(samusLVL, 15, 17, Direction.SOUTH);
    Wall w310 = new Wall(samusLVL, 15, 16, Direction.SOUTH);
    Wall w311 = new Wall(samusLVL, 15, 15, Direction.SOUTH);
    Wall w312 = new Wall(samusLVL, 15, 14, Direction.SOUTH);
    Wall w313 = new Wall(samusLVL, 15, 13, Direction.SOUTH);
    Wall w314 = new Wall(samusLVL, 15, 12, Direction.SOUTH);
    Wall w315 = new Wall(samusLVL, 18, 15, Direction.SOUTH);
    Wall w316 = new Wall(samusLVL, 19, 14, Direction.SOUTH);
    Wall w317 = new Wall(samusLVL, 18, 13, Direction.SOUTH);
    Wall w318 = new Wall(samusLVL, 19, 12, Direction.SOUTH);
    Wall w319 = new Wall(samusLVL, 19, 11, Direction.SOUTH);
    Wall w320 = new Wall(samusLVL, 18, 10, Direction.SOUTH);
    Wall w321 = new Wall(samusLVL, 26, 14, Direction.SOUTH);
    Wall w322 = new Wall(samusLVL, 27, 13, Direction.SOUTH);
    Wall w323 = new Wall(samusLVL, 34, 15, Direction.SOUTH);
    Wall w324 = new Wall(samusLVL, 35, 14, Direction.SOUTH);
    Wall w325 = new Wall(samusLVL, 35, 13, Direction.SOUTH);
    Wall w326 = new Wall(samusLVL, 35, 12, Direction.SOUTH);
    Wall w327 = new Wall(samusLVL, 35, 11, Direction.SOUTH);
    Wall w328 = new Wall(samusLVL, 35, 10, Direction.SOUTH);
    Wall w329 = new Wall(samusLVL, 35, 9, Direction.SOUTH);
    Wall w340 = new Wall(samusLVL, 34, 8, Direction.SOUTH);
    Wall w341 = new Wall(samusLVL, 33, 7, Direction.SOUTH);
    Wall w342 = new Wall(samusLVL, 34, 7, Direction.SOUTH);
    Wall w343 = new Wall(samusLVL, 36, 7, Direction.SOUTH);
    Wall w344 = new Wall(samusLVL, 36, 6, Direction.SOUTH);
    Wall w345 = new Wall(samusLVL, 36, 5, Direction.SOUTH);
    Wall w346 = new Wall(samusLVL, 36, 4, Direction.SOUTH);
    Wall w347 = new Wall(samusLVL, 35, 3, Direction.SOUTH);
    Wall w348 = new Wall(samusLVL, 34, 2, Direction.SOUTH);
    Wall w349 = new Wall(samusLVL, 33, 1, Direction.SOUTH);
    Wall w350 = new Wall(samusLVL, 32, 0, Direction.SOUTH);
    Wall w351 = new Wall(samusLVL, 33, 6, Direction.SOUTH);
    Wall w352 = new Wall(samusLVL, 7, 13, Direction.SOUTH);
    Wall w353 = new Wall(samusLVL, 8, 14, Direction.SOUTH);
    Wall w354 = new Wall(samusLVL, 8, 11, Direction.SOUTH);
    Wall w355 = new Wall(samusLVL, 9, 12, Direction.SOUTH);
    Wall w356 = new Wall(samusLVL, 12, 6, Direction.SOUTH);
    Wall w357 = new Wall(samusLVL, 26, 10, Direction.SOUTH);
    Wall w358 = new Wall(samusLVL, 26, 11, Direction.SOUTH);
    Wall w359 = new Wall(samusLVL, 30, 8, Direction.SOUTH);
    Wall w360 = new Wall(samusLVL, 33, 5, Direction.SOUTH);
    
    //Start all the robot threads to make them move
    baileyThread.start();
    williamThread.start();
    dinithThread.start();
    dylanThread.start();
    paulThread.start();
    seewinThread.start();
    tiagoThread.start();
    dianaThread.start();
    matthewThread.start();
    
    while(true)
    {
      if(baquial.getStreet() == 13 && baquial.getAvenue() == 22 && baquial.countThingsInBackpack() == 11)
      {
        //If the user has the required amount of things and is at the intersection (13,22) they will complete the fourth level
        JOptionPane.showMessageDialog(null, "You beat the fourth and final level! Congratulations!   ", "Samus Level", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
      }
      else if(baquial.getStreet() == 13 && baquial.getAvenue() == 22 && baquial.countThingsInBackpack() != 11)
      {
        //If the user doesnt have the required amount of things and is at the intersection (13,22) they will be told to collect more things and will be moved out of that location
        String msg2 = String.format("You have collected %d/11 things. Keep collecting!   ", baquial.countThingsInBackpack());
        JOptionPane.showMessageDialog(null, msg2, "Samus Level", JOptionPane.INFORMATION_MESSAGE);
        baquial.turnAround();
        baquial.move();
      }
      
      //If the GuardBot(s) are at the same intersection as the SamusBot baquial, the bot will "crash"
      if(baquial.getIntersection() == bailey.getIntersection()
           || baquial.getIntersection() == william.getIntersection()
           || baquial.getIntersection() == dinith.getIntersection()
           || baquial.getIntersection() == dylan.getIntersection()
           || baquial.getIntersection() == paul.getIntersection()
           || baquial.getIntersection() == seewin.getIntersection()
           || baquial.getIntersection() == tiago.getIntersection()
           || baquial.getIntersection() == diana.getIntersection()
           || baquial.getIntersection() == matthew.getIntersection())
      { 
        int inventory = baquial.countThingsInBackpack();
        baquial.crash();  
        lives--;
        
        //If the user has not died 3 times yet
        if(lives != 0) 
        {
          //An option dialog will popup each time the user dies asking if they would like to continue playing or quit the game
          String msg3 = String.format("You have been caught!\nWould you like to continue?\nOnly %d lives remain!", lives);
          int option = JOptionPane.showConfirmDialog(null, msg3, "Continue Playing?", JOptionPane.YES_NO_OPTION);
          
          //If the option is yes, the user will respawn
          if(option == JOptionPane.YES_OPTION) 
          {
            //Set numThingsInBackpack = 0 to allow user to respawn with no items in backpack
            baquial = new SamusBot(samusLVL, 12, 22, Direction.WEST, 0);
            baquial.setIcon(new SamusBotDesign());   
            baquial.setSpeed(20);
            //Used to create things at user's respawn location with the proper icon display and place them in their backpack 
            for(int i = 0; i < inventory; inventory--)
            {
              Thing Mine = new Thing(samusLVL, 12, 22);
              Mine.setIcon(new SamusThing());
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














