//STATIC_KEYWORD...
class demo
{
	int a=80;	//simple variable 
	static int b=70;	//static variable

	static void add(int x,int y)
	{
		int ans=x+y;
		System.out.println("the answer is : " +ans);
	}

	static
	{
		System.out.println("hello");
	}
}

class program
{
	public static void main(String args[])
	{
		int x=10,y=20;
		//System.out.println("A is:" +key.a);	//Cannot Be Access, Because Variable is Not a Static.
		
		System.out.println("B is : " +demo.b);//it is Accessed Because The Variable is Static.
		//Static Variable Can Access Using "Classname.Variable_name".

		demo.add(x,y);//Access The Static Function Using "Class_Name.Function_name" 
		//Without Creating Object of Class
	}
}