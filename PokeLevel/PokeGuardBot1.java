/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the PokeLevel
 */

import becker.robots.*;

public class PokeGuardBot1 extends RobotSE implements Runnable
{
  //static Thread t = new Thread(); 
  public PokeGuardBot1 (City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    int i = 0;
    //Movement for PokeGuardBot1
    while(true)
    {
      if(i >= 3) {
        i = 0;
      }
      else if(i == 0 || i >= 2 && i < 4)
      {
        //Route 1
        this.setSpeed(20);
        this.move(2);
        this.turnRight();
        this.move(3);
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move();
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move(2);
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move(3);
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move(2);
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move();
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move(3);
        this.turnRight();
        this.move(2);
        this.turnLeft();
        this.move();
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move(2);
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move(2);
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move(3);
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move(2);
        this.turnLeft();
        this.move();
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move(2);
        this.turnRight();
        this.move();
        this.turnLeft();
        this.move();
        this.turnLeft();
        i++;
      }
      else
      {
        //Route 2
        this.setSpeed(10);
        this.move(2);
        this.turnRight();
        this.move(5);
        this.turnLeft();
        this.move(7);
        this.turnLeft();
        this.move(9);
        this.turnLeft();
        this.move(7);
        this.turnLeft();
        this.move(4);
        this.turnRight();
        this.move(2);
        this.turnAround();
        i++;
      }
    }
  }
}





