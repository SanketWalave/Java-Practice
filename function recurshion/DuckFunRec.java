import java.util.*;
public class DuckFunRec
{
	static int rem=1;
	static boolean flag;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		boolean res=duck(no);
		System.out.println("number is duck\n"+flag);
		
	}
	public static boolean duck(int num)
	{
		if(num!=0)
		{
			rem=num%10;
			if(rem==0)
			{
				flag=true;
			}
			num/=10;
			duck(num);
		}
		return flag;
	}
}