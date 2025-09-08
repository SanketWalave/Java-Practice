import java.util.*;
public class SumOfAllOddUpto
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i+=2)
		{
			sum=sum+i;
		}
		System.out.println("sum is--->"+sum);
	}
}