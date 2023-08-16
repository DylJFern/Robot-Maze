/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SonicLevel
 */

import becker.robots.*;

public class SonicGuardBot6 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SonicGuardBot6(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SonicGuardBot6
    while(true)
    {
      for(int i = 0; i < 4; i++)
      {
        this.setSpeed(3);
        this.move(4);
        this.setSpeed(8);
        this.turnAround();
        this.move(4);
        this.turnAround();
        this.move(4);
        this.turnAround();
      }
      for(int j = 0; j < 3; j++)
      {
        this.setSpeed(10);
        this.move(4);
        this.turnAround();
      }
    }
  }
}