/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot3 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot3(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SamusGuardBot3
    while(true) 
    {
      this.move(2);
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
    }
  }
}