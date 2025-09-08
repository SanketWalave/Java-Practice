import java.util.*;
public class NeonNumberApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int square=num*num;
		System.out.println(square);
		int temp=square;
		int rem=1;
		int sum=0;
		for(;temp!=0;temp/=10)
		{
			rem=temp%10;
			sum=sum+rem;
		}
		if(sum==9)
			System.out.println("number is neon");
		else
			System.out.println("number is not neon");
	}
}