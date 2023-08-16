/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot7 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SamusGuardBot7(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  { 
    //Movement for SamusGuardBot7
    while(true)
    {
      //First route
      this.setSpeed(3);
      this.move();
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move();
      this.turnAround();
      this.move();
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnAround();
      
      //Second route
      this.setSpeed(6);
      this.move(5);
      this.turnRight();
      this.move(2);
      this.turnRight();
      this.move(5);
      this.turnRight();
      this.move();
      this.turnRight();
      
      //Third route
      for(int i = 0; i < 3; i++)
      {
        this.setSpeed(9);
        this.move(5);
        this.turnAround();
        this.move(5);
        this.turnAround();
        this.setSpeed(12);
        this.move(3);
        this.turnAround();
        this.move(3);
        this.turnAround();
      }
      this.move();
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move();
      this.turnAround();
    }
  }
}