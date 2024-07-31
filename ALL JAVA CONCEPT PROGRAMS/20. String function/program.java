//String class functions in java : -

class program
{
	public static void main(String args[])
	{
		String s = "";
		String str = "hello";
		String str1 = "java";
		String str2 ="hello";
		String str3 = "0123456789";
		String str4 = "GIIT";
		String str5 = "	good morning ";
		char[] str6 = {'H', 'e', 'l', 'l', 'o'};


				//There are 2 methods to concatenate two or more string.
				//1. Using concat() method 2. Using + operator

		//	1) Using concat() method
		System.out.println("\n\nJava String concat() : -");
		
		System.out.println(str.concat(str1)); //OUTPUT : hellojava

		//	2) Using + operator
		System.out.println("\n\nUsing + operator : -");

		System.out.println(str+str1); //OUTPUT : hellojava		

				//String comparison can be done in 3 ways.
				//1. Using equals() method 
				//2. Using == operator
				//3. By CompareTo() method

		//1. Using equals() method 
		System.out.println("\n\nJava String equals() : -"); 

		System.out.println(str.equals(str1));	//OUTPUT : false	
		System.out.println(str.equals(str2));	//OUTPUT : true

		//2. Using == operator
		System.out.println("\n\nUsing == operator : -");

		System.out.println(str==str1);		//OUTPUT : false
		System.out.println(str==str2);	//OUTPUT : true

		//3. By CompareTo() method
		System.out.println("\n\nJava String CompareTo() : -");

		System.out.println(str.compareTo(str1));	//OUTPUT :	-2
		System.out.println(str.compareTo(str2));	//OUTPUT :	0
		System.out.println(str1.compareTo(str));	//OUTPUT :	2

		//	String class function : -
		System.out.println("\n\nString class function : -");

		//charAt() : -
		System.out.println("\n\nJava String charAt() : -");

		System.out.println(str1.charAt(2));	//OUTPUT : v

		//equalsIgnoreCase() : -
		System.out.println("\n\nJava String equalsIgnoreCase() : -");

		System.out.println(str2.equalsIgnoreCase("HELLO"));	//OUTPUT : true
		System.out.println(str2.equalsIgnoreCase("JAVA"));	//OUTPUT : false

		//length() : -
		System.out.println("\n\nJava String length() : -");

		System.out.println(str.length());	//OUTPUT : 5
		System.out.println(str1.length());	//OUTPUT : 4

		//replace() : -
		System.out.println("\n\nJava String replace() : -");

		System.out.println(str.replace('h','M'));	//hello --> mello
		System.out.println(str1.replace('j','M'));	//java --> mava

		//substring() : -
		System.out.println("\n\nJava String substring() : -");

		System.out.println(str3.substring(4));	//OUTPUT : 456789
		System.out.println(str3.substring(4,7)); //OUTPUT : 456

		//toLowerCase() : -
		System.out.println("\n\nJava String toLowerCase() : -");

		System.out.println(str4.toLowerCase());	//OUTPUT : giit

		//toUpperCase() : -
		System.out.println("\n\nJava String toUpperCase() : -");

		System.out.println(str.toUpperCase()); //OUTPUT : HELLO

		//trim() : -
		System.out.println("\n\nJava String trim() : -");

		System.out.println(str5.trim());	//OUTPUT : good morning

		//Java String charAt() : -
		System.out.println("\n\nJava String charAt() : -");

		char ch=str.charAt(2);	//Returns the char value at the 2nd index...
		char ch1=str5.charAt(4);	//Returns the char value at the 4rd index...
		System.out.println(ch);	//OUTPUT : l
		System.out.println(ch1);	//OUTPUT : d

		//Java String contains() : -
		System.out.println("\n\nJava String contains() : -");

		System.out.println(str5.contains("good"));	//OUTPUT : true
		System.out.println(str5.contains("every"));	//OUTPUT : false
		System.out.println(str5.contains("morning"));	//OUTPUT : true

		//Java String startsWith() : -
		System.out.println("\n\nJava String startsWith() : -");

		System.out.println(str2.startsWith("he"));	//OUTPUT : true
		System.out.println(str2.startsWith("e"));	//OUTPUT : false

		System.out.println(str4.startsWith("GI"));		//OUTPUT : true
		System.out.println(str4.startsWith("IT"));		//OUTPUT : false

		//Java String endsWith() : -
		System.out.println("\n\nJava String endsWith() : -");

		System.out.println(str2.endsWith("lo"));		//OUTPUT :	true
		System.out.println(str2.endsWith("h"));		//OUTPUT : false

		System.out.println(str4.endsWith("IT"));		//OUTPUT : true
		System.out.println(str4.endsWith("m"));		//OUTPUT : false

		//Java String indexOf() : -
		System.out.println("\n\nJava String indexOf() : -");

		int index=str2.indexOf("l");
		System.out.println("index of substring : " +index);	//OUTPUT : l //hello <-- l is 2nd index 

		//Java String length() : -
		System.out.println("\n\nJava String length() : -");

		System.out.println("string length is: "+str2.length());	//OUTPUT :	5 	//hello
		System.out.println("string length is: "+str4.length());	//OUTPUT :	4 	//GIIT

		//OTHER STRING FUNCTIONS :
		System.out.println("\n\nOTHER STRING FUNCTIONS");


		//Java String codePointAt() : -
		System.out.println("\n\nJava String codePointAt() : -");

		int result = str.codePointAt(0);
		System.out.println(result);	//OUTPUT : 104

		//Java String hashCode() : -
		System.out.println("\n\nJava String hashCode() : -");

		System.out.println(str.hashCode());	//OUTPUT : 99162322

		//Java String isEmpty() : -
		System.out.println("\n\nJava String isEmpty() : -");

		System.out.println(str1.isEmpty());		//OUTPUT : false
		// s value is empty ... 
    	System.out.println(s.isEmpty());		//OUTPUT : true	

    	//Java String copyValueOf() : -
    	System.out.println("\n\nJava String copyValueOf()");

    	s = s.copyValueOf(str6, 0, 5);
    	System.out.println("Returned String: " +s); 	//OUTPUT : Hello

	}
}

						



