import java.util.*;
public class SpyNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp,rem,sum,multi;
		temp=num;rem=1;sum=0;
		for(;temp!=0;temp/=10)
		{
			rem=temp%10;
			sum=sum+rem;
		}
		temp=num;
		multi=1;
		for(;temp!=0;temp/=10)
		{
			rem=temp%10;
			multi=multi*rem;
		}
		if(multi==sum)
			System.out.println("number is spy");
		else
			System.out.println("number is not spy");
	}
}