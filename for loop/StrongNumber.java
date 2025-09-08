import java.util.*;
public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp,rem=1,sum=0;
		temp=num;
		
		for(;temp!=0;temp/=10)
		{
			rem=temp%10;
			int multi=1;
			for(int i=1;i<=rem;i++)
			{
				multi=i*multi;
			}
			sum=sum+multi;
		}
		if(sum==num)
			System.out.println("strong number");
		else
			System.out.println(" not strong number");
	}
}