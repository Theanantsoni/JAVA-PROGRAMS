//super keyword...
import java.util.*;
class sup
{	
	int eid=20;
	void calc(int no1,int no2)
	{
		int ans=no1+no2;                                                                                          
		System.out.println("The Addition is: " +ans);
	}
}

class sub extends sup
{
	int eid=90,no1,no2; 
	void calc(int no1,int no2)
	{
		super.calc(no1,no2);
		System.out.println("employee id number is [sub class] : " +eid);
		System.out.println("employee id number is [super class] : " +super.eid);
	}
}

class program
{
	public static void main(String args[])
	{
		int no1,no2;

		sub sb=new sub();

		System.out.print("enter no1 : ");
		Scanner sc1=new Scanner(System.in);
		no1=sc1.nextInt();

		System.out.print("enter no2 : ");
		Scanner sc2=new Scanner(System.in);
		no2=sc2.nextInt();

		sb.calc(no1,no2);	
		
	}
}