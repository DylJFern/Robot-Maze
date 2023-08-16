/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the MushroomLevel
 */

import becker.robots.*;

public class MushroomGuardBot4 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public MushroomGuardBot4(City aCity, int str, int ave, Direction dir)
  {
    super(aCity, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for MushroomGuardBot4
    while(true)
    {
      this.move(7);
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(7);
      this.turnRight();
      this.move();
      this.turnAround();
      this.move(2);
      this.turnRight();
      this.move(4);
      this.turnRight();
      this.move();
      this.turnRight();
      this.move(7);
      this.turnLeft();
      this.move();
      this.turnAround();
      this.move(3);
      this.turnRight();
      this.move(5);
      this.turnRight();
      this.move(2);
      this.turnRight();
    }
  }
}