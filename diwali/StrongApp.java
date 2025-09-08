import java.util.*;
public class StrongApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sc.nextInt();
		int temp=num,sum=0;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10,multi=1;
			for(int i=1;i<=rem;i++)
			{
				multi=i*multi;
			}
			sum=multi+sum;
		}
		if(num==sum)
			System.out.println("Number is strong number");
		else
			System.out.println("Number is not strong number");
	}
}