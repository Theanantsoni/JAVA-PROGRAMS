//..Access control modifier..protected..
class program 
{ 
	protected int a; 
	protected float b; 
	protected String str; 
	
	program() 
	{ 
		a = 111; 
		b = (float)123.456;
		str = "Protected Values !!!"; 
	} 
} 
class SubClass extends program 
{ 
	public void display() 
	{ 
		System.out.println("The Protected Integer Value is : "+a); 
		System.out.println("The Protected Float Value is : "+b); 
		System.out.println("The Protected String Value is : "+str); 
	} 
} 
class MainClass 
{ 
	public static void main(String args[]) 
	{ 
		SubClass obj = new SubClass(); 
		obj.display(); 
	} 
}

//OUTPUT :
The Protected Integer Value is : 111 
The Protected Float Value is : 123.456 
The Protected String Value is : Protected Values !!!