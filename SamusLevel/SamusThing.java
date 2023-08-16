/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: June 15, 2015
 *Description: Customized thing for the SamusLevel
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//This code is used create a new icon for the SamusLevel
public class SamusThing extends Icon
{  
  public SamusThing()
  {
    super();
  }
  
  public void paintIcon(Graphics g)
  {
    //Make outer land mine shape
    g.fillOval(30, 30, 40, 40);
    
    //Make inner land mine sensor shape   
    g.setColor(Color.RED);    
    g.fillOval(40, 40, 20, 20);    
  }
}