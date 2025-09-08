import java.util.*;
public class Drhathi
{
	public static  void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age of patient");
		int age=sc.nextInt();
	/*	String result=
		age<=5?"no fees":
		age<=10?"rs 50":
		age<=18?"rs 100":
		age<=40?"rs 200":
		age<60?"rs 150":"no fees";
		System.out.println(result);
	*/	
	if(age<5)
	{
		System.out.println("no fees");
	}
	else if( age<10)
	{
		System.out.println("rs 50 charge");
	}		
	else if(age<18)
	{
		System.out.println("rs 100");
	}
	else if(age<40)
	{
		System.out.println("rs 200");
	}
	else if(age<60)
	{
		System.out.println("rs 150");
	}
	else
	{
		System.out.println("no fees");
	}
		
	}
}