/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot2 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();  
  public SamusGuardBot2(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for SamusGuardBot2
    while(true)
    {
      //First route
      this.setSpeed(3);
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      
      //Second route
      this.setSpeed(13);
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnRight();
    }
  }
}