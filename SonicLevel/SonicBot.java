/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: SonicBot for the SonicLevel
 */

import becker.robots.*;
import javax.swing.*;

public class SonicBot extends RobotSE
{
  public SonicBot(City aCity, int ave, int str, Direction dir) 
  { 
    super(aCity, ave, str, dir); 
  }
  
  public SonicBot(City aCity, int ave, int str, Direction dir, int aThing) 
  { 
    super(aCity, ave, str, dir, aThing); 
  }
  
  public void keyTyped (char key) 
  {
    //Key command for when the user presses the 'w' key
    if(key == 'w')
    {
      if(this.isFacingEast())
      {
        this.turnLeft();
      }
      else if(this.isFacingSouth())
      {
        this.turnAround();
      }
      else if(this.isFacingWest())
      {
        this.turnRight();
      }
      else
      {
        if(this.frontIsClear())
        {
          this.move();
        }
        else 
        {
          this.turnAround();
        }
      }
    }
    
    //Key command for when the user presses the 's' key
    if(key == 's')
    {
      if(this.isFacingEast())
      {
        this.turnRight();
      }
      else if(this.isFacingNorth())
      {
        this.turnAround();
      }
      else if(this.isFacingWest())
      {
        this.turnLeft();
      }
      else
      {
        if(this.frontIsClear())
        {
          this.move();
        }
        else
        {
          this.turnAround();
        }
      }
    }
    
    //Key command for when the user presses the 'd' key
    if(key == 'd')
    {
      if(this.isFacingNorth())
      {
        this.turnRight();
      }
      else if(this.isFacingSouth())
      {
        this.turnLeft();
      }
      else if(this.isFacingWest())
      {
        this.turnAround();
      }
      else
      {
        if(this.frontIsClear())
        {
          this.move();
        }
        else
        {
          this.turnAround();
        }
      }
    }
    
    //Key command for when the user presses the 'a' key
    if(key == 'a')
    {
      if(this.isFacingNorth())
      {
        this.turnLeft();
      }
      else if(this.isFacingEast())
      {
        this.turnAround();
      }
      else if(this.isFacingSouth())
      {
        this.turnRight();
      }
      else
      {
        if(this.frontIsClear())
        {
          this.move();
        }
        else
        {
          this.turnAround();
        }
      }
    }
    
    //If the user presses '4' they will pick up a thing
    if(this.canPickThing()) { 
      if(key == '4')
      {
        this.pickThing();
      }
    }
    
    //If the user presses '6' they will put down a thing
    if(this.countThingsInBackpack() > 0) {
      if(key == '6')
      {
        this.putThing();
      }
    }
  }
  
  //Create a class called "crash" to 'kill' the user if they get hit by a GuardBot
  public void crash()
  {
    try
    {
      this.breakRobot("");  
    }
    catch (RobotException e)
    {
    }
  }
}
