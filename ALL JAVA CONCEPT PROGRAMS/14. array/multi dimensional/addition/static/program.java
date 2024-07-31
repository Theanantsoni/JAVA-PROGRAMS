//static addition program ...

class program
{
	public static void main(String args[])
	{
		int i,j,fst[][]={
						{10,20,30},
						{20,30,40},
						{30,40,50}
					};
		int scnd[][]={
					 {30,40,50},
					 {40,50,60},
					 {50,60,70}
				   };
		int sum[][];

		sum=new int[50][50];

		System.out.print("\nfirst : \n");
		for(i=0;i<fst.length;i++)
		{
			for(j=0;j<fst.length;j++)
			{
				System.out.print("["+i+"]["+j+"]"+fst[i][j]+" ");
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.print("\nsecond  : \n" );
		for(i=0;i<scnd.length;i++)
		{
			for(j=0;j<scnd.length;j++)
			{
				System.out.print("["+i+"]["+j+"]"+scnd[i][j]+" ");
				System.out.print("\t");
			}
			System.out.print("\n");
		}

		System.out.print("\nsum  : \n" );
		for(i=0;i<fst.length;i++)
		{
			for(j=0;j<scnd.length;j++)
			{
				sum[i][j]=fst[i][j]+scnd[i][j];
				System.out.print("["+i+"]["+j+"]"  +sum[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}	

	}
}