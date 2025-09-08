/*6. Prime Numbers in a Range
Write a program that prints all prime numbers between 1 and n, where n is entered by the user. Use a for loop.
*/
import java.util.*;
public class PrimeInRange_11_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter limt");
		int limit=sc.nextInt(),temp;
		for(int i=1;i<=limit;i++)
		{
			temp=i;int count=0;
			for(int j=1;j<=temp;j++)
			{
				if(temp%j==0)
					count++;
			}
			if(count==2)
				System.out.println(temp);
		}
	}
}