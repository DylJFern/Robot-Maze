/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the SonicLevel
 */

import becker.robots.*;

public class SonicGuardBot1 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SonicGuardBot1(City city, int ave, int str, Direction dir)
  {
    super(city, ave, str, dir);
  }
  
  public void run()
  {
    //Movement for SonicGuardBot1
    while(true)
    {
      this.setSpeed(3);
      this.move();
      this.turnLeft();
      this.move();
      this.turnAround();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move(4);
      this.turnRight();
      this.move(3);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(3);
      this.turnLeft();
      this.move(2);
      this.turnRight();
    }
  }
}
