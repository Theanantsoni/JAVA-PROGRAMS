//dynamic addition program ...
import java.util.*;
class program
{
	public static void main(String args[])
	{
		int i,j,row,col,fst[][],scnd[][],sum[][];
	
		fst=new int[50][50];
		scnd=new int[50][50];
		sum=new int[50][50];
		

		System.out.println("enter a size of first row : ");
		Scanner sc1=new Scanner(System.in);
		row=sc1.nextInt();

		System.out.println("enter a size of first column : ");
		Scanner sc2=new Scanner(System.in);
		col=sc2.nextInt();
		System.out.print("\nenter first metrix : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("index number [" +i+ "][" +j+ "] number is : ");
				Scanner sc3=new Scanner(System.in);
				fst[i][j]=sc3.nextInt();
			}
		}
		System.out.print("\nenter second metrix : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("index number [" +i+ "][" +j+ "] number is : ");
				Scanner sc6=new Scanner(System.in);
				scnd[i][j]=sc6.nextInt();
			}
		}	
		System.out.print("\nfirst metrix : \n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(" "+fst[i][j]+ " " );
			}
			System.out.print("\n");
		}
		System.out.print("\nsecond metrix : \n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(" " +scnd[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.print("\nsum of metrix : \n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				sum[i][j]=fst[i][j]+scnd[i][j];
				System.out.print("["+i+"]["+j+"]"  +sum[i][j] );
				System.out.print("\t");
			}
			System.out.print("\n");
		}	

	}
}