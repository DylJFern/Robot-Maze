/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot1 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot1(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SamusGuardBot1
    while(true)
    {
      this.setSpeed(5);
      this.move(6);
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.setSpeed(8);
      this.turnAround();
      this.move(8);
      this.turnAround(); 
      this.move(5);
      this.setSpeed(14);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move(2);
      this.turnAround();
      this.move(6);
      this.turnAround();
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.setSpeed(1);
      this.move(2);
      this.turnAround();
      this.move();
      this.setSpeed(3);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move(3);
      this.turnAround();
    }
  }
}