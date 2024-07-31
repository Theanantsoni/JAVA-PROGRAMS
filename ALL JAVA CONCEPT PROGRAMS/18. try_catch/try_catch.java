//try_catch method in java : -

class try_catch
{
	public static void main(String args[])
	{
		try	
		{
			int data=50/0;
		}

		catch(Exception e)
		{
			System.out.print("\n" +e);
		}

		finally
		{
			System.out.println("\n\nFinally block is always executed");
		}

		System.out.println("\nrest of code");
	}
}