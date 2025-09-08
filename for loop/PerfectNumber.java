import java.util.*;
public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int num,i,temp,multi=0;
		num=sc.nextInt();
		temp=num;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				multi=multi+i;
			}
		}
		if(multi==num)
			System.out.println("Strong number");
		else
			System.out.println("not Strong number");
	}
}