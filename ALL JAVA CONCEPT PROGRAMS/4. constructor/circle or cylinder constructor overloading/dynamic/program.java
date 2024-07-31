//Constructor...
//Dynamic...
import java.util.*;
class prog
{
	prog(double pi,double r)
	{
		double ans=pi*r*r;
		System.out.println("the area of circle value is : " +ans);
	}

	prog(double pi,double r,double h)
	{
		double ans=pi*r*r*h;
		System.out.println("the volume of cylinder : " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		double r,h;
		final double  pi=3.14;

		System.out.println("enter the value of R : ");
		Scanner sc1=new Scanner(System.in);
		r=sc1.nextDouble();

		System.out.println("enter the value of H : ");
		Scanner sc2=new Scanner(System.in);
		h=sc2.nextDouble();


		prog pr=new prog(pi,r);

		prog pr1=new prog(pi,r,h);


	}

}