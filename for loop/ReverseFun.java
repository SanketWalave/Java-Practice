import java.util.*;
public class ReverseFun
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int result=getRev(num);
		System.out.println(result);
		
	}
	public static int getRev(int no)
	{
		int rem=1,temp;
		temp=no;
		int rev=0;
		for(;no!=0;)
		{
			rem=no%10;
			rev=rem+(rev*10);
			no=no/10;
			
		}
		int result=rev;
		return result;
	}
}