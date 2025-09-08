import java.util.*;
public class PrimeNum2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("Number is prime number");
		}
		else
		{
					System.out.println("Number is not prime number");
	
		}
	}
}