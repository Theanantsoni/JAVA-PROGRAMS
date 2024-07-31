//array single and multi value print ...

class program
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60};

		//for print single value ...
		System.out.println("the value of an array is : "+arr[4]);

		//for print a multi value ...
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index number is ["+i+"] the value of an array is : "+arr[i]);
		}
	}
}