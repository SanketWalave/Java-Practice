import java.util.*;
public class SumOfEvenFun
{
	static int i=1,sum=0;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=sc.nextInt();
		int res=sumofeven(limit);
		System.out.println(sum);
	}
	public static int sumofeven(int li)
	{
		if(i<=li)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
			sumofeven(li);
		}
		return sum;
	}
}