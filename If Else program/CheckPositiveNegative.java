import java.util.*;
public class CheckPositiveNegative
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("enter number");
		number=sc.nextInt();
		if(number==0)
		{
			System.out.println("number is 0");
		}
		else if(number%2==0)
		{
			System.out.println("number is even");
		}
		else if(number%2!=0)
		{
			System.out.println("number is odd");
		}
		
	}
}