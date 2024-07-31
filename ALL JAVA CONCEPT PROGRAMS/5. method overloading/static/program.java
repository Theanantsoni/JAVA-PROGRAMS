//method overloading...//static
//same name different parameter
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
		int a=10,b=20,c=30,d=40,e=50;
		double x=10.50,y=20.50;

		prog pr = new prog();
		pr.add(a,b);
		pr.add(c,d,e);
		pr.add(x,y);
	}
}