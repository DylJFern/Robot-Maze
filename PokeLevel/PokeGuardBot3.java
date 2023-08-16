/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: GuardBot for the PokeLevel
 */

import becker.robots.*;

public class PokeGuardBot3 extends RobotSE implements Runnable
{ 
  //static Thread t = new Thread();
  public PokeGuardBot3 (City city, int str, int ave, Direction dir)
  {
    super(city, str, ave, dir);
  }
  
  public void run()
  {
    //Movement for PokeGuardBot3
    while(true)
    {
      this.move();
      this.turnRight();
      this.move(3);
      this.turnRight();
      this.move();
      this.turnAround();
      this.move();
      this.turnLeft();
      this.move(3);
      this.turnLeft();
      this.move();
      this.turnAround();
    }
  }
}





