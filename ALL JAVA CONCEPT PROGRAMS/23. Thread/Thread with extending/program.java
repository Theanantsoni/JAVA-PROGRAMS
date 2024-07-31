//Thread with extends ... 
class program extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running ...");
	}
	public static void main(String args[])
	{
		program pr=new program();
		pr.start();
	}
}