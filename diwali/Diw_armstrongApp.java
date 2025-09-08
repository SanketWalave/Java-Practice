import java.util.*;
public class Diw_armstrongApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num,count=0;
		for(;temp>0;temp/=10)
		{
			count++;
		}
		temp=num;
		int sum=0;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10,power=1;
			for(int i=1;i<=count;i++)
			{
				power=rem*power;
			}
			sum=power+sum;
		}
		if(sum==num)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}
}