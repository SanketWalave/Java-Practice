/*3. Prime Number Checker
Create a Number class with a field num. Use a parameterized constructor to initialize it. 
Add a method to check if the number is prime.
Explanation: Use efficient prime-checking logic with a clear object-based implementation.
*/
import java.util.*;
class Number
{
	private int num;
	Number(int num)
	{
		this.num=num;
	}
	void isPrime()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Number is prime");
		else 
			System.out.println("Number is not prime");
	}

}
public class Prime_17_1
{
	public static void main(String x[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();

		Number n=new Number(num);
		n.isPrime();
	}
}