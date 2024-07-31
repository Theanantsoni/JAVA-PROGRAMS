/*
	Display the Student Details Using The Concept of Aggregration. Create a One class and give
the name Address Which can includes Country, Pincode, State, Country and Create a
Constructor of the Address class and Create a Reference Variable Create a Another Class Give
the name student which is having rollno and name,gender with Address and course also Create
a Constructor of the student class and Create a Reference Variable. Aggreate the address in
this class and display all the details.
*/

public class details
{
	int pincode;
	String address,state,country;

	public details(int pincode,String address,String state,String country)
	{
		this.pincode=pincode;
		this.address=address;
		this.state=state;
		this.country=country;
	}
}