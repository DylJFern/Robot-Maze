/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: June 15, 2015
 *Description: Customized thing for the PokeLevel
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//This code is used create a new icon for the PokeLevel
public class PokeThing extends Icon
{
  public PokeThing()
  {
    super();
  }
  
  public void paintIcon(Graphics g)
  {
    //Make the pokeball
    g.setColor(Color.RED);
    g.fillOval(30, 28,30,30);
    g.setColor(Color.WHITE);
    g.fillOval(30, 40, 30,26);
    
    //Make the middle black bar
    g.setColor(Color.BLACK);
    g.fillRect(31,41,30,12);
    
    //White circle in the middle
    g.setColor(Color.WHITE);
    g.fillOval(40,40,11,11);
  }
}



