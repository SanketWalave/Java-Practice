/*Q1. WAP to create class  name Rev with two methods 
Void setNum(int no): this function can accept number as parameter 
Int getRev(): this function can reverse the number and return it 
*/
import java.util.*;
class Rev
{
	private int num;
	void setNum(int no)
	{
		num=no;
	}
	int getRev()
	{
		int rev=0;
		for(;num>0;num/=10)//1234
		//1234/10=123
		{
			int rem=num%10; //1234%10=4
			rev=rem+(rev*10);//43
			
		}
		return rev;
	}
}
public class Reverse_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		Rev r=new Rev();
		r.setNum(no);
		int result=r.getRev();
		System.out.println("reverse num\t"+result);
	}
}