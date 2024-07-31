class program
{
	public void finalize()
	{
		System.out.println("Finalize called");
	}

	public static void main(String args[])
	{
		program p1=new program();
		program p2=new program();

		p1=null;
		p2=null;

		System.gc();
	}
}