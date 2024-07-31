/*
	Display the Student Details Using The Concept of Aggregration. Create a One class and give
the name Address Which can includes Country, Pincode, State, Country and Create a
Constructor of the Address class and Create a Reference Variable Create a Another Class Give
the name student which is having rollno and name,gender with Address and course also Create
a Constructor of the student class and Create a Reference Variable. Aggreate the address in
this class and display all the details.
*/

public class student
{
	int roll_no;
	String name,gender;
	details det;

	public student(int roll_no,String name,String gender,details det)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.gender=gender;
		this.det=det;
	}

	void display()
	{
		System.out.print(roll_no+" "+name+" "+gender);
		System.out.println("\t"+det.pincode+" "+det.address+" "+det.state+" "+det.country);
	}

	public static void main(String args[])
	{
		details det1=new details(395004,"surat","gujarat","india");
		details det2=new details(395003,"mumbai","maharastra","india");

		student st1=new student(1,"anant","male",det1);
		student st2=new student(2,"dhruv","male",det2);

		st1.display();
		st2.display();
	}
}