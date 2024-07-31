import java.awt.*;

public class Hexagon extends java.applet.Applet 
{

   public void paint(Graphics g) 
   {
      g.setColor(Color.black); 
      int[] x = {50, 100, 150, 150, 100, 50};
      int[] y = {100, 100, 150, 200, 200, 150};
      //int nPoints = 6;

      g.drawPolygon(x,y,6);

      g.setColor(Color.yellow);

      g.fillPolygon(x,y,6);
   }
}

//C:\Program Files\Java\jdk-9\bin