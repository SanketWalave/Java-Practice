import java.util.*;
public class AddpNaturalNum
{
	static int i=1,sum=0;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=sc.nextInt();
		int res=addition(limit);
		System.out.println(sum);
		
	}
	public static int addition(int li)
	{
		if(i<=li)
		{
			sum+=i;
			i++;
			addition(li);
			
		}
		return sum;
	}
}