/*Credit to: Bailey, Dinith, and William
 *Created: June 15, 2015
 *Last Modified: August 15, 2023
 *Description: Design for the PokeBot
 */

import becker.robots.icons.*;
import java.awt.Color;
import java.awt.*;

//Creates a design for the PokeBot
public class PokeBotDesign extends Icon
{ 
  public PokeBotDesign()
  {
    super();
  } 
  
  public void paintIcon(Graphics g)
  { 
    //Draw body
    g.setColor(Color.YELLOW); 
    g.fillRoundRect(30, 30, 40, 40, 10, 10);
    
    //Draw shoulders 
    g.setColor(Color.RED); 
    g.fillRect(20, 45, 10, 10);  
    g.fillRect(70, 45, 10, 10);
    
    //Draw arms 
    g.setColor(Color.YELLOW); 
    g.fillOval(20, 20, 10, 35); 
    g.fillOval(70, 20, 10, 35);
    
    //Draw eyes 
    g.setColor(Color.BLACK); 
    g.fillOval(35, 40, 10, 10); 
    g.fillOval(55, 40, 10, 10);
    
    //Draw tail
    g.setColor(Color.YELLOW); 
    g.fillRect(45, 70, 10, 20); 
    
    //Draw tail stripe
    g.setColor(new Color(153,76,0));
    g.fillRect(45, 70, 10, 5);
  }
}



