/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 16, 2023
 *Description: Design for the SamusBot
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//Creates a design for the SamusBot
public class SamusBotDesign extends Icon
{ 
  public SamusBotDesign()
  {
    super();
  } 
  
  public void paintIcon(Graphics g)
  { 
    //Draw body
    g.setColor(Color.RED); 
    g.fillRoundRect(30, 30, 40, 40, 10, 10);
    
    //Draw shoulders 
    g.setColor(Color.GREEN); 
    g.fillRect(20, 45, 10, 10);  
    g.fillRect(70, 45, 10, 10);
    
    //Draw arms 
    g.setColor(Color.ORANGE); 
    g.fillOval(20, 20, 10, 35); 
    g.fillOval(70, 20, 10, 35);
    
    //Draw eyes 
    g.setColor(Color.GREEN); 
    g.fillRect(35, 40, 20, 10); 
    g.fillRect(55, 40, 10, 10);  
    
    //Draw blaster
    g.setColor(Color.GREEN); 
    g.fillOval(70, 20, 10, 10);  
  }
}