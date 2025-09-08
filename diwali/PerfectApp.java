import java.util.*;
public class PerfectApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		int i=1,sum=0;
		while(i<num)
		{
			if(num%i==0)
			{
				sum=i+sum;
			}
			i++;
		}
		if(sum==num)
			System.out.println("number is perfect");
		else
			System.out.println("number is not  perfect");
	}
}