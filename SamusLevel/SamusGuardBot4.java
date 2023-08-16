/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot4 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot4(City city, int str, int ave, Direction dir) 
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SamusGuardBot4
    while(true)
    {
      this.move();
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move();
    }
  }
}