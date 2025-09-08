/*4. Reverse a Number
Write a program to reverse a given number (e.g., input 12345 should return 54321) using a while loop.
*/
import java.util.*;
public class Rev_12_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt(),rem=1,rev=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		System.out.println("\t\t"+rev);
	}
}