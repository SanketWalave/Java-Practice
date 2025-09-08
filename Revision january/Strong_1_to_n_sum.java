import java.util.*;
public class Strong_1_to_n_sum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt(),sum=0;
		for(int i=1;i<=limit;i++)
		{
			int temp=i,sum2=0;
			for(;temp>0;temp/=10)
			{
				int rem=temp%10,power=1;
				for(int j=1;j<=rem;j++)
				{
					power*=j;
				}
				sum2+=power;
			}
			if(i==sum2)
			{
				sum+=i;
			}
		}
		System.out.println("sum of all strong number upto  "+limit+" is "+sum);
	}
}