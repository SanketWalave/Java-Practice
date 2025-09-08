import java.util.*;
public class ProductOfDigitApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		int rem=0,multi=1;
		for(;num!=0;num/=10)
		{
			rem=num%10;
		//	System.out.println(rem);
			multi=multi*rem;
		}
		System.out.println("Sum is--->"+multi);
	}
}