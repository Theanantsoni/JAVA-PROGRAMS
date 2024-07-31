//method overriding...STATIC
//same name same parameter

class first_class
{
	void first(int no1,int no2)
	{
		int ans=no1+no2;
		System.out.println("addition : " +ans);		
	}
	void first(Double a,Double b)
	{
		
		Double ans=a-b;
		System.out.print("subtraction : " +ans); 
	}
}

class program
{
	public static void main(String args[])
	{
		int no1=40,no2=30;
		Double a=20.00,b=10.00;
		first_class fr=new first_class();
		fr.first(no1,no2);
		fr.first(a,b);
	}
}