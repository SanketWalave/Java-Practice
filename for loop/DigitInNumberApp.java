import java.util.*;
public class DigitInNumberApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int digit=0,count=0;
		for(;num!=0;num/=10)
		{
			digit=num%10;
			count++;
		}
		System.out.println("count is--->"+count);
	}
}