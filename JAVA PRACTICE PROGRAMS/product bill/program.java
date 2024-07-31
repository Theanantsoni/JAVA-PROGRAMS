//half program

import java.util.*;
class practice
{
	static void tax(double prc)
	{
		double sgst=prc*9/100;
		System.out.println("SGST is : " +sgst);

		double cgst=prc*9/100;
		System.out.println("CGST is : " +cgst);
	}

	/*static void discount(double dis,double prc)
	{
		double dis=prc-7/100;
		System.out.println("DISCOUNT is : " +dis);
	}*/

	static void subtotal(double sgst,double cgst)
	{
		double tot=sgst+cgst;
		System.out.println("SUB TOTAL is : " +tot);
	}
}

class program
{
	public static void main(String args[])
	{
		String pdct;
		int qty;
		double prc,sgst,cgst;

		System.out.println("enter the name of product : ");
		Scanner sc1=new Scanner(System.in);
		pdct=sc1.nextLine();

		System.out.println("enter the price of this product : ");
		Scanner sc2=new Scanner(System.in);
		prc=sc2.nextDouble();

		System.out.println("enter the quantity of this product : ");
		Scanner sc3=new Scanner(System.in);
		qty=sc3.nextInt();

		/*System.out.println("enter the discount of this product : ");
		Scanner sc4=new Scanner(System.in);
		dis=sc4.nextDouble();*/

		
		practice.tax(prc);
		//practice.discount(prc);
		practice.subtotal(sgst,cgst);

	}
}