import java.util.*;

class program
{
	public static void main(String args[])
	{
		int arr[];
		arr=new int[50];
		int size,i;

		System.out.print("enter the size of an array : ");
		Scanner sc1=new Scanner(System.in);
		size=sc1.nextInt();

		for(i=0;i<size;i++)
		{
			System.out.print("enter the element of an array ["+i+"]: ");
			Scanner sc2=new Scanner(System.in);
			arr[i]=sc2.nextInt();
		}

		for(i=0;i<size;i++)
		{
			System.out.println("Index no is : ["+i+"] element number is : "+arr[i]);
		}

	}
}