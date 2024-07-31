//Access control modifier..public..
class program 
{ 
	public int a; 
	public float b; 
	public String str; 
	
	program() 
	{ 
		a = 10; 
		b = (float)12.34; 
		str = "Public Values !!!"; 
	} 
	public void display() 
	{ 
		System.out.println("The Public Integer Value is : "+a); 
		System.out.println("The Public Float Value is : "+b); 
		System.out.println("The Public String Value is : "+str); 
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
The Public Integer Value is : 10 
The Public Float Value is : 12.34 
The Public String Value is : 
Public Values !!!