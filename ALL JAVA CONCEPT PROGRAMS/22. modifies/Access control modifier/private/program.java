//..Access control modifier..private..
class program 
{ 
	private int a; 
	private float b; 
	private String str; 

	program() 
	{ 
		a = 123; 
		b = (float)52.38; 
		str = "Private Values !!!"; 
	} 

	private void get() 
	{ 
		System.out.println("The Private Integer Value is : "+a); 
		System.out.println("The Private Float Value is : "+b); 
		System.out.println("The Private String Value is : "+str); 
	} 
	public void display() 
	{ 
		get(); 
	} 
} 
class MainClass 
{ 
	public static void main(String args[]) 
	{ 
		program obj = new program(); 
		obj.display(); 
	} 
}

//OUTPUT :
The Private Integer Value is : 123 
The Private Float Value is : 52.38 
The Private String Value is : Private Values !!!