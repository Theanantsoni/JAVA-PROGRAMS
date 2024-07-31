class program
{
	 public static void main(String args[])
	{
		int i,a[]={10,20,30,40,50,60},b[]={20,50,60,70,30,10},ans[],sub[];
		ans=new int[50];
		sub=new int[50];
		for(i=0;i<a.length;i++)
		{
				ans[i]=a[i]+b[i];
				System.out.println("the ans is : "+ans[i]);	
		}

		for(i=0;i<a.length;i++)
		{
			sub[i]=a[i]-b[i];
			System.out.println("sub is : " +sub[i]);
		}
	}
}