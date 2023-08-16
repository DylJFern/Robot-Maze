/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the SonicLevel
 */

import becker.robots.*;

public class SonicGuardBot5 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();   
  public SonicGuardBot5(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    int carry = 1;
    //Movement for SonicGuardBot5
    while(true)
    {
      this.setSpeed(3);
      this.move(4);
      this.turnAround();
      this.setSpeed(8);
      this.move(4);
      this.turnRight();
      this.setSpeed(10);
      this.move(5);
      this.turnRight();
      this.move();
      this.turnRight();
      this.move(2);
      this.turnLeft();
      this.move(3);
      this.turnRight();
      this.move(3);
      this.turnLeft();
      this.move(2);
      this.setSpeed(5);
      this.move(4);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(4);
      this.turnRight();
      this.move(6);
      this.setSpeed(12);
      this.turnAround();
      this.move(6);
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnRight();
      this.setSpeed(3);
      
      if(carry == 1)
      { 
        this.move(3);
        this.turnRight();
        this.move(5);
        this.turnLeft();
        this.move(8);
        if(this.getStreet() == 22 && this.getAvenue() == 15 && this.canPickThing())
        {
          this.pickThing();
          this.turnAround();
          this.move(7);
          this.turnLeft();
          this.move(12);
          this.putThing();
          this.turnAround();
          this.move(17);
          this.turnRight();
          this.move(3);
          this.turnAround();
          carry = 0;
        }
        else
        {
          this.setSpeed(10);
          this.turnAround();
          this.move(4);
          this.turnRight();
          this.move(5);
          this.turnLeft();
          carry = 0;
        }
      }
      else
      {
        this.setSpeed(10);
        this.move(7);
        this.turnAround();
      }
    }
  }
}
