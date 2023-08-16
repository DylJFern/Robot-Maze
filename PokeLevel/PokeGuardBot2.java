/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: GuardBot for the PokeLevel
 */

import becker.robots.*;

public class PokeGuardBot2 extends RobotSE implements Runnable
{
  // static Thread t = new Thread();
  public PokeGuardBot2 (City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for PokeGuardBot2
    while(true)
    {
      //First lap
      this.move();
      this.turnLeft();
      this.move(2);
      this.turnRight();
      this.move(5);
      this.turnRight();
      this.move(2);
      this.turnLeft();
      this.move();
      
      //Second lap
      this.turnAround();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move(2);
      this.turnAround();
      this.move();
      this.turnRight();
      this.move(3);
      this.turnRight();
      this.move();
      this.turnAround();
      this.move(2);
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnAround();
      
      //Third lap
      this.move();
      this.turnLeft();
      this.move(2);
      this.turnRight();
      this.move(5);
      this.turnAround();
      this.move(5);
      this.turnLeft();
      this.move(2);
      this.turnRight();
      this.move();
      this.turnAround();
    }
  }
}





