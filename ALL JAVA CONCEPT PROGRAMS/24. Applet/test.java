import java.awt.*;
import java.applet.*;

public class test extends Applet 
{
   public void paint(Graphics g) 
   {
      // Draw a circle
      g.setColor(Color.red);
      g.drawOval(64, 60, 75, 75);
      g.fillOval(64, 60, 75, 75);

       // Draw a triangle inside the circle
      g.setColor(Color.blue);
      g.drawRect(77, 73, 50, 50);
      g.fillRect(77, 73, 50, 50);

      // Write ANANT inside a circle
      g.setColor(Color.green);
      g.drawString("ANANT", 80, 105);
    }
}

//C:\Program Files\Java\jdk-9\bin
