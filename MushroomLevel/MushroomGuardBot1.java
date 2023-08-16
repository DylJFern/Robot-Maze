/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the MushroomLevel
 */

import becker.robots.*;

public class MushroomGuardBot1 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public MushroomGuardBot1(City aCity, int str, int ave, Direction dir)
  {
    super(aCity, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for MushroomGuardBot1
    while(true)
    {
      for(int i = 0; i < 2; i++)
      {
        this.setSpeed(2);
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
      this.setSpeed(5);
      this.turnLeft();
      this.move(2);
      this.turnRight();
      this.move(3);
      this.turnRight();
      this.move(2);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move(2);
      this.turnRight();
      this.move(2);
      this.turnAround(); 
    }
  }
}






