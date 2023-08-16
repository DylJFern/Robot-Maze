/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot5 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot5(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SamusGuardBot5
    while(true)   
    { 
      for(int i = 0; i < 2; i++)
      {
        this.move(2);  
        this.turnLeft(); 
        this.move(4);   
        this.turnLeft();   
        this.move(4);   
        this.turnLeft();
        this.move(4);  
        this.turnLeft();  
        this.move(2);  
      }
      this.setIcon(new InvisibleGuardBotDesign());
      this.setSpeed(6);
      this.move(6);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(8);
      this.setIcon(new GuardBotDesign());
      this.setSpeed(12);
      this.move(7);
      this.setIcon(new InvisibleGuardBotDesign());
      this.setSpeed(6);
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(3);
      this.turnRight();
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(4);
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnRight();
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move(2);
      this.turnLeft();
      this.setIcon(new GuardBotDesign());
      this.move(4);
    } 
  }
}