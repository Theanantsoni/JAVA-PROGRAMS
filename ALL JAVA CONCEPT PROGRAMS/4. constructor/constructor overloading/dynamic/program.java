//constructor overloading ...Dynamic...
import java.util.*;
class prog
{
	prog()
	{
		System.out.println("default constructor called...");
	}
	prog(int a,int b)
	{
		int ans=a+b;
		System.out.println("the addition is : " +ans);
	}
	prog(int a,int b,int c)
	{
		int ans=a+b+c;
		System.out.println("the addition is : " +ans);
	}
	prog(double x,double y)
	{
		double ans=x+y;
		System.out.println("the addition is : " +ans);
	}
}
class program
{
	public static void main(String args[])
	{
		int a,b,c;
		double x,y;
System.out.println("enter a value of A : ");
		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();
System.out.println("enter a value of B : ");
		Scanner sc2=new Scanner(System.in);
		b=sc2.nextInt();
System.out.println("enter a value of C : ");
		Scanner sc3=new Scanner(System.in);
		c=sc3.nextInt();
System.out.println("enter a value of X : ");
		Scanner sc5=new Scanner(System.in);
		x=sc5.nextDouble();
System.out.println("enter a value of Y : ");
		Scanner sc6=new Scanner(System.in);
		y=sc6.nextDouble();
prog pr=new prog();
	prog pr1=new prog(a,b);
	prog pr2=new prog(a,b,c);
	prog pr3=new prog(x,y);
	}
}