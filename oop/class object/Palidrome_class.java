/*Q4. WAP to create class name as Palimdrome with two functions 
  void setValue(int no): this function can accept number as parameter 
   Boolean isPalim(): this function can check if the number is palindrome or not
   if palindrome returns true otherwise return false
*/
import java.util.*;
class Palimdrome
{
	private int num;
	void setValue(int no)
	{
		num=no;
	}
	boolean isPalim()
	{
		int temp=num,rev=0;
		for(;num>0;num/=10)
		{
			int rem=num%10;
			rev=rem+(rev*10);
		}
		System.out.println(rev);
		return rev==temp;
	}
}
public class Palidrome_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		Palimdrome pali=new Palimdrome();
		pali.setValue(no);
		boolean result=pali.isPalim();
			System.out.println("\n"+result);
	}
}