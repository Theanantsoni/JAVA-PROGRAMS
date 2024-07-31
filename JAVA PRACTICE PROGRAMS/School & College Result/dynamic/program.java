import java.util.*;

class student
{
	String gen,name;
	double enroll_no,choice,scr,maths,ss,sci,eng,tot,per,acc,stat,bank,eco,c,cpp,java,php,bussiness,marketing,financial,management;

	void displaysch(String name,Double enroll_no,String gen)
	{
		System.out.println("the student name is : " +name);
		System.out.println("the student enrollment number is : " +enroll_no);
		System.out.println("the student gender is : " +gen);

		//subjects
		System.out.println(" the maths subject marks is : " +maths);
		System.out.println(" the  social science subject marks : " +ss);
		System.out.println(" the  science marks is : " +sci);
		System.out.println(" the  english marks is : " +eng);

		//result
		System.out.println(" total is : " +tot);
		System.out.println(" percentage is : " +per);
	}

	void displaybcom(String name,double enroll_no,String gen)
	{
		System.out.println("the student name is : " +name);
		System.out.println("the student enrollment number is : " +enroll_no);
		System.out.println("the student gender is : " +gen);

		//for bcom ...
		System.out.println(" the account subject marks is : " +acc);
		System.out.println(" the statistics  subject marks : " +stat);
		System.out.println(" the banking  subject marks is : " +bank);
		System.out.println(" the economics subject marks is : " +eco);

		//result
		System.out.println(" total is : " +tot);
		System.out.println(" percentage is : " +per); 
	}

	void displaybca(String name,double enroll_no,String gen)
	{
		System.out.println("the student name is : " +name);
		System.out.println("the student enrollment number is : " +enroll_no);
		System.out.println("the student gender is : " +gen);

		//for bca ...
		System.out.println(" the c language subject marks is : " +c);
		System.out.println(" the cpp language subject marks : " +cpp);
		System.out.println(" the java language subject marks is : " +java);
		System.out.println(" the php language subject marks is : " +php);

		//result
		System.out.println(" total is : " +tot);
		System.out.println(" percentage is : " +per); 
	}

	void displaybba(String name,double enroll_no,String gen)
	{
		System.out.println("the student name is : " +name);
		System.out.println("the student enrollment number is : " +enroll_no);
		System.out.println("the student gender is : " +gen);

		//for bba ...
		System.out.println(" the bussiness subject marks is : " +bussiness);
		System.out.println(" the marketing subject marks : " +marketing);
		System.out.println(" the financial subject marks is : " +financial);
		System.out.println(" the management subject marks is : " +management);

		//result
		System.out.println(" total is : " +tot);
		System.out.println(" percentage is : " +per); 
	}
}

class school extends student
{
		void result()
		{
				System.out.println("enter the maths subject marks : " );
				Scanner sc4=new Scanner(System.in);
				maths=sc4.nextDouble();

				System.out.println("enter the social science subject marks : " );
				Scanner sc5=new Scanner(System.in);
				ss=sc5.nextDouble();

				System.out.println("enter the science subject marks : " );
				Scanner sc6=new Scanner(System.in);
				sci=sc6.nextDouble();
				
				System.out.println("enter the english subject marks : " );
				Scanner sc7=new Scanner(System.in);
				eng=sc7.nextDouble();

				tot=maths+ss+sci+eng;
				System.out.println("total is : " +tot);

				per=tot/4;
				System.out.println("percentage is : " +per);
		}
	}
	
class college extends student
{
	void bcom()
	{
		System.out.println("enter account subject marks : " );
		Scanner ac=new Scanner(System.in);
		acc=ac.nextDouble();	

		System.out.println("enter statistics subject marks : " );
		Scanner st=new Scanner(System.in);
		stat=st.nextDouble();	

		System.out.println("enter account subject marks : " );
		Scanner bk=new Scanner(System.in);
		bank=bk.nextDouble();	

		System.out.println("enter account subject marks : " );
		Scanner ec=new Scanner(System.in);
		eco=ec.nextDouble();	

		tot=acc+stat+bank+eco;
		System.out.println("total is : " +tot);

		per=tot/4;
		System.out.println("percentage is : " +per);

	}
	
	void bca()
	{
		System.out.println("enter c language subject marks : " );
		Scanner ac=new Scanner(System.in);
		c=ac.nextDouble();	

		System.out.println("enter cpp language subject marks : " );
		Scanner st=new Scanner(System.in);
		cpp=st.nextDouble();	

		System.out.println("enter java language subject marks : " );
		Scanner bk=new Scanner(System.in);
		java=bk.nextDouble();	

		System.out.println("enter php language subject marks : " );
		Scanner ec=new Scanner(System.in);
		php=ec.nextDouble();

		tot=c+cpp+java+php;
		System.out.println("total is : " +tot);

		per=tot/4;
		System.out.println("percentage is : " +per);
	}
	
	void bba()
	{
		System.out.println("enter bussiness subject marks : " );
		Scanner ac=new Scanner(System.in);
		bussiness=ac.nextDouble();	

		System.out.println("enter marketing subject marks : " );
		Scanner st=new Scanner(System.in);
		marketing=st.nextDouble();	

		System.out.println("enter financial subject marks : " );
		Scanner bk=new Scanner(System.in);
		financial=bk.nextDouble();	

		System.out.println("enter management subject marks : " );
		Scanner ec=new Scanner(System.in);
		management=ec.nextDouble();

		tot=bussiness+marketing+financial+management;
		System.out.println("total is : " +tot);

		per=tot/4;
		System.out.println("percentage is : " +per);
	}
}

class program
{
	public static void main(String args[])
	{
		String gen,name;
		double enroll_no,choice,scr;

		//enter the basic details...

		System.out.println("enter student name : " );
		Scanner sc1=new Scanner(System.in);
		name=sc1.nextLine();

		System.out.println("enter student enrollment number : " );
		Scanner sc2=new Scanner(System.in);
		enroll_no=sc2.nextDouble();

		System.out.println("enter student gender : " );
		Scanner sc3=new Scanner(System.in);
		gen=sc3.nextLine();

		//create an object of college class
		college cl=new college();
		
		//create an object of school class
		school sc=new school();

		System.out.println("please enter the school or college");
		System.out.println("1. school \n 2. college");
		Scanner ch=new Scanner(System.in);
		choice=ch.nextDouble();

		if(choice==1)
			{
				sc.result();
				
				sc.displaysch(name,enroll_no,gen);
			}
			else
			{
				System.out.println("select your course : ");
				System.out.println("1. bcom \n2.bca \n3.bba");
				Scanner cr=new Scanner(System.in);
				scr=cr.nextDouble();

				if(scr==1)
				{
					cl.bcom();
						cl.displaybcom(name,enroll_no,gen);
				}
			    else if(scr==2)
				{
					cl.bca();
						cl.displaybca(name,enroll_no,gen);
				}
				else
				{	
					cl.bba();
						cl.displaybba(name,enroll_no,gen);
				}
			}
	}

}