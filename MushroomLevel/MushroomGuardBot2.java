/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the MushroomLevel
 */

import becker.robots.*;

public class MushroomGuardBot2 extends RobotSE implements Runnable
{
  // static Thread t = new Thread();
  public MushroomGuardBot2(City aCity, int str, int ave, Direction dir)
  {
    super(aCity, str, ave, dir);
  }
  
  public void run()
  {
    int i = 0;
    //Movement for MushroomGuardBot2
    while(true)
    {
      this.setSpeed(2);
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnAround();
      this.move(5);
      this.turnAround();
      i++;
      
      if(i == 2)
      {
        this.setSpeed(3);
        this.turnRight();
        this.move(2);
        this.turnLeft();
        this.move(3);
        this.turnLeft();
        this.move(2);
        this.turnRight();
        this.move(2);
        this.turnRight();
        this.move(2);
        this.turnRight();
        this.move(3);
        this.turnRight();
        this.move(2);
        this.turnLeft();
        this.move(2);
        this.turnAround();
        i = 0;
      }
    }
  }
}






