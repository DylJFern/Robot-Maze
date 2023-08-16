/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
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
    int i = 0;
    //Movement for SonicGuardBot6
    while(true)
    {
      if(i >= 7) {
        i = 0;
      }
      else if(i < 4)
      {
        this.setSpeed(3);
        this.move(4);
        this.turnAround();
        this.setSpeed(8);
        this.move(4);
        this.turnAround();
        this.move(4);
        this.turnAround();
        i++;
      }
      else
      {
        this.setSpeed(10);
        this.move(4);
        this.turnAround();
        i++;
      }
    }
  }
}