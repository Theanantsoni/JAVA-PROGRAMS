// multilevel program : 

import java.util.*;
class parallelogram
{
	void function(Double b,Double h)
	{
		Double p=b*h;
		System.out.println("area of parallelogram is : " +p);
	}
}
class tringle extends parallelogram
{

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

		tringle tr=new tringle();
		tr.function(b,h);
	}
}