//multi dimnesional dynamic demo ...
import java.util.*;

class program
{
	public static void main(String args[])
	{
		int size,val[][];
		
		val=new int[50][50];

		System.out.println("enter the size of an array : ");
		Scanner sc1=new Scanner(System.in);
		size=sc1.nextInt();

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("index no : ["+i+"] ["+j+"] Enter value : ");
				Scanner sc2=new Scanner(System.in);
				val[i][j]=sc2.nextInt();
			}
		}

		System.out.println("\n");

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println("index no is : ["+i+"] ["+j+"] value is : "+val[i][j]);
			}
		}

	}
}