//currency convert application ...

import java.util.*;
class first	//first class
{
	int ch1;
	double usd,cand,pnd,ynd,dbd,inr,usdcon,candcon,pndcon,yndcon,dbdcon; 
	
	void data()		//first class data ...
	{
		System.out.print("\nEnter the today's rate of US dollar : ");
		Scanner sc2=new Scanner(System.in);
		usd=sc2.nextDouble();
		
		System.out.print("\nEnetr the today's rate of canadian dollar : ");
		Scanner sc3=new Scanner(System.in);
		cand=sc3.nextDouble();
		
		System.out.print("\nEnter the today's rate of pound : ");
		Scanner sc4=new Scanner(System.in);
		pnd=sc4.nextDouble();
		
		System.out.print("\nEnter the today's rate of yen : ");
		Scanner sc5=new Scanner(System.in);
		ynd=sc5.nextDouble();
		
		System.out.print("\nEnter the today's rate of dirham (dubai) : ");
		Scanner sc6=new Scanner(System.in);
		dbd=sc6.nextDouble();
	}

	void display()		//first class display ...
	{
		System.out.println("\n\nYou select option 1. convert RS to all five currency : ");
		System.out.print("\ntoday's rate of Us dollar is : " +usd);
		System.out.print("\ntoday's rate of canadian dollar is : " +cand);
		System.out.print("\ntoday's rate of pound dollar is : " +pnd);
		System.out.print("\ntoday's rate of yen dollar is : " +ynd);
		System.out.print("\ntoday's rate of dirham (dubai) dollar is : " +dbd);
	}
	
	void convert()		//first class currency convert ...
	{
		System.out.print("\n\nenter the Rs that you want to convert into All five currency : ");
		Scanner sc17=new Scanner(System.in);
		
		inr=sc17.nextDouble();
		usdcon=inr/usd;
		candcon=inr/cand;
		pndcon=inr/pnd;
		yndcon=inr/ynd;
		dbdcon=inr/dbd;
		
		System.out.print("\n\nYou enter Rs. "+inr+" RS. -That you want to convert into all five currencies...");
		System.out.print("\nRs to US dollar amount is : " +usdcon);
		System.out.print("\nRs to canadian dollar amount is : " +candcon);
		System.out.print("\nRs to pound amount is : " +pndcon);
		System.out.print("\nRs to yen amount is : " +yndcon);
		System.out.print("\nRs to dirham (dubai) amoutn is : " +dbdcon);

		System.out.println("\n\nThank you for using Thid application ......have a Good Day :)");
	}
}

class second extends first	//second class 
{
	void data()		//second class data ...
	{
		System.out.println("\nYou selected option 2. convert RS to individual currency.");
		System.out.print("\n1. convert Rs to Us dollar");
		System.out.print("\n2. convert Rs to canadian dollar");
		System.out.print("\n3. convert Rs to pound");
		System.out.print("\n4. convert Rs to yen");
		System.out.print("\n5. convert Rs to dirham (dubai)");

		System.out.print("\n\nenter your choice : ");
		Scanner sc8=new Scanner(System.in);
		ch1=sc8.nextInt();

		switch(ch1)
		{
		case 1:		//first choice ...
			{
				System.out.println("\nyou selected 1. convert Rs to Us dollar");

				System.out.print("\nenter the Rs that you want to convert into Rs to Us dollar : ");
				Scanner sc9=new Scanner(System.in);
				inr=sc9.nextDouble();

				System.out.print("\nEnter the today's rate of US dollar : ");
				Scanner sc10=new Scanner(System.in);
				usd=sc10.nextDouble();	

				usdcon=inr/usd;
				System.out.print("\nRs to US dollar amount is : " +usdcon);

				break;
			}

		case 2:		//second choice ...
			{
				System.out.println("\nyou selected 2. convert Rs to canadian dollar");

				System.out.print("\nenter the Rs that you want to convert into Rs to canadian dollar : ");
				Scanner sc11=new Scanner(System.in);
				inr=sc11.nextDouble();

				System.out.print("\nEnter the today's rate of canadian dollar : ");
				Scanner sc12=new Scanner(System.in);
				cand=sc12.nextDouble();	

				candcon=inr/cand;
				System.out.print("\nRs to canadian dollar amount is : " +candcon);

				break;
			}

		case 3:		//third choice ...
			{
				System.out.println("\nyou selected 3. convert Rs to pound");

				System.out.print("\nenter the Rs that you want to convert into Rs to pound : ");
				Scanner sc13=new Scanner(System.in);
				inr=sc13.nextDouble();

				System.out.print("\nEnter the today's rate of pound : ");
				Scanner sc14=new Scanner(System.in);
				pnd=sc14.nextDouble();	

				pndcon=inr/pnd;
				System.out.print("\nRs to pound amount is : " +pndcon);

				break;
			}

		case 4:		//fourth choice ...
			{
				System.out.println("\nyou selected 4. convert Rs to yen");

				System.out.print("\nenter the Rs that you want to convert into yen : ");
				Scanner sc15=new Scanner(System.in);
				inr=sc15.nextDouble();

				System.out.print("\nEnter the today's rate of yen : ");
				Scanner sc16=new Scanner(System.in);
				ynd=sc16.nextDouble();	

				yndcon=inr/ynd;
				System.out.print("\nRs to yen amount is : " +yndcon);

				break;
			}

		case 5:		//fifth choice ...
			{
				System.out.print("\nyou selected 5. convert Rs to dirham (dubai)");

				System.out.print("\nenter the Rs that you want to convert into dirham (dubai) : ");
				Scanner sc18=new Scanner(System.in);
				inr=sc18.nextDouble();

				System.out.print("\nEnter the today's rate of dirham (dubai) : ");
				Scanner sc19=new Scanner(System.in);
				dbd=sc19.nextDouble();	

				dbdcon=inr/dbd;
				System.out.print("\nRs to dirham (dubai) amoutn is : " +dbdcon);

				break;
			}
		}
	}
}

