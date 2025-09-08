import java.util.*;
public class AllRecentSwitch
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.celsius to faranite");
		System.out.println("2.faranite to celsius");
		System.out.println("3.addition of two");
		System.out.println("4.substraction of two");
		System.out.println("5.multiplication of two");
		System.out.println("6.division of two");
		System.out.println("7.find graid of five ");
		System.out.println("8.find upper case or lower case");
		System.out.println("9.profit loss");
		System.out.println("10.basic salary \n basic salary<=1000:HRA=20%,Da=80% \n basic salary<=2000:HRA=25%,Da=90% \n basic salary>1000:HRA=30%,Da=96%");
		System.out.println("11.leep year");
	//	System.out.println("");
	//	System.out.println("");
	//	System.out.println("");
		int choice=sc.nextInt();
		int temp,cel,fah,num1,num2,physics,chemistry,math,bio,computer,bill,finalbill,hra,da;
		char ch,ch1,ch2;
		switch (choice)
		{
			case 1:
			System.out.println("Enter temperature in celsius");
			temp=sc.nextInt();
			fah=(temp * 9 / 5) + 32;
			System.out.println("temperature in faranite is  "+ fah);
			String result=
			temp<0?"the freezing temperature":
		temp<10?"very cold wether":
        temp<20?"cold wether":
        temp<30?"normel temperature":
		temp<40?"its hot":"its very hot";
		System.out.println(result);
			break ;
			case 2:
			System.out.println("Enter temperature in faranite");
			temp=sc.nextInt();
			cel=(temp - 32) * 5 / 9;
			System.out.println("temperature in celsius is  "+ cel);
			break ;
			case 3:
			System.out.println("enter two number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int sum=num1+num2;
			System.out.println("sum is "+sum);
			break ;
			case 4:
			System.out.println("enter two number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println("sub is "+sub);
			break ;
			case 5:
			System.out.println("wnter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int multiplication=num1*num2;
			System.out.println("multiplication is  "+multiplication);
			break ;
			case 6:
			System.out.println("enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int div=num1/num2;
			System.out.println("div is "+div);
			break ;
			case 7:
			System.out.println("enter marks of five subjects");
			physics=sc.nextInt();
			chemistry=sc.nextInt();
			math=sc.nextInt();
			bio=sc.nextInt();
			computer=sc.nextInt();
			int total=physics+chemistry+math+bio+computer;
			int percentage=total*100/500;
			System.out.println("percentage is  "+percentage);
			 result=
		percentage>=90?"graid A":
		percentage>80?"graid b":
		percentage>70?"graid c":
		percentage>60?"graid d":
		percentage>40?"graid e":
		"graid f";
		System.out.println(result);
			break ;
			case 8:
			System.out.println("enter alfabate");
			ch=sc.next().charAt(0);
			if(ch>='A' && ch<='Z')
			{
				System.out.println("capital");
			}
			else
			{
				System.out.println("small");
			}
			break ;
			case 9:
			System.out.println("enter quantity and rate");
			int quantity=sc.nextInt();
			int rate =sc.nextInt();
			bill=quantity*rate;
			System.out.println("bill is" +bill);
			System.out.println("enter selling price");
			 int sell=sc.nextInt();
			 if(sell>bill)
			 {
				 System.out.println("profit");
			 }
			 else{
				 System.out.println("loss");
			 }
			break ;
			case 10:
			System.out.println("enter basic salary");
			int basicsalary=sc.nextInt();
			if(basicsalary<10000)
			{
				hra=basicsalary*20/100;
				da=basicsalary*80/100;
				int finalsalary= basicsalary+hra+da;
				System.out.println("final salary is "+finalsalary);
			}
			else if(basicsalary<=20000)
			{
				hra=basicsalary*25/100;
				da=basicsalary*85/100;
                int finalsalary= basicsalary+hra+da;
				System.out.println("final salary is "+finalsalary);			}
			else if(basicsalary>20000)
			{
				hra=basicsalary*30/100;
				da=basicsalary*90/100;
				 int finalsalary= basicsalary+hra+da;
				System.out.println("final salary is "+finalsalary);
			}
			break ;
			case 11:
			int year=sc.nextInt();
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				System.out.println("leep year");
			}
			else{
				System.out.println("not leap year");
			}
			break ;
           default :
           System.out.println(" invalid  ");
					   

		}
	}
}