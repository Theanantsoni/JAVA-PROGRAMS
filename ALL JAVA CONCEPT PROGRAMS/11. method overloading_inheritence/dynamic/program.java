//method overloading with inheritance ...
//same name different parameter
import java.util.*;
class over
{
	void function_a(int no1,int no2)
	{
		int ans=no1+no2;
		System.out.println("function A ans is : " +ans);
	}
}
class load extends over
{
	void function_a(int no1,int no2,int no3)
	{
		int ans=no1+no2+no3;
		System.out.println("function B ans is : " +ans);
	}
}
class program
{
	public static void main(String args[])
	
	{
		int no1,no2,no3;

		System.out.print("enter no1 : ");
		Scanner sc1=new Scanner(System.in);
		no1=sc1.nextInt();

		System.out.print("enter no2 : ");
		Scanner sc2=new Scanner(System.in);
		no2=sc2.nextInt();

		System.out.print("enter no3 : ");
		Scanner sc3=new Scanner(System.in);
		no3=sc3.nextInt();

		load ld=new load();
		
		ld.function_a(no1,no2,no3);
		ld.function_a(no1,no2);
	}
}