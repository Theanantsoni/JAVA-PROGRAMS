//hierarchical inheritence...
class a
{
	void function_a()
	{
		System.out.println("call class A");
	}
}

class b extends a
{
	void function_b()
	{
		System.out.println("calling class B");
	}
}

class c extends a
{
	void function_c()
	{
		System.out.println("calling class C");
	}
}

class program
{
	public static void main(String args[])
	{
		c cc=new c();
		b bb=new b();

		cc.function_a();
		bb.function_b();
		cc.function_c();
	}
}