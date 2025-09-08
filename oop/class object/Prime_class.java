/*Q3. WAP to create class name as Prime with two functions 
void setValue(int no): this function can accept number as parameter 
boolean isPrime(): this function can check if the number is prime or not 
if prime return true otherwise return false.
*/
import java.util.*;
class Prime
{
	private int num;
	void setValue(int no)
	{
		num=no;
	}
	boolean isPrime()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		return count==2;
	}
}
public class Prime_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		Prime pr=new Prime();
		pr.setValue(no);
		boolean result=pr.isPrime();
			System.out.println("\n"+result);
	}
}