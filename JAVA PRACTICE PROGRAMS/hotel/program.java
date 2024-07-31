/*

Create a One Hotel Dinner And Staying Program Using Interface

Hotel List

1.Courtyard_Marriott
2.TGB(The Grand Bhagvati)

Create a Function 

1).Dinner
	1).Veg
	2).Nonveg

2).Dinner and Staying (1,2,3 Days Input From User)(How much Days,Room,Total Member)

3).Advance Booking(Meeting, Dinner(Family,Friend,Birthday), Staying)
(How many)

Veg Menus
	1. Paneer Chilli (460)
	2. Paneer Tikka Masala	(530) 
	3. Panner Tava 	With Nan (480)
	4. Jira Rice (330)
	5. Fried Rice (300)
	6. Dal Fry (270)
	7. Dal Tadka (350)
	8. Paneer Chilli,Paneer Tikka Masala 
	9. Paneer Chilli,Panner Tava With Nan
	10.Paneer Chilli,Paneer Tikka Masala,Panner Tava With Nan 

If Select Panner Chilli Then Ask How many Plate for it

Veg Combo
	Paneer Chilli 2 Nan & Manchow Shup  (650)
	Paneer Tikka Masala & 2 Sprite	(460)
	Panner Tava 2 Nan & 2 Coke	(520)
	Panner Tava 2 Nan& Jira Rice Dal Fry (750)

Non Veg
	Butter Chicken With NAN
	Chicken 65
	Chilli Chiken
	Tandoori Mix Gril
	Chiken Afghani with Nan
	Chiken Deep Fry 2 Pcs.
	Chiken Masala

Non Veg Combo

	Butter Chicken 2 NAN & Chicken 65
	Chilli Chiken & 2 Coke
	Tandoori Mix Gril & 3 Sprite
	Chiken Afghani 2 NAN & Jira Rice

1).Dinner
	1).Veg
		1).Menu
		2).Combo

	2).Nonveg
		1). Menu
		2). Combo
----------------------------------------------------------------------------------------
2.Dinner & Staying
	1).Veg
		1).Menu
		2).Combo

	2).Nonveg
		1). Menu
		2). Combo
----------------------------------------------------------------------------------------
3).Advance Booking
	
		A. Select Meeting :- 
	enter the Date and time
		
	a. With Food
	b. Without Food
	
Choice How Many Chairs 		
How many Member Enter Details Using Array(Name,City,Post)
		(5->2300->1hour)+4500	
		(5->2900->1.5hour)+4500	
		(5->3500->2hour)+4500
		(7->3500->1hour)+7200	
		(7->3900->1.5hour)+7200	
		(7->4500->2hour)+7200
Your Meeting is Booked in Courtyard_Marriott Hotel at date at Time.
Your Member List (Print all the member details.)
You Select 5 Chairs For 1 hour Meeting With Food
You Have to Pay _______ Rs Only

	
	B. Select Dinner :- Call Function No 1.

	C. Select Staying:-	Enter The total Member Using Array
				Enter The how many Days To Stay
				1day= 7800 2days=13500 3days=21900 4days=28600 						
				5days=35800 6days=43600 7days=52600
			
				Print Total Member Details
				You Have to Pay __________ Rs Only for ____ Days
*/


import java.util.*;

interface hotel
{
	double veg_menuch[]={0,460,530,480,330,300,270,350};
	double veg_comboch[]={0,650,460,520,750};

	double nonveg_menuch[]={0,150,250,350,450,550,650,750};
	double nonveg_comboch[]={0,150,250,350,450};

	void veg_menu();
	void veg_combo();

	void nonveg_menu();
	void nonveg_combo();
}

interface hotel1
{
	double days[]={0,7800,13500,21900,28600,35500,43600,52600};

	void staying();
}

interface hotel2
{
	void meeting();
	void book();
}

class dinner implements hotel
{
	int i,size,orders;
	double tot=0,tax,dis,pay;

