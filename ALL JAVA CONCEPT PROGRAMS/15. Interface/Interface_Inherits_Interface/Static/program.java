//Interface_Inherits_Interface...
//Static
interface circle
{
	double pi=3.14;
	int base=10,height=20;
	void find_circle();
}

interface square extends circle
{
	int area=10;
	void find_square();
}

interface tringle extends square
{
	int radius=50;
	void find_tringle();
}

interface rectangle extends tringle
{
	int width=30;
	void find_rectangle();
}

class shape implements rectangle
{
	public void find_circle()
	{
		double ans=pi*base*height;
		System.out.println("The area of circle is : " +ans);
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

	public void find_rectangle()
	{
		double ans=height*width;
		System.out.println("The area of rectangle is : " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		shape sh=new shape();
		sh.find_circle();
		sh.find_square();
		sh.find_tringle();
		sh.find_rectangle();
	}
}