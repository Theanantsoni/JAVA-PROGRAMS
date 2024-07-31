// multiple_interface ...
//sums...//static...

interface inter_circle
{
	double pi=3.14;
	int base=10,height=20;
	void find_circle();
}

interface inter_rectangle
{
	int width=30;
	void find_rectangle();
}

interface inter_square
{
	int area=10;
	void find_square();
}

interface inter_tringle
{
	int radius=50;
	void find_tringle();
}

class sums implements inter_circle,inter_rectangle,inter_square,inter_tringle
{
	public void find_circle()
	{
		double ans=pi*base*height;
		System.out.println("The area of circle is : " +ans);
	}

	public void find_rectangle()
	{
		double ans=height*width;
		System.out.println("The area of rectangle is : " +ans);
	}

	public void find_square()
	{
		double ans=area*area;
		System.out.println("The area of square is : " +ans);
	}

	public void find_tringle()
	{
		double ans=pi*radius*radius;
		System.out.println("The area of tringle is : " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		sums cl=new sums();

		cl.find_circle();
		cl.find_rectangle();
		cl.find_square();
		cl.find_tringle();
	}
}