	public void veg_menu()
	{
		System.out.println("\n1. Paneer Chilli (460) \n2. Paneer Tikka Masala	(530) \n3. Panner Tava 	With Nan (480)  \n4. Jira Rice (330)  \n5. Fried Rice (300)  \n6. Dal Fry (270)  \n7. Dal Tadka (350) ");

		System.out.print("How many items want you order : ");
		Scanner sc12=new Scanner(System.in);
		size=sc12.nextInt();
		
		for(i=0;i<size;i++)
		{
			System.out.print("Enter your choice : ");
			Scanner sc13=new Scanner(System.in);
			orders=sc13.nextInt();
			tot+=veg_menuch[orders];
		}

		System.out.println("Sub total is : " +tot);
		tax=tot*5/100;
		System.out.println("Tax is : " +tax);
		dis=tot*10/100;
		pay=tot+tax-dis;
		System.out.println("You have to pay : " +pay+ " rs/- only");
	}

	public void veg_combo()
	{

		System.out.println("\n1.Paneer Chilli 2 Nan & Manchow Shup  (650) \n2.Paneer Tikka Masala & 2 Sprite (460) \n3.Panner Tava 2 Nan & 2 Coke	(520)  \n4.Panner Tava 2 Nan& Jira Rice Dal Fry (750)");

		System.out.print("How many items want you order : ");
		Scanner sc22=new Scanner(System.in);
		size=sc22.nextInt();
		
		for(i=0;i<size;i++)
		{
			System.out.print("Enter your choice : ");
			Scanner sc23=new Scanner(System.in);
			orders=sc23.nextInt();
			tot+=veg_comboch[orders];
		}

		System.out.println("Sub total is : " +tot);
		tax=tot*5/100;
		System.out.println("Tax is : " +tax);
		dis=tot*10/100;
		System.out.println("Discount is : " +dis);
		pay=tot+tax-dis;
		System.out.println("You have to pay : " +pay+ " rs/- only");
	}

	public void nonveg_menu()
	{
		System.out.println("1.Butter Chicken With NAN  (150) \n2.Chicken 65 (250)\n3.Chilli Chiken (350)\n4.Tandoori Mix Gril (450) \n5.Chiken Afghani with Nan (550) \n6.Chiken Deep Fry 2 Pcs. (650) \n7.Chiken Masala (750) ");
	
		System.out.print("How many items Want you order : ");
		Scanner sc13=new Scanner(System.in);
		size=sc13.nextInt();

		for(i=0;i<size;i++)
		{
			System.out.print("Enter your choice : ");
			Scanner sc23=new Scanner(System.in);
			orders=sc23.nextInt();
			tot+=nonveg_menuch[orders];
		}

		System.out.println("Sub total is : " +tot);
		tax=tot*5/100;
		System.out.println("Tax is : " +tax);
		dis=tot*10/100;
		System.out.println("Discount is : " +dis);
		pay=tot+tax-dis;
		System.out.println("You have to pay : " +pay+ " rs/- only");
	}

	public void nonveg_combo()
	{
		System.out.println("1.Butter Chicken 2 NAN & Chicken 65 (150) \n2.Chilli Chiken & 2 Coke (250) \n3.Tandoori Mix Gril & 3 Sprite (350) \n4.Chiken Afghani 2 NAN & Jira Rice (450)");
	
		System.out.print("How many items Want you order : ");
		Scanner sc13=new Scanner(System.in);
		size=sc13.nextInt();

		for(i=0;i<size;i++)
		{
			System.out.print("Enter your choice : ");
			Scanner sc33=new Scanner(System.in);
			orders=sc33.nextInt();
			tot+=nonveg_comboch[orders];
		}

		System.out.println("Sub total is : " +tot);
		tax=tot*5/100;
		System.out.println("Tax is : " +tax);
		dis=tot*10/100;
		System.out.println("Discount is : " +dis);
		pay=tot+tax-dis;
		System.out.println("You have to pay : " +pay+ " rs/- only");
	}
}

class hotel_staying implements hotel1
{
	int size,i,day;
	double tot,dis,tax,pay;

	String[] name=new String[10];
	String[] city=new String[10];
	int[] age=new int[10];

