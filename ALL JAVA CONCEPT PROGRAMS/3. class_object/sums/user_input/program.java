//Class & object//sums
//dynamic
import java.util.*;

class prog
{
	void add(int a,int b)
	{
		int ans=a+b;
		System.out.println("the addition is : " +ans);
	}
	void sub(int a,int b)
	{ 
		int ans=a-b;
		System.out.println("the subtraction is : " +ans);
	}
	void mul(int a,int b)
	{
		int ans=a*b;
		System.out.println("the multiplication is : " +ans);
	}
	void div(int a,int b)
	{
		int ans=a/b;
		System.out.println("the division is : " +ans);
	}

	void display(int no1,int no2,int no3,int no4,int no5)
	{
		System.out.println("the 1st number display is : "+no1);
		System.out.println("the 2nd number display is : "+no2);
		System.out.println("the 3rd number display is : "+no3);
		System.out.println("the 4th number display is : "+no4);
		System.out.println("the 5th number display is : "+no5);
	}
}

class program
{
	public static void main(String args[])
	{
		int a,b,no1,no2,no3,no4,no5;

		System.out.print("\n");
		System.out.println("----------: SUMS :----------");
		System.out.print("\n");
		System.out.println("enter a first no : ");
		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();

		System.out.println("enter a second no : ");
		Scanner sc2=new Scanner(System.in);
		b=sc2.nextInt();

		prog pr=new prog();
		
		pr.add(a,b);
		pr.sub(a,b);
		pr.mul(a,b);
		pr.div(a,b);

		System.out.println("\n---------------: DISPLAY NUMBER :---------------");
		System.out.print("\n");

		System.out.println("enter a display number one : ");
		Scanner sc3=new Scanner(System.in);
		no1=sc3.nextInt();

		System.out.println("enter a display number two : ");
		Scanner sc4=new Scanner(System.in);
		no2=sc4.nextInt();

		System.out.println("enter a display number three : ");
		Scanner sc5=new Scanner(System.in);
		no3=sc5.nextInt();

		System.out.println("enter a display number four : ");
		Scanner sc6=new Scanner(System.in);
		no4=sc6.nextInt();

		System.out.println("enter a display number five : ");
		Scanner sc7=new Scanner(System.in);
		no5=sc7.nextInt();

		pr.display(no1,no2,no3,no4,no5);

	}
}


