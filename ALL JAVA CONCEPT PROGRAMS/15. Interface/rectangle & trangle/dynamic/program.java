import java.util.*;
interface demo
{
	void tringle(double base,double height);
	void rectangle(double width,double height);
	void square(double area);
	void circle(double pi,double radius);
	
}

class sum implements demo
{
	public void tringle(double base,double height)
	{
		double ans=0.5*base*height;
		System.out.print("\nThe area of tringle is : "+ans);
	}

	public void rectangle(double width,double height)
	{
		double ans=width*height;
		System.out.print("\nThe area of rectangle is : "+ans);
	}
	public void square(double area)
	{
		double ans=area*area;
		System.out.print("\nThe area of square is : "+ans);
	}
	public void circle(double pi,double radius)
	{
		double ans=pi*radius*radius;
		System.out.print("\nThe area of circle is : "+ans);
	}
}

class program
{
	public static void main(String args[])
	{
		double base,height,width,area,radius;
		final double pi=3.14;

		sum s=new sum();

		System.out.print("\nEnter the value of base : ");
		Scanner sc1=new Scanner(System.in);
		base=sc1.nextDouble();

		System.out.print("Enter the value of height : ");
		Scanner sc2=new Scanner(System.in);
		height=sc2.nextDouble();

		System.out.print("Enter the value of width : ");
		Scanner sc3=new Scanner(System.in);
		width=sc3.nextDouble();

		System.out.print("Enter the value of area : ");
		Scanner sc4=new Scanner(System.in);
		area=sc4.nextDouble();

		System.out.print("Enter the value of radius : ");
		Scanner sc5=new Scanner(System.in);
		radius=sc5.nextDouble(); 

		s.tringle(base,height);
		s.rectangle(width,height);
		s.square(area);
		s.circle(pi,radius);
	}
}