/* Q2. WAP to create class name as DigitCount with two functions 
void setValue(int num): this function can accept number as parameter
Int getDigitCount(): this function can count the number digit from function and return it.

*/
import java.util.*;
class DigitCount
{
	private int num;
	void setValue(int no)
	{
		num=no;
	}
	int getDigitCount()
	{
		int count=0;
		for(;num>0;num/=10)
		{
			count++;
		}
		return count;
			
	}
}
public class DigitCount_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		DigitCount co=new DigitCount();
		co.setValue(no);
		int result=co.getDigitCount();
			System.out.println(result);
	}
}