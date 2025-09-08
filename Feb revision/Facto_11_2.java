/*3. Factorial Calculation
Write a program to calculate the factorial of a given number using a for loop.*/
import java.util.*;
public class Facto_11_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt(),count=1;
		for(int i=1;i<=num;i++)
		{
			count*=i;
		}
		System.out.println("Factorial of number is  "+count);
	}
}