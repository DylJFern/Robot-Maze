/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SonicLevel
 */

import becker.robots.*;

public class SonicGuardBot2 extends RobotSE implements Runnable
{
  //static Thread t = new Thread();
  public SonicGuardBot2(City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    int i = 0;
    //Movement for SonicGuardBot2
    while(true)
    {    
      this.move(6);
      this.turnRight();
      this.move(4);
      this.turnLeft();
      this.move(4);
      this.turnLeft();
      this.move(2);
      this.turnLeft();
      this.move();
      this.turnLeft();
      this.move(3);
      this.turnRight();
      this.move(3);
      this.turnRight();
      this.move(4);
      this.turnLeft();
      this.move(3);
      this.turnRight();
      this.move();
      this.turnRight();
      this.move(3);
      this.turnAround();
      this.move(6);
      this.turnAround();
      i++;
      
      if(i >= 5)
      {
        this.setSpeed(15);
      }
    }
  }
}