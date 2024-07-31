//dynamic addition program ...

import java.util.*;
class program
{
	public static void main(String args[])
	{
		int i,fst[],scnd[],sum[],size;

		fst=new int[50];
		scnd=new int[50];
		sum=new int[50];

		System.out.println("enter the size of an array : ");
		Scanner sc1=new Scanner(System.in);
		size=sc1.nextInt();
		
		for(i=0;i<size;i++)
		{
			System.out.println("enter first array number : ");  
			Scanner sc2=new Scanner(System.in);
			fst[i]=sc2.nextInt();
		}

		for(i=0;i<size;i++)
		{
			System.out.println("enter second array number : ");
			Scanner sc3=new Scanner(System.in);
			scnd[i]=sc3.nextInt();
		}

		for(i=0;i<size;i++)
		{
			sum[i]=fst[i]+scnd[i];
			System.out.println("sum is : " +sum[i]);
		}

		//display ...

		for(i=0;i<size;i++)
		{
			System.out.println("Index No: [" +i+ "]" +fst[i]);
		}

		System.out.print("\n");

		for(i=0;i<size;i++)
		{
			System.out.println("Index No: [" +i+ "]" +scnd[i]);
		}

		System.out.print("\n");

		for(i=0;i<size;i++)
		{
			System.out.println("Index No: [" +i+ "] sum is : " +sum[i]);
		}

		System.out.print("\n");
	}
}