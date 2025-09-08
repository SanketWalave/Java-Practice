import java.util.*;
public class PrimeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int i=1,count=0;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	
	}
}