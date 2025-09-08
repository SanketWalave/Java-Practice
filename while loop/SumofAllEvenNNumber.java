import java.util.*;
public class SumofAllEvenNNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number up to");
		int num=sc.nextInt();
		int i=2,sum=0 ;
		while(i<=num)
		{

		sum+=i;
			i+=2;
		}
		System.out.println(sum);
	}
}