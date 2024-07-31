// multiple_interface ...
//sums...//dynamic...

import java.util.*;

interface inter_circle
{
	double pi=3.14;
	void find_circle(double base,double height);
}

interface inter_rectangle
{
	void find_rectangle(double height,double width);
} 

interface inter_square
{
	void find_square(double area);
}

interface inter_tringle
{
	void find_tringle(double radius);
}

class sums implements inter_circle,inter_rectangle,inter_square
{
	public void find_circle(double base,double height)
	{
		double ans=pi*base*height;
		System.out.println("The area of circle is : " +ans); 	
	}

	public void find_rectangle(double height,double width)
	{
		double ans=height*width;
		System.out.println("The area of rectangle is : " +ans);
	}

	public void find_square(double area)
	{
		Double ans=area*area;
		System.out.println("The area of square is : " +ans);
	}

	public void find_tringle(double radius)
	{
		double ans=pi*radius*radius;
		System.out.println("The area of tringle is : " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		double base,height,width,area,radius;
		sums ss=new sums();

		System.out.print("Enter the value of Base : ");
		Scanner sc1=new Scanner(System.in);
		base=sc1.nextDouble();

		System.out.print("Enter the value of Height : ");
		Scanner sc2=new Scanner(System.in);
		height=sc2.nextDouble();

		System.out.print("Enter the value of Width : ");
		Scanner sc3=new Scanner(System.in);
		width=sc3.nextDouble();

		System.out.print("Enter the value of Area : ");
		Scanner sc4=new Scanner(System.in);
		area=sc4.nextDouble();

		System.out.print("Enter the value of Radius : ");
		Scanner sc5=new Scanner(System.in);
		radius=sc5.nextDouble();

		ss.find_circle(base,height);
		ss.find_rectangle(height,width);
		ss.find_square(area);
		ss.find_tringle(radius);
	}
} 


