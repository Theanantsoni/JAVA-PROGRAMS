//Access control modifier..Default
public class program 
{ 
	public int a = 10; 
	protected int b = 20; 
	private int c = 30; 

	void privateDisplay() 
	{ 
		c = c+100; 
		System.out.println("Private Variable : "+c); 
	} 
}
class SubClass extends program 
{ 
	void subDisplay() 
	{ 
		a = a+100; 
		b = b+100; 
		System.out.println("Protected Variable : "+b); 
		System.out.println("Public Variable : "+a); 
	} 
} 
class MainClass 
{ 
	public static void main(String args[]) 
	{ 
		SubClass subObj = new SubClass(); 
		subObj.privateDisplay(); 
		subObj.subDisplay(); 
	}
}

//OUTPUT : 
Private Variable : 130 
Protected Variable : 120 
Public Variable : 110


