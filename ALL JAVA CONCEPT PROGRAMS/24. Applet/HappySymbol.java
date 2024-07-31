import java.awt.*;
import java.applet.*;

public class HappySymbol extends Applet 
{
  public void paint(Graphics g) 
  {
    // Draw body
    g.setColor(Color.ORANGE);
    g.fillOval(50, 50, 200, 200);

    // Draw eyes
    g.setColor(Color.BLACK);
    g.fillOval(90, 100, 30, 30);
    g.fillOval(170, 100, 30, 30);

    // Draw mouth
    g.drawArc(100, 150, 100, 50, 180, 180);
  }
}
