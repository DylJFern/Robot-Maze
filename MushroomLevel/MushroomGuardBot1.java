/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the MushroomLevel
 */

import becker.robots.*;

public class MushroomGuardBot1 extends RobotSE implements Runnable
{
  // static Thread t = new Thread();
  public MushroomGuardBot1(City aCity, int ave, int str, Direction dir)
  {
    super(aCity, ave, str, dir);
  }
  
  public void run()
  {
    //Movement for MushroomGuardBot1
    while(true)
    {
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnAround();
      this.move(5);
      this.turnAround();
    }
  }
}





