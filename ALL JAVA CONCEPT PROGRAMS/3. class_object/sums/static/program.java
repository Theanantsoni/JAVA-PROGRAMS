//Class & Object..//Sum...
//Static...
 class as //class
 {
 	int a=20,b=40;
    double value=20000;

 	void add()
 	{
 		int ans=a+b;
 		System.out.println("the addition is : " +ans);
 	}

 	void sub()
	{
		int ans=a-b;
		System.out.println("the subtraction is : " +ans);
	}
 }
class md //class
 {
    int a=20,b=40;
    double value=40000;

    void mul() //function or method
    {
        int ans=a*b;
        System.out.println("the multiplication is : " +ans);
    }

    void div() //function or method
    {
        int ans=b/a;
        System.out.println("the division is : " +ans);
    }
 }
class program //object
 {
 	public static void main(String args[])
 	{
 		as a = new as(); //object creation of class
 		a.add(); //calling method (object_name.function_name());
 		a.sub(); //calling method (object_name.function_name());

        //print a float value
        System.out.println("the value of as class is : " +a.value);

        md m=new md(); //object creation of class
        m.mul(); //calling method (object_name.function_name());
        m.div(); //calling method (object_name.function_name());

        //print a float value
        System.out.println("the value  of md class is : " +m.value);
 	}
 }