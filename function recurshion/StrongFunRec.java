import java.util.*;
public class StrongFunRec
{
	static int fact=1,rem=1,sum=0;
	static boolean flag;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		boolean res=strong(no);
		System.out.println("number is strong\n"+flag);
	}
	public static boolean strong(int num)
	{
		flag=false;
		int temp=num;
		if(num!=0)
		{
			rem=num%10;
			fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
			sum=sum+fact;
			System.out.println(sum);
			num/=10;
			strong(num);
		}
		if(sum==temp)
		{
			flag=true;
		}
		return flag;
	}
}