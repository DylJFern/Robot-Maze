/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the SamusLevel
 */

import becker.robots.*;

public class SamusGuardBot6 extends RobotSE implements Runnable
{
  public SamusGuardBot6 (City city, int str, int ave, Direction dir) 
  { 
    super(city, str, ave, dir); 
  }
  
  public void run() 
  { 
    //Movement for SamusGuardBot6
    while(true)   
    {  
      this.move(3);   
      this.turnLeft();   
      this.move();   
      this.turnRight();   
      this.move();   
      this.turnLeft();   
      this.move();   
      this.turnRight();   
      this.move();   
      this.turnLeft();   
      this.move();   
      this.turnRight();   
      this.move();   
      this.turnLeft();   
      this.move();   
      this.turnRight();   
      this.move();   
      this.turnLeft();   
      this.move(3);   
      this.turnAround();
      this.move(3);
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move();
      this.turnLeft();
      this.move();
      this.turnRight();
      this.move(3);
      this.turnAround();
    }
  }
}