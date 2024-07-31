//selected numbers...//dynamic

import java.util.*;
class program
 {
 	public static void main(String args[])
 	{
 		int number;
 		System.out.println("enter any number between 1 to 30 : ");
 		Scanner sc1=new Scanner(System.in);
 		number=sc1.nextInt();

 		if(number>0 && number<=10)
 		{
 			System.out.println("you selected number between 1 to 10");
 		}
 		else if(number>10 && number<=20)
 		{
 			System.out.println("you selected number between 11 to 20");
 		}
 		else if(number>20 && number<=30)
 		{
 			System.out.println("you selected number between 21 to 30");
 		}
 		else
 		{
 			System.out.println("invalid number");
 		}
 	}
}