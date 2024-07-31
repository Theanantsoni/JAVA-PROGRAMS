//encapsulation ...dynamic
import java.util.*;
class account
{
	private long ac_no;
	private String name;
	private Double amt;
//for long ac_no...
	public long getac_no()
	{
		return ac_no;
	}
	public void setac_no(long ac_no)
	{
		this.ac_no=ac_no;
	}
//for String name...
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}	
//for Double amt...
	public Double getamt()
	{
		return amt;
	}
	public void setamt(Double amt)
	{
		this.amt=amt;
	}
}

class program
{
	public static void main(String args[])
	{
		long ac_no;
		String name;
		Double amt;

	//for long ac_no...
		System.out.print("enter account number : ");
		Scanner sc1=new Scanner(System.in);
		ac_no=sc1.nextLong();
	//for String name...
		System.out.println("enter your name : ");
		Scanner sc2=new Scanner(System.in);
		name=sc2.nextLine();
	//for Double amt...
		System.out.println("enter your amt : ");
		Scanner sc3=new Scanner(System.in);
		amt=sc3.nextDouble();	
		
		account ac=new account();
	//for long ac_no...
		ac.getac_no();
		System.out.println("no is : "+ac_no);
	//for String name...
		ac.getname();
		System.out.println("your name is : "+name); 
	//for Double...
		ac.getamt();
		System.out.println("your amt is : "+amt);
	}
}