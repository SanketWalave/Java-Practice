import java.util.*;
public class Armstrong_6_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num,count=0,sum=0;
		for(;temp>0;temp/=10)
			count++;
		temp=num;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10,power=1;
			for(int i=1;i<=count;i++)
				power*=rem;
			
			sum+=power;
			
		}
		
		if(sum==num)
			System.out.println("number is Armstrong");
		else
			System.out.println("number is not Armstrong");
	}
}