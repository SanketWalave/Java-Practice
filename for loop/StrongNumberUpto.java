import java.util.*;
public class StrongNumberUpto
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=sc.nextInt();
		int temp,rem=1,sum;
		
		for (int j=1;j<=limit;j++)
		{
			temp=j;
			sum=0;
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
		if(sum==j)
			System.out.println( j+" is strong number");
		}
	}
}