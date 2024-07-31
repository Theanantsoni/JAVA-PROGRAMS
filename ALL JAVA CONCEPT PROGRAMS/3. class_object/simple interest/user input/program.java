//Simple Interest..
//Dynamic
import java.util.*;

class interest
{
	void display(double p,double r,double n)
	{
		System.out.print("\n");
		double ans=p*r*n/100;
		System.out.println("the simple interest of prodect is : " +ans);
	}
}
 class program
 {
 	public static void main(String args[])
 	{
 		double p,r,n;

 		System.out.print("\n");
 		System.out.println("enter the price of product : ");
 		Scanner sc1=new Scanner(System.in);
 		p=sc1.nextDouble();

 		System.out.println("enter the rant of product : ");
 		Scanner sc2=new Scanner(System.in);
 		r=sc1.nextDouble();

 		System.out.println("enter the no. of product : ");
 		Scanner sc3=new Scanner(System.in);
 		n=sc1.nextDouble();

		interest intrst=new interest();
 		intrst.display(p,r,n);
 	}
 }