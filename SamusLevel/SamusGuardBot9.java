/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot9 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot9(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SamusGuardBot9
    while(true)   
    { 
      this.move(9);
      this.turnLeft();
      this.move(4);
      this.turnLeft();
      this.move(9);
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move(8);
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move(8);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(7);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(7);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(6);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(6);
      this.turnLeft();
      this.setIcon(new GuardBotDesign());
      this.move(4);
      this.setIcon(new InvisibleGuardBotDesign());
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move(8);
      this.turnAround();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move(6);
      this.turnRight();
      this.move();
      this.turnRight();
      this.move(5);
      this.turnAround();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft(); 
      this.setIcon(new GuardBotDesign());
      this.move(5);
      this.setIcon(new InvisibleGuardBotDesign());
      this.turnLeft();
    } 
  }
}