 //positive negative or zero //dynamic
 import java.util.*;
 class program
 {
 	public static void main(String args[])
 	{
 		int number;

 		System.out.println("enter any number : ");
 		Scanner sc1=new Scanner(System.in);
 		number=sc1.nextInt();
 		
 		if(number>0)
 		{
 			System.out.println("number is positive" +number);
 		}
 		else if(number<0)
 		{
 			System.out.print("number is negative" +number);
 		}
 		else
 		{
 			System.out.print("number is zero" +number);
 		}
 	}
 }
