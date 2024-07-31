//Area of square..
//Dynamic 
import java .util.*;

class square
{
	void display(int area)
	{
		int ans=area*area;
		System.out.println("area of square : " +ans);
	}
}

class program
{
	public static void main(String args[])
	{
		int area;
		System.out.print("\n");

		System.out.println("enter the area of square : ");
		Scanner sc1=new Scanner(System.in);
		area=sc1.nextInt();
		
		System.out.print("\n");

		square sqr=new square();
		sqr.display(area);
	}
}