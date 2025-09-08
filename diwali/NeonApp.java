import java.util.*;
public class NeonApp
{
	public static void main(S tring x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int square=num*num,sum=0;
		for(;square>0;square/=10)
		{
			int rem=square%10;
			sum+=rem;
		}
		if(sum==9)
			System.out.println("number  is neon");
		else
			System.out.println("number  is not neon");
	}
}