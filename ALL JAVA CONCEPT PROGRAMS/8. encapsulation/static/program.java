//encapsulation static program ... 
class account
{
	private long ac_no;
	private String name;
	private double amt;
	private int id=2; //Private Variable
// for long ac_no...
	public long getac_no()
	{
		return ac_no;
	}
	public void setac_no(long ac_no)
	{
		this.ac_no=ac_no;
	}
//for string name...
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
//for double amt...
	public double getamt()
	{
		return amt;
	}
	public void setamt(double amt)
	{
		this.amt=amt;
	}
}
class program
{
	public static void main(String args[])
	{
			account ac=new account();
		//for long ac_no...	
			ac.setac_no(1l);
			System.out.println("your account number is : " +ac.getac_no());
		//for string name...
			ac.setname("anant");
			System.out.println("your name is : " +ac.getname());
		//for double amt...
			ac.setamt(50000);
			System.out.println("your amount is : " +ac.getamt());
		//for int id
			//System.out.println(ai.id); 
			/*Cannot Access In Another Class Because It is Private Member, If You Want To Access This
			Variable In Other class or Main Fuction Then MAke a Getter and Setter Method For It. After 
			Making Getter and Setter You Will Access.*/		}
}