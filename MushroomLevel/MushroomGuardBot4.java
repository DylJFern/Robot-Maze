/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the MushroomLevel
 */

import becker.robots.*;

public class MushroomGuardBot4 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public MushroomGuardBot4(City aCity, int ave, int str, Direction dir)
  {
    super(aCity, ave, str, dir);
  }
  
  public void run()
  {
    //Movement for MushroomGuardBot4
    while(true)
    {
      this.move(7);
      this.turnAround();
      this.move(7);
      this.turnAround();
    }
  }
}