// importing Java AWT class  
import java.awt.*;    
// class AWTExample2 directly creates instance of Frame class  
class AWTExample2 
{   
   AWTExample2() // initializing using constructor 
   {  
      Frame f = new Frame();  // creating a Frame 
   
      Label l = new Label("Employee id:");  // creating a Label 
  
      Button b = new Button("Submit");  // creating a Button
  
      TextField t = new TextField();  // creating a TextField  
  
      // setting position of above components in the frame  
      l.setBounds(20, 80, 80, 30);  
      t.setBounds(20, 100, 80, 30);  
      b.setBounds(100, 100, 80, 30);  
  
      // adding components into frame    
      f.add(b);  
      f.add(l);  
      f.add(t);  
  
      f.setSize(400,300);  // frame size 300 width and 300 height    
  
      f.setTitle("Employee info");   // setting the title of frame 
          
      f.setLayout(null);   // no layout  
  
      f.setVisible(true);  // setting visibility of frame  
   }    
   public static void main(String args[]) // main method  
   {   
         // creating instance of Frame class   
         AWTExample2 awt_obj = new AWTExample2();    
   }  
}    