	public void staying()
	{
		System.out.println("\n---------------STAY BOOK---------------");
		System.out.print("\nEnter total member : ");
		Scanner sc34=new Scanner(System.in);
		size=sc34.nextInt();

		for(i=1;i<=size;i++)
		{
			System.out.print("\nEnter The Details Of Member : " +i);
			System.out.print("\nEnter the name of member : " );
			Scanner sc45=new Scanner(System.in);
			name[i]=sc45.nextLine();

			System.out.print("\nEnter Your city name : ");
			Scanner sc55=new Scanner(System.in);
			city[i]=sc55.nextLine();

			System.out.print("\nEnter Your Age : ");
			Scanner sc65=new Scanner(System.in);
			age[i]=sc65.nextInt();
		}

		System.out.println("\n1day= 7800 \n2days=13500 \n3days=21900 \n4days=28600 \n5days=35800  \n6days=43600 \n7days=52600");
		System.out.println("How Many Days Want You Staying : ");
		Scanner sc75=new Scanner(System.in);
		day=sc75.nextInt();

		for(i=1;i<=size;i++)
		{
			System.out.print("\nThe Details Of Member : " +i);

			System.out.print("\nName Of Member : " +name[i]);
			

			System.out.print("\nCity name : " +city[i]);
			

			System.out.print("\nYour Age : " +age[i]);
		}

		tot=days[day];
		dis=tot*10/100;
		tax=tot*5/100;
		pay=tot+tax-dis;
		System.out.print("\nSubTotal is : " +tot);
		System.out.print("\nDiscount is : " +dis);
		System.out.print("\nTax is : " +tax);
		System.out.println("\nYou Have To Pay : " +pay+ " Rs/- Only , For" +day+ " Days");
	}
}

class booking implements hotel2
{
	int i,size,ch;
	String date,time;
	double tax,tot,dis,pay;

	String[] name=new String[10];
	String[] city=new String[10];
	int[] age=new int[10];

	public void meeting()
	{
		System.out.print("\n---------Advance Booking----------");
		System.out.print("\nEnter The Date[DD/MM/YYYY] : " );
		Scanner sc90=new Scanner(System.in);
		date=sc90.nextLine();

		System.out.print("\nEnter The Time[HH/MM] : " );
		Scanner sc89=new Scanner(System.in);
		time=sc89.nextLine();
	}

	public void book()
	{
		System.out.print("\nEnter Total Member : ");
		Scanner sc57=new Scanner(System.in);
		size=sc57.nextInt();

		for(i=1;i<=size;i++)
		{
			System.out.print("\nEnter The Details Of Member : " +i);
			System.out.print("\nEnter the name of member : " );
			Scanner sc450=new Scanner(System.in);
			name[i]=sc450.nextLine();

			System.out.print("\nEnter Your city name : ");
			Scanner sc550=new Scanner(System.in);
			city[i]=sc550.nextLine();

			System.out.print("\nEnter Your Age : ");
			Scanner sc650=new Scanner(System.in);
			age[i]=sc650.nextInt();
		}

		System.out.print("\nNo | price/person | time");
		System.out.print("\n1  |      1800    |    1 ");
		System.out.print("\n2  |      3500    |    1.5 ");
		System.out.print("\n3  |      5500    |     2 ");
		System.out.print("\n4  |      7500    |     2.5 ");
		System.out.print("\n5  |      10800    |     3 ");
		System.out.print("\n6  |      15000    |     5 ");

		System.out.print("\nEnter Your Choice : " );
		Scanner sc455=new Scanner(System.in);
		ch=sc455.nextInt();

		for(i=1;i<=size;i++)
		{
			System.out.print("\nThe Details Of Member : " +i);

			System.out.print("\nName Of Member : " +name[i]);
			

			System.out.print("\nCity name : " +city[i]);
			

			System.out.print("\nYour Age : " +age[i]);
		}

		System.out.print("\nYour Meeting Is Booked On : " +date+" At "+time);
		if(ch==1)
		{
			tot=1800*size;
			System.out.print("\nYou booked meeting for 1 hour "+size+" members");
		}
		if(ch==2)
		{
			tot=3500*size;
			System.out.print("\nYou booked meeting for 1.5 hour "+size+" members");
		}
		if(ch==3)
		{
			tot=5500*size;
			System.out.print("\nYou booked meeting for 2 hour "+size+" members");
		}
		if(ch==4)
		{
			tot=7500*size;
			System.out.print("\nYou booked meeting for 2.5 hour "+size+" members");
		}
		if(ch==5)
		{
			tot=10500*size;
			System.out.print("\nYou booked meeting for 3 hour "+size+" members");
		}
		if(ch==6)
		{
			tot=15000*size;
			System.out.print("\nYou booked meeting for 5 hour "+size+" members");
		}

		dis=tot*10/100;
		tax=tot*5/100;
		pay=tot+tax-dis;
		System.out.print("\nSubTotal is : " +tot);
		System.out.print("\nDiscount is : " +dis);
		System.out.print("\nTax is : " +tax);
		System.out.println("\nYou Have To Pay : " +pay+ " Rs/- Only ");
	}
}

