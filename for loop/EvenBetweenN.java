import java.util.*;
public class EvenBetweenN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int i=2;i<=num;i+=2)
		{
			System.out.println(i);
		}
	}
}