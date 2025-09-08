/*Q1. WAP to create class name as Armstrong with two methods 
 void setNumber(int no): this function can accept number as parameter
 boolean isArmstrong(): this function check number is armstrong or not 
 if number is armstrong return true otherwise return false.*/
 import java.util.*;
class Armstrong
{
	private int num;
	void setNumber(int no)
	{
		num=no;
	}
	boolean isArmstrong()
	{
		int temp=num,count=0,sum=0;
		for(;temp>0;temp/=10)
		{
			count++;
		}
		temp=num;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10;
			int multi=1;
			for(int i=1;i<=count;i++)
			{
				multi*=rem;
			}
			sum+=multi;
		}
		
		return sum==num;
	}
}

public class Armstrong_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		Armstrong arm=new Armstrong();
		arm.setNumber(no);
		boolean result=arm.isArmstrong();
		   System.out.println(result);
	}
	
}