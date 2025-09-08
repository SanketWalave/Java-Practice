/*Q1. Prime Number Checker for 1 to N 
Specification: Create a class PrimeChecker that takes an integer N via the constructor and 
checks if each number from 1 to N is a prime number using a loop. 
Input: An integer N. 
Output: Whether each number from 1 to N is a prime number or not.*/
import java.util.*;
class Prime 
{
	private int n;
	private int count2=0;
	Prime(int n)
	{
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+"\t is prime");
			count2++;
			System.out.println(count2);
		}
		if(count==2)
		{
			
		}
		
	}
	
}
public class PrimeCheck_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			Prime p=new Prime(i);
			
			
		}
		
		
	}
}