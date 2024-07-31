//method or function overloading...//Dynamic...
import java.util.*;
class prog
{
	void add(int a,int b)
	{
		int ans=a+b;
		System.out.println("the addition is = " +ans);
	}

	void add(int c,int d,int e)
	{
		int ans=c+d+e;
		System.out.println("the addition is = " +ans);
	}

	void add(double x,double y)
	{
		double ans=x+y;
		System.out.println("the addition is = " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		int a,b,c,d,e;
		double x,y;

		System.out.println("enter a A : ");
		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();

		System.out.println("enter a B : ");
		Scanner sc2=new Scanner(System.in);
		b=sc2.nextInt();

		System.out.println("enter a C : ");
		Scanner sc3=new Scanner(System.in);
		c=sc3.nextInt();

		System.out.println("enter a D : ");
		Scanner sc4=new Scanner(System.in);
		d=sc4.nextInt();

		System.out.println("enter a E : ");
		Scanner sc5=new Scanner(System.in);
		e=sc5.nextInt();

		System.out.println("enter a X : ");
		Scanner sc6=new Scanner(System.in);
		x=sc6.nextDouble();

		System.out.println("enter a Y : ");
		Scanner sc7=new Scanner(System.in);
		y=sc7.nextDouble();

		prog pr = new prog();
		pr.add(a,b);
		pr.add(c,d,e);
		pr.add(x,y);

	}
}