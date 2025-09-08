import java.util.*;
public class SumofAllNNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number up to");
		int num=sc.nextInt();
		int i=1,sum=0 ;
		while(i<=num)
		{

		sum+=i;
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}