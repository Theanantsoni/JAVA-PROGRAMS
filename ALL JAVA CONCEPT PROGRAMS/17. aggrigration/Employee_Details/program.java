//Aggrigration Static...
//create a file in program.java name
public class program
{
	int id;
	String name;
	prog pro;

	public program(int id,String name,prog pro)
	{
		this.id=id;
		this.name=name;
		this.pro=pro;
	}

	void display()
	{
		System.out.println(id+" "  +name);
		System.out.println(pro.city+" "  +pro.state+" "  +pro.country);
	}

	public static void main(String args[])
	{
		prog pro1=new prog("surat","gujarat","india");
		prog pro2=new prog("mumbai","maharastra","india");

		program p=new program(1,"anant",pro1);
		program p1=new program(2,"dhruv",pro2);

		p.display();
		p1.display();
	}
}