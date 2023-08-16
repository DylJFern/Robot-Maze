/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: June 15, 2015
 *Description: Design for all the GuardBots
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//Creates a design for the GuardBot
public class GuardBotDesign extends Icon
{ 
  public GuardBotDesign()
  {
    super();
  } 
  
  public void paintIcon(Graphics g)
  { 
    //Draw body
    g.fillRoundRect(30, 30, 40, 40, 10, 10);
    
    //Draw shoulders 
    g.fillRect(20, 45, 10, 10);  
    g.fillRect(70, 45, 10, 10);
    
    // Draw arms 
    g.fillOval(20, 20, 10, 35); 
    g.fillOval(70, 20, 10, 35);
    
    // Draw eyes 
    g.setColor(Color.RED); 
    g.fillOval(35, 40, 10, 10); 
    g.fillOval(55, 40, 10, 10); 
  }
}