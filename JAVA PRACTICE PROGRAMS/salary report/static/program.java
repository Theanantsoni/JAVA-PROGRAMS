//static program ...

class program
{
	public static void main(String args[])
	{
		int sal=20000,bon,hra,tot;

		bon=sal*10/100;
		System.out.print("\nbonus is : "+bon);

		hra=sal*5/100;
		System.out.print("\nhra is : "+hra);

		tot=sal+bon+hra;
		System.out.print("\ntotal salary is : "+tot);
	}
}