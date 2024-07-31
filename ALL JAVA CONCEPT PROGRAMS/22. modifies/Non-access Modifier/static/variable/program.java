//Non-access Modifier..Static variable..
class program 
{ 
	int eid; 
	String name; 
	static String company_name ="StudyTonight"; 

	public void show() 
	{ 
		System.out.println(eid+" "+name+" "+company_name); 
	} 
	public static void main( String[] args ) 
	{ 
		program se1 = new program(); 
		se1.eid = 104; 
		se1.name = "Abhijit";
		se1.show(); 
		
		program se2 = new program();
		se2.eid = 108; 
		se2.name = "ankit"; 
		se2.show(); 
	} 
}