class program
{
	public static void main(String args[])
	{
			int ch,ch2;

			dinner dn=new dinner();
			hotel_staying hs=new hotel_staying();
			booking bk=new booking();

			System.out.println("Welcome to hotel booking application");
			System.out.println("List of hotel : \n1.Courtyard_Marriott \n2.TGB(The Grand Bhagvati)"); 

			System.out.print("Enter your choice : ");
			Scanner sc14=new Scanner(System.in);
			ch=sc14.nextInt();

			if(ch==1)
			{
				System.out.println("---------- Welcome to Courtyard_Marriott hotel ----------");

			}

			else
			{
				System.out.println("---------- Welcome to TGB(The Grand Bhagvati) hotel ----------");
			}

			System.out.println("\n1).Dinner \n2).Dinner and Staying \n3).Advance Booking");
			System.out.print("Enter your choice : ");
			Scanner sc2=new Scanner(System.in);
			ch2=sc2.nextInt();
			switch(ch2)
			{
			case 1:
				{
					System.out.println("1.veg \n2.nonveg");
					System.out.print("Enter your choice : ");
					Scanner sc16=new Scanner(System.in);
					int ch3=sc16.nextInt();

					switch(ch3)
					{
					case 1:
						{
							System.out.println("1.veg menu \n2. veg combo");
							System.out.print("Enter your choice : ");
							Scanner sc17=new Scanner(System.in);
							int ch5=sc17.nextInt();
							if(ch5==1)
							{
								dn.veg_menu();
							}

							else
							{
								dn.veg_combo();
							}
							break;
						}
					case 2 : 
						{
							System.out.println("1.non_veg menu \n2. non_veg combo");
							System.out.print("Enter your choice : ");
							Scanner sc27=new Scanner(System.in);
							int ch5=sc27.nextInt();
							if(ch5==1)
							{
								dn.nonveg_menu();
							}

							else
							{
								dn.nonveg_combo();
							}
							break;
						}
					}
					break;
				}
			case 2:
				{
					System.out.println("1.veg \n2.nonveg");
					System.out.print("Enter your choice : ");
					Scanner sc16=new Scanner(System.in);
					int ch3=sc16.nextInt();

					switch(ch3)
					{
					case 1:
						{
							System.out.println("1.veg menu \n2. veg combo");
							System.out.print("Enter your choice : ");
							Scanner sc17=new Scanner(System.in);
							int ch5=sc17.nextInt();
							if(ch5==1)
							{
								dn.veg_menu();
							}

							else
							{
								dn.veg_combo();
							}
							break;
						}
					case 2 : 
						{
							System.out.println("1.non_veg menu \n2. non_veg combo");
							System.out.print("Enter your choice : ");
							Scanner sc27=new Scanner(System.in);
							int ch5=sc27.nextInt();
							if(ch5==1)
							{
								dn.nonveg_menu();
							}

							else
							{
								dn.nonveg_combo();
							}
							break;
						}
					}
					hs.staying();
					break;
				}

			case 3:
				{
					bk.meeting();
					System.out.print("\n1. With Food \n2. Without Food");
					int food;

					System.out.print("\nEnter your choice : " );
					Scanner sc459=new Scanner(System.in);
					food=sc459.nextInt();

					if(food==1)
					{
						System.out.println("1.veg \n2.nonveg");
					System.out.print("Enter your choice : ");
					Scanner sc160=new Scanner(System.in);
					int ch3=sc160.nextInt();

					switch(ch3)
					{
					case 1:
						{
							System.out.println("1.veg menu \n2. veg combo");
							System.out.print("Enter your choice : ");
							Scanner sc170=new Scanner(System.in);
							int ch5=sc170.nextInt();
							if(ch5==1)
							{
								dn.veg_menu();
							}

							else
							{
								dn.veg_combo();
							}
							break;
						}
					case 2 : 
						{
							System.out.println("1.non_veg menu \n2. non_veg combo");
							System.out.print("Enter your choice : ");
							Scanner sc270=new Scanner(System.in);
							int ch5=sc270.nextInt();
							if(ch5==1)
							{
								dn.nonveg_menu();
							}

							else
							{
								dn.nonveg_combo();
							}
							break;
						}
					}

					bk.book();
					break;
				}
			}

		}
	}

}