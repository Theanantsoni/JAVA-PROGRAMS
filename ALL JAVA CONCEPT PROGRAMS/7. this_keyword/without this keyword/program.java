//without this keyword
//static

class info
{

	int id;
	String name;
	double fees;

	info() //constructor
	{
		System.out.println("hello world");
	}
	
	void print() //function 
	{
		System.out.println("Hello");
	}

	info(int i,String n,double f)
	{
		id = i;
		name= n;
		fees=f;
	}

	void display()
	{

		System.out.println("Student Id Is: "+id);
		System.out.println("Student Name is :"+name);
		System.out.println("Student Fees is: "+fees);

	}

}

class program
{
	public static void main(String args[])
	{
		info in4= new info();
		info in =  new info(1,"ABCX",7852.30);
		info in2 =  new info(2,"ABDC",8564.58);
		in.display();
		in2.display();
	}
}