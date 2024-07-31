//multiple inheritance ... 
//multiple inheritence is not supported in java ...
//it will be support ..used for interface 

import java.util.*;
class a
{
	void function(Double b,Double h)
	{
		Double p=b*h;
		System.out.println("area of parallelogram is : " +p);
	}
}
class b 
{
	void function()
	{
		System.out.println("hello");
	}
}
class c extends b,a //ERROR SHOW HERE ...
{
	void function_c()
	{
		System.out.println("good");
	}
}
class program
{
	public static void main(String args[])
	{
		double b,h;
	
	System.out.println("enter the base of parallelogram : " );
		Scanner sc1=new Scanner(System.in);
		b=sc1.nextDouble();
	
	System.out.println("enter the hight of parallelogram : " );
		Scanner sc2=new Scanner(System.in);
		h=sc2.nextDouble();

		c cc=new c();
		cc.function(b,h);
		cc.function();
		cc.function_c();
	}
}