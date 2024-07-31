class program extends Thread
{
	public program(String str)
	{
		super(str);
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+""+getName());
			try
			{
				sleep((int)(Math.random()*1000));	//time...
			}
			catch(InterruptedException e)
			{

			}
			System.out.println("DONE..." +getName());
		}
	}

}

class threadprogram 
{
	public static void main(String args[])
	{
		new program("anant").start();
		new program("brij").start();
		new program("ashutosh").stop();
	}
}

//C:\Program Files\Java\jdk-9\bin