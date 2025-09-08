import java.util.*;
public class PerfectInRecurshion
{
	static int i=1,sum=0;
	static boolean flag;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		boolean res=perfect(no);
		System.out.println("number is perfect\n"+flag);
		
	}
	public static boolean perfect(int num)
	{
		flag=false;
		if(i<num)
		{
			if(num%i==0)
			{
				sum+=i;
			}
			i++;
			perfect(num);
		}
		if(sum==num)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
		
	}
}