//awt Abstract Window Toolkit 
import java.awt.*; 
import java.awt.event.*;
class windowevent extends Frame
{
 public windowevent() 
 {
	// Set the frame properties
	setTitle("Button with ActionListener Demo");
	setSize(1000,400);
	setVisible(true);
	// Add window listener
	
	addWindowListener(new WindowListener()
	{
		public void windowOpened(WindowEvent we)
		{
			System.out.println("Window Opened");
		}
		
		public void windowClosing(WindowEvent we)
		{
			System.out.println("Window Closing");
			System.exit(0);
		}
		
		public void windowClosed(WindowEvent we)
		{
			// Will not be printed
			System.out.println("Window Closed");
		}
		
		public  void windowIconified(WindowEvent we)
		{
			setTitle("Iconified");
		}
		
		public  void windowDeiconified(WindowEvent we)
		{
			setTitle("Deiconified");
		}
		
		public void windowActivated(WindowEvent we)
		{
			System.out.println("Window Activated");
		}
		
		public void windowDeactivated(WindowEvent we)
		{
			System.out.println("Window Deactivated");
		}
	});
 }
 
	public static void main(String args[])
	{
		new windowevent();
	}
}