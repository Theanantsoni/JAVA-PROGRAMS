//interface demo...

interface demo
{
	int a=10,b=20;
	void function_a();
	void function_b();
}

class test implements demo
{
	public void function_a()	//compulsory in public...
	{
		System.out.println("The number of A is : " +a);
	}

	public void function_b()	//compulsory in public...
	{
		System.out.println("The number of B is : " +b);
	}
}

class program
{
	public static void main(String args[])
	{
		test tt=new test();
		tt.function_a();
		tt.function_b();
	}
}