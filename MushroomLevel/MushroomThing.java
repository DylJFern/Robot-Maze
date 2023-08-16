/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: June 15, 2015
 *Description: Customized thing for the Mushroom Level
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//This code is used create a new icon for the MushroomLevel
public class MushroomThing extends Icon
{ 
  public MushroomThing()
  {
    super();
  }
  
  public void paintIcon(Graphics g)
  {
    //Make Outer Yellow Ring
    g.setColor(new Color (221,228,23));
    g.fillOval(30, 30, 40, 40);
    
    //Make Inner White Space
    g.setColor(Color.YELLOW);
    g.fill3DRect(47, 45, 10, 20,true);
  }
}







