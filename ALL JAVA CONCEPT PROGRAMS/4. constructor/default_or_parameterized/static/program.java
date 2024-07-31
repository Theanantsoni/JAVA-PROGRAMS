//default or parameterized...
//static...
 class prog
 {
 	prog()
 	{
 		System.out.println("constructor");
 	}
 	prog(int no1,int no2)
 	{
 		int sub=no2-no1;
 		System.out.println("the subtrsction is : "+sub);
 	}
    void fnctn()
    {
        System.out.println("function calling");
    }
 
 }

 class program
 {
 	public static void main(String args[])
 	{

 	int no1=10,no2=20;

	prog pr=new prog();
	prog pr1=new prog(no1,no2);

    pr.fnctn();
	}

 }