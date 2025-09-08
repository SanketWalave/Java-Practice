import java.util.*;
public class DuckNumber
{
	public static void main(String x[])
	{
		boolean b=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int rem=0;
		for(;num!=0;num/=10)
		{
			rem=num%10;
			if(rem==0)
			{
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("duck");
		else
			System.out.println(" not duck");
	}
}