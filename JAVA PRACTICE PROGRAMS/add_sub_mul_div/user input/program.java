 import java.util.*;
/*-------or-------*/
/*---import java.util.Scanner;---*/

 class program
 {
 	public static void main(String args[])
 	{
 		int no1,no2,add,sub,mul,div;

 		System.out.print("enter the first number: ");
 		Scanner sc1=new Scanner(System.in);
 		no1=sc1.nextInt();

 		System.out.print("enter the second number: ");
 		Scanner sc2=new Scanner(System.in);
 		no2=sc2.nextInt(); 

 		add=no1+no2;
 		System.out.print("\nthe addition is: "+add);

 		sub=no2-no1;
 		System.out.print("\nthe subtraction is: "+sub);

 		mul=no1*no2;
 		System.out.print("\nthe multiplication is: "+mul);

 		div=no2/no1;
 		System.out.print("\nthe division is: "+div);


 	}
 }