import java.awt.*;
import java.applet.*;

public class AnantApplet extends Applet 
{
   public void paint(Graphics g) 
   {
      
      // Draw a circle
      g.setColor(Color.red);
      g.drawOval(50, 50, 100, 100);

       // Draw a triangle inside the circle
      g.setColor(Color.blue);
      g.drawRect(50, 50, 100, 100);

      // Write ANANT inside a circle
      g.setColor(Color.black);
      g.drawString("ANANT", 80, 105);
     
   }
}

//C:\Program Files\Java\jdk-9\bin
