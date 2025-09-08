import java.util.*;
public class EvenOddCheckApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(" given number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}