import java.util.*;
public class SpyApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num,sum=0,multi=1;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10;
			sum=rem+sum;
		}
		temp=num;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10;
			multi=rem*multi;
		}
		if(sum==multi)
			System.out.println("Number is spy num");
		else
			System.out.println("Number is spy not num");
		
	}
}