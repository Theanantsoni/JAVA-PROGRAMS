//overriding with inheritance...
//same name same parameter
import java.util.*;
class first
{
	void calc(int no1,int no2)
	{
		int ans=no1+no2;
		System.out.println("Addition is : " +ans);
	}
}

class second extends first
{
	void calc(int no1,int no2)
	{
		super.calc(no1,no2);
		int ans=no1-no2;
		System.out.println("subtraction  is : " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		int no1,no2;

		second sc=new second();

		first f=new first();

		System.out.print("enter first number : ");
		Scanner sc1=new Scanner(System.in);
		no1=sc1.nextInt();

		System.out.print("enter second number : " );
		Scanner sc2=new Scanner(System.in);
		no2=sc2.nextInt();

		sc.calc(no1,no2);
	}

}