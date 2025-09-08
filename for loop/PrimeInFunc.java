import java.util.*;
public class PrimeInFunc
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		long num=sc.nextInt();
		boolean result=isPrime(num);
		System.out.println(result);
		
	}
	public static boolean isPrime(long no)
	{
		int count=0;
		boolean result=true;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			result=true;
		}
		else
		{
			result=false;
		}
		return result;
	}
	
}