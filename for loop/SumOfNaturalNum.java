import java.util.*;
public class SumOfNaturalNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
		    sum=sum+i;
		}
		System.out.println("sum is --->"+sum);
	}
}