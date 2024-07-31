import java.awt.*;
import java.awt.event.*;

class myframe extends Frame
{
	public void paint(Graphics g)
	{
		g.drawString("Example",400,500);
	}
} 
class first_frame
{
	public static void main(String args[])
	{
		myframe f = new myframe();
		f.setVisible(true);
		f.setSize(400,500);
		f.setTitle("My frame");
	}
}