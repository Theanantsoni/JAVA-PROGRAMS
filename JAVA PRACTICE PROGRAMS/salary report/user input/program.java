 //user_input ...

 import java.util.*;
 class program
 {
 	public static void main(String args[])
 	{
 		float sal,bon,hra,tot;
 	

 		System.out.print("enter the employee salary : ");
 		Scanner sc1=new Scanner(System.in);
 		sal=sc1.nextFloat();

 		bon=sal*10/100;
 		hra=sal*5/100;
 		tot=sal+bon+hra;

 		System.out.print("\nbonus is : "+bon);
 		System.out.print("\nhra is : "+hra);
 		System.out.print("\ntotal salary is : "+tot);

 	}
 }