class third extends first	//third class ...
{
	int ch2,i,j;

	double[] usdd=new double[50];	//create an array...	
	double[] inrr=new double[50];	//create an array...
	double[] cndd=new double[50];	//create an array...
	double[] pndd=new double[50];	//create an array...
	double[] yndd=new double[50];	//create an array...
	double[] dbdd=new double[50];	//create an array... 

	//third class data ...
	void data()
	{
		System.out.print("\nEnter no. of indian Rs. Amount list : ");
		Scanner sc20=new Scanner(System.in);
		ch2=sc20.nextInt();

		for(i=0;i<ch2;i++)
		{
			System.out.print("\nenter Rs : ");
			Scanner sc21=new Scanner(System.in);
			inrr[i]=sc21.nextDouble();
		}

		System.out.print("\nEnter the today's rate of US dollar : ");
		Scanner sc2=new Scanner(System.in);
		usd=sc2.nextDouble();

		System.out.print("\nEnetr the today's rate of canadian dollar : ");
		Scanner sc3=new Scanner(System.in);
		cand=sc3.nextDouble();

		System.out.print("\nEnter the today's rate of pound : ");
		Scanner sc4=new Scanner(System.in);
		pnd=sc4.nextDouble();

		System.out.print("\nEnter the today's rate of yen : ");
		Scanner sc5=new Scanner(System.in);
		ynd=sc5.nextDouble();

		System.out.print("\nEnter the today's rate of dirham (dubai) : ");
		Scanner sc6=new Scanner(System.in);
		dbd=sc6.nextDouble();

		System.out.println("\n1. Rs to Us Dollar : ");
		for(i=0;i<ch2;i++)
		{
			System.out.println("\nindian Rs Amount is : " +inrr[i]);
			usdd[i]=inrr[i]/usd;
			System.out.println("converted Rs to Us Dollar Amount is "+inrr[i]+ " Rs = "+usdd[i]+ " Us Dollar");
		}

		System.out.println("\n2. Rs to Canadian Dollar : ");
		for(i=0;i<ch2;i++)
		{
			System.out.println("\nindian Rs Amount is : " +inrr[i]);
			cndd[i]=inrr[i]/cand;
			System.out.println("converted Rs to Canadian Dollar Amount is "+inrr[i]+ " Rs = "+cndd[i]+ " Canadian Dollar");
		}

		System.out.println("\n3. Rs to Pound : ");
		for(i=0;i<ch2;i++)
		{
			System.out.println("\nindian Rs Amount is : " +inrr[i]);
			pndd[i]=inrr[i]/pnd;
			System.out.println("converted Rs to Pound Amount is "+inrr[i]+ " Rs = "+pndd[i]+ " Pound");
		}

		System.out.println("\n4. Rs to Yen : ");
		for(i=0;i<ch2;i++)
		{
			System.out.println("\nindian Rs Amount is : " +inrr[i]);
			yndd[i]=inrr[i]/ynd;
			System.out.println("converted Rs to Yen Amount is "+inrr[i]+ " Rs = "+yndd[i]+ " Yen");
		}

		System.out.println("\n5. Rs to Dirham : ");
		for(i=0;i<ch2;i++)
		{
			System.out.println("\nindian Rs Amount is : " +inrr[i]);
			dbdd[i]=inrr[i]/dbd;
			System.out.println("converted Rs to Dirham Amount is  "+inrr[i]+ " Rs = "+dbdd[i]+" Dirham");
		}
	}	
}

class program
{
	public static void main(String args[])
	{	
		int ch;
		
		System.out.println("\n-: WELCOME TO INDIAN CURRENCY CONVERTER APP :-");
		System.out.print("\n------------------------------------------------");	

		System.out.println("\n\nThis app will convert RS into US dollar,canadian dollar,pound,yen,dirham :)");

		System.out.print("\n1. convert RS to all five currency.");
		System.out.print("\n2. convert RS to individual currency.");
		System.out.print("\n3. multiple indian RS amount convert into All five currency.");

		first fs=new first();		//first class created object ...
		second scnd=new second();	//second class created object ...
		third thd=new third();		//third class created object ...

		System.out.print("\n\nplease enter your choice : ");
		Scanner sc1=new Scanner(System.in);
		ch=sc1.nextInt();

		if(ch==1)		//first class calling
		{
			fs.data();
			fs.display();	
			fs.convert();
		}	
		else if(ch==2)		//second class calling
		{	
			scnd.data();
		}
		else if(ch==3)		//third class calling 
		{
			thd.data();
		}
		else
		{
			System.out.print("\ninvalid number...");
		}
	}
}
