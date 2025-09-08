import java.util.*;
public class DuckFun
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sc.nextInt();
		boolean result=isDuck(num);
		System.out.println(result);
		
	}
	public static  boolean isDuck(int no)
	{
		boolean b=false,result=true;
		int rem=0;
		for(;no!=0;no/=10)
		{
			rem=no%10;
			if(rem==0)
			{
				b=true;
				break;
			}
		}
		if(b==true)
		{
			result=true;
		}
		else
		{
			result=false;
		}
		return result;
	}
}