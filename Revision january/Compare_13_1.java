/*2. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
import java.util.*;
class Compare
{
	private int num1;
	private int num2;
	Compare(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void operation()
	{
		if(num1==num2)
		{
			System.out.println("Numbers are equal");
		}
		else if(num1>num2)
		{
			System.out.println(num1+"  is greater");
			System.out.println(num2+"  is small");
		}
		else 
		{
			System.out.println(num2+"  is greater");
			System.out.println(num2+"  is small");
		}
	}
}
public class Compare_13_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		Compare c=new Compare(num1,num2);
		c.operation();
	}
}