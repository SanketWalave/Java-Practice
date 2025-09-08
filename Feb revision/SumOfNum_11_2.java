/*2. Sum of First N Natural Numbers
Write a program to calculate the sum of the first n natural numbers, where n is entered by the user. Use a while loop.
*/
import java.util.*;
public class SumOfNum_11_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt(),sum=0;
		for(int i=1;i<=limit;i++)
		{
			sum+=i;
		}
		System.out.println("Sum = "+sum);
	}
}