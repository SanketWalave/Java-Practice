import java.util.*;
public class NumberInReverseApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int i=num ; i>=1;i--)
		{
			System.out.println(i);
		}
	}
}