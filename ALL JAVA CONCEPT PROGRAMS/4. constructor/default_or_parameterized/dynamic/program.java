//default or parameterized
//dynamic
 import java.util.*;
 class prog
 {
 	prog()
 	{
 		/*int add=no1+no2;
 		System.out.println("the addition is : "+add); */
 		System.out.println("hello");
 	}
 	prog(int no1,int no2)
 	{
 		int sub=no2-no1;
 		System.out.println("the subtrsction is : "+sub);
 	}
 
 }

 class program
 {
 	public static void main(String args[])
 	{

 	int no1,no2;

 	System.out.println("enter a first number : ");
 	Scanner sc1=new Scanner(System.in);
 	no1=sc1.nextInt();

 	System.out.println("enter a second number : ");
 	Scanner sc2=new Scanner(System.in);
 	no2=sc2.nextInt();

	prog pr=new prog();
	prog pr1=new prog(no1,no2);
	}

 }