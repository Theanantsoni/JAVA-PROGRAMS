//Thread with implements ... 
class program implements Runnable
{
	public void run()
	{
		System.out.println("Thread is Running ...");
	}
	public static void main(String args[])
	{
		program pr=new program();
		Thread th=new Thread(pr);
		th.start();
	}
}