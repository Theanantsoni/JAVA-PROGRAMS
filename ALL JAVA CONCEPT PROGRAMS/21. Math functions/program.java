//Math function in java : -
class program
{
	public static void main(String args[])
	{
		int x=10,y=-20,z=81;
		int a=5,b=4;
		double p=80.52,q=80.48;

	//Java Math.abs() method : -
		System.out.println("\n\nJava Math.abs() method : -");
		System.out.println(Math.abs(x)); //OUTPUT : 10
		System.out.println(Math.abs(y)); //OUTPUT : 20

	//Java Math.max() method : -
		System.out.println("\n\nJava Math.max() method : -");
		System.out.println(Math.max(x,y)); //OUTPUT : 10

	//Java Math.min() method : -
		System.out.println("\n\nJava Math.min() method : -");
		System.out.println(Math.min(x, y));	//OUTPUT : -20

	//Java Math.round() method : -
		System.out.println("\n\nJava Math.round() method : -");
		System.out.println(Math.round(p)); //OUTPUT : 81
		System.out.println(Math.round(q)); //OUTPUT : 80

	//Java Math.sqrt() method : -
		System.out.println("\n\nJava Math.sqrt() method : -");
		System.out.println(Math.sqrt(z)); //OUTPUT : 9

	//Java Math.pow() method : -
		System.out.println("\n\nJava Math.pow() method : -");
		System.out.println(Math.pow(a,b)); //OUTPUT : 625 //5*5*5*5 = 625

	//Java Math.addExact() method : -
		System.out.println("\n\nJava Math.addExact() method : -");
		System.out.println(Math.addExact(x,z));	//OUTPUT : 91 //x+z = 10+81 = 91

	//Java Math.subtractExact() method : -
		System.out.println("\n\nJava Math.subtractExact() method : -");
		System.out.println(Math.subtractExact(z,x)); //OUTPUT : 71 //z-x = 81-10 = 71

	//Java Math.multiplyExact() method : -
		System.out.println("\n\nJava Math.multiplyExact() method : -");
		System.out.println(Math.multiplyExact(a,b)); //OUTPUT : 20 //a*b = 5*4 = 20 

	//Java Math.log() method : -
		System.out.println("\n\nJava Math.log() method : -");
		System.out.println(Math.log(z)); //OUTPUT  : 4.394449154672439

	//Java Math.log10() method : -
		System.out.println("\n\nJava Math.log10() method : -");
		System.out.println(Math.log10(z)); //OUTPUT : 	1.9084850188786497

	//Java Math.sin() method : -
		System.out.println("\n\nJava Math.sin() method : -");
		System.out.println(Math.sin(z)); //OUTPUT : -0.6298879942744539

	//Java Math.cos() method : -
		System.out.println("\n\nJava Math.cos() method : -");
		System.out.println(Math.cos(z)); //OUTPUT : 0.7766859820216312

	//Java Math.tan() method : -
		System.out.println("\n\nJava Math.tan() method : -");
		System.out.println(Math.tan(z));  //OUTPUT : -0.8109944158318942

	//Java Math.asin() method : -
		System.out.println("\n\nJava Math.asin() method : -");
		System.out.println(Math.asin(q)); //OUTPUT :  ----------------------

	//Java Math.acos() method : -
		System.out.println("\n\nJava Math.acos() method : -");
		System.out.println(Math.acos(q)); //OUTPUT :  ----------------------

	//Java Math.atan() method : -
		System.out.println("\n\nJava Math.atan() method : -");
		System.out.println(Math.atan(q)); //OUTPUT :  1.558371518881711

	}
}