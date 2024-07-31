//tringle & rectangle ...//Static...
interface demo
{
	 double base=10,height=30,width=20,area=50,radius=5;
	 final double pi=3.14;

	 void tringle();
	 void rectangle();
	 void square();
	 void circle();
}

class sum implements demo
{
	public void tringle()
	{
		double ans=0.5*base*height;
		System.out.println("The area of tringle is : "+ans);
	}

	public void rectangle()
	{
		double ans=width*height;
		System.out.println("The area of rectangle is : "+ans);
	}
	public void square()
	{
		double ans=area*area;
		System.out.println("The area of square is : "+ans);
	}
	public void circle()
	{
		double ans=pi*radius*radius;
		System.out.println("The area of circle is : "+ans);
	}
}
class program
{
	public static void main(String args[])
	{
		sum s=new sum();
		s.tringle();
		s.rectangle();
		s.square();
		s.circle();
	}
}