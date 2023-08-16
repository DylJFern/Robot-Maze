/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: Design for the MushroomBot
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//Creates a design for the MushroomBot
public class MushroomBotDesign extends Icon
{ 
  public MushroomBotDesign()
  {
    super();
  } 
  public void paintIcon(Graphics g)
  { 
    //Draw body
    g.setColor(Color.RED);
    g.fillRoundRect(30, 30, 40, 40, 10, 10);
    
    //Draw shoulders 
    g.setColor(Color.BLUE); 
    g.fillRect(20, 45, 10, 10);  
    g.fillRect(70, 45, 10, 10);
    
    //Draw arms  
    g.setColor(Color.RED); 
    g.fillOval(20, 20, 10, 35); 
    g.fillOval(70, 20, 10, 35);
    
    //Draw hands 
    g.setColor(Color.WHITE); 
    g.fillOval(20, 20, 10, 10); 
    g.fillOval(70, 20, 10, 10);
    
    //Draw eyes 
    g.setColor(Color.BLACK); 
    g.fillOval(35, 40, 10, 10); 
    g.fillOval(55, 40, 10, 10); 
  }
}



