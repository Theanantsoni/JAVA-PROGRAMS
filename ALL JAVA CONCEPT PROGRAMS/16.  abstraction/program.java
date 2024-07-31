//abstraction static 

abstract class sums
{
	int no1,no2;
	
	abstract void add();
	abstract void sub();
}

class first extends sums
{
	 void add()
	{
		int ans=no1+no2;
		System.out.println("The addition is : " +ans);
	}
}

class second extends sums
{
	 void sub()
	{
		int ans=no2-no1 ;
		System.out.println("The subtraction is : " +ans);
	}
}

abstract class program
{
	public static void main(String args[])
	{
		int no1=10,no2=20;

		first ft=new first();
		ft.add();

		second sc=new second();
		sc.sub();
	}
}


OUTPUT : :

The addition is : 30

The subtraction is : 10
