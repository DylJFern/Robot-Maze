/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot8 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot8(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  { 
    //Movement for SamusGuardBot8
    while(true)
    {
      this.move(2);
      this.turnAround();
      this.move(2);
      this.turnAround();
    }
  }
}