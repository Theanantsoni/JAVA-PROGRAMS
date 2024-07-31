//single inheritance ...
import java.util.*;
class A 	//Base Class or Super Class or Parent Class
{
	void msg() //baic function 
	{
		System.out.println("Hello");
	}
	void display()
	{
		System.out.println("Hello Good Morning");
	}
}
class B extends A	//Derived Class or Sub Class or Chlid Class
{
	void func(int a,int b)
	{
		msg(); //print a basic function ...
		System.out.println("the value of A is : "+a);
		System.out.println("the value of B is : "+b);
	}
}
class program
{
	public static void main(String args[])
	{
		int a,b;
		B bb=new B();
	System.out.print("enter value of A : ");
		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();
	System.out.print("enter value of B : ");
		Scanner sc2=new Scanner(System.in);
		b=sc2.nextInt();

		bb.func(a,b);
		bb.display();
	}
}