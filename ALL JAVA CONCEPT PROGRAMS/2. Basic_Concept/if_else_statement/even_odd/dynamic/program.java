//if-else statement //even or odd number  //dynamic
import java.util.*;
class program
{
	public static void main(String args[])
	{
		int number;
		System.out.println("enter a number : ");
		Scanner sc1=new Scanner(System.in);
		number=sc1.nextInt();
		{
			if(number%2==0)
			{
				System.out.print( "number is even" +number);
			}
			else
			{
				System.out.print( "number is odd" +number);
			}
		}

	}
}