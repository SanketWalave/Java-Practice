import java.util.*;
public class PerfectNumberUpto
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int limit,i,temp;
		limit=sc.nextInt();
		for(int j=1;j<=limit;j++)
		{
			//int num=j;
			int multi=0;
		for(i=1;i<j;i++)
		{
			if(j%i==0)
			{
				multi=multi+i;
			}
		}
		if(multi==j)
			System.out.println(j);
		
		}
	}
}