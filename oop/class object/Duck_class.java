/*Q3.WAP to create class name DuckNum with two methods 
Void setValue(int no): this function can accept number parameter 
boolean isDuck(): this function can check number is duck or not
 if number is duck return true otherwise return false
*/
import java.util.*;
class DuckNum
{
	private int num;
	void setValue(int no)
	{
		num=no;
	}
	boolean isDuck()
	{
		boolean flag=false;
		for(;num>0;num/=10)
		{
			int rem=num%10;
			if(rem==0)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
}
public class Duck_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		DuckNum dkn=new DuckNum();
		dkn.setValue(no);
		boolean result=dkn.isDuck();
			System.out.println("\n\t"+result);
	}
}
