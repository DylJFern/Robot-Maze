/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the SonicLevel
 */

import becker.robots.*;

public class SonicGuardBot4 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();   
  public SonicGuardBot4(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SonicGuardBot4
    while(true)
    {
      this.setSpeed(3);
      this.move(4);
      this.turnAround();
      this.setSpeed(8);
      this.move(4);
      this.turnAround();
      this.move(2);
      this.setSpeed(10);
      this.turnAround();
      this.move(2);
      this.turnAround();
      this.move();
      this.turnLeft();
      this.move(2);
      this.turnAround();
      this.move(3);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move();
      this.turnAround();
      this.move();
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.setSpeed(8);
      this.move(3);
      this.turnAround();
    }
  }
}