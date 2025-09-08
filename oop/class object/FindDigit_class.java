/*Q2. WAP to create class name FindDigit with two methods 
Void setValue(int value): this function can accept value parameter 
Boolean isDigitPresent(int digit): this function can search digits in value which we pass in the
 setValue() function and if digit present returns true otherwise return false*/
import java.util.*;
class FindDigit
{
	private int num,skey;
	private Scanner sc=new Scanner(System.in);
	void setValue(int no)
	{
		num=no;
		System.out.println("Enter skey");
	   skey=sc.nextInt();
	}
	boolean isDigitPresent()
	{
		boolean flag=false;
		for(;num>0;num/=10)
		{
			int rem=num%10;
			if(rem==skey)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
}
public class FindDigit_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		
		FindDigit fd=new FindDigit();
		 fd.setValue(no);
		 boolean result=fd.isDigitPresent();
			System.out.println("\n\t"+result);
	}
}