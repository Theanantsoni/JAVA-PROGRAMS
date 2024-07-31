class program
{
	public static void main(String args[])
	{
		int arr[][]={
						{10,20,30},
						{20,30,40},
						{30,40,50}
					};
		System.out.println("The value of an array is :"+arr[2][0]);

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("index no is: ["+i+"] ["+j+"] value is : " +arr[i][j]);
			}
		}
	}
}