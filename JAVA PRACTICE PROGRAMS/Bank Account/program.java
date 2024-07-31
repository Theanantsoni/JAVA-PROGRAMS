/*
	Use Abstract Class
Q2.Write a program to Crete a one Abstract class give the name bank in this class create a abstract method which are defaultbal, deposite, withdraw, remainbal, Choice using The Abstract Class Concept and inheritance for the SBI,BOB,PNB.

Use Switch Case for Different Bank
1. SBI
2. BOB
3. PNB

Use Switch Case for Different Bank
1. Know the Default Balance
2. Deposited 
3. Withdraw
4. Know Total Balance 
5. Exit

Use Validation Cannot Directly Withdraw from Ac without Deposit (Means When User Withdraw money from their account call the Deposit Function at once. After Deposit they can withdraw. [Also check amount is not grater then Total balance)

*/

import java.util.*;

abstract class details
{
	double dep,wdr,tot_bal;

	abstract void default_balance();
	abstract void deposit();
	abstract void withdraw();
	abstract void ramain_balance();
}

class bank extends details
{
	double def_bal=1000;

	void default_balance()
	{
		System.out.println("\nDefault Balance Is : " +def_bal);
	}

	void deposit()
	{
		System.out.print("Enter Your Deposit Amount : ");
		Scanner sc1=new Scanner(System.in);
		dep=sc1.nextDouble();

		tot_bal+=dep+def_bal;
		System.out.println("Your Deposit Is Successfully Credited :" +dep);
	}

	void withdraw()
	{
		System.out.print("How much amount want you withdraw : ");
		Scanner sc2=new Scanner(System.in);
		wdr=sc2.nextDouble();

		if(wdr<=tot_bal)
		{
			tot_bal-=wdr+def_bal;
			System.out.println("Your account Was debited : " +wdr);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

	void ramain_balance()
	{
		System.out.println("Your Total Balance Is : " +tot_bal);
	}


}

class program
{
	public static void main(String args[])
	{
		int ch,ser;

		bank bk=new bank();

		System.out.print("\n1. SBI \n2. BOB \n3. PNB");
		System.out.print("\nEnter Your Choice : ");
		Scanner sc4=new Scanner(System.in);
		ch=sc4.nextInt();

		if(ch==1)
		{
			System.out.println("------------WELCOME TO SBI------------");
		}

		if(ch==2)
		{
			System.out.println("------------WELCOME TO BOB------------");
		}

		if(ch==3)
		{
			System.out.println("------------WELCOME TO PNB------------");
		}

		do
		{
			System.out.println("\n1. Know the Default Balance \n2. Deposited \n3. Withdraw  \n4. Know Total Balance  \n5. Exit");
			System.out.print("Enter Your Choice : ");
			Scanner sc5=new Scanner(System.in);
			ser=sc5.nextInt();
			if(ser==1)
			{
				bk.default_balance();
			}
			if(ser==2)
			{
				bk.deposit();
			}
			if(ser==3)
			{
				bk.deposit();
				bk.withdraw();
			}
			if(ser==4)
			{
				bk.ramain_balance();
			}
			ser++;
		}
		while(ser<=5);
	}
}