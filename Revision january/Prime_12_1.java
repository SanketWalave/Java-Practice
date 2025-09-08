import java.util.*;
public class Prime_12_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		boolean res=isPrime(num);
		System.out.println("\t\t"+res);
	}
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		return count==2;
	}
}