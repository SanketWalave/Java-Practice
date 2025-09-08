import java.util.*;
public class Strong_6_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num,sum=0;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10,mul=1;
			for(int j=1;j<=rem;j++)
			{
				mul*=j;
			}
			sum+=mul;
		}
		if(sum==num)
			System.out.println("number is strong");
		else
			System.out.println("number is not strong");
	}
}