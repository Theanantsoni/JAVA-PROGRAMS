//constructor overloading ...
//..static...
class prog
{
	prog()
	{
		System.out.println("default constructor calld...");
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
		int a=20,b=30,c=20,d=30;
		double x=100,y=50;

		prog pr=new prog();
		prog pr1=new prog(a,b);
		prog pr2=new prog(a,b,c);
		prog pr3=new prog(x,y);
	}
}