import java.util.*;
public class ArmstrongFunRe
{
	static int sum=0,count=0;
	static boolean flag;
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		boolean res=armstrong(no);
		System.out.println("Number is armstrong\n"+flag);
	}
	public static boolean armstrong(int num)
	{
		int sum = 0,count = 0;
		int temp = num;
		if(temp!=0)
		{
			count++;
			temp /= 10;
			
		}
		temp = num;
		for(;temp!=0;temp/=10)
		{
			int rem = temp % 10;
			int p = 1;
			for(int i = 1;i <= count;i++)
			{
				p = p * count;
			}
			sum = sum + p;
			System.out.println(sum);
		}
		if(num == sum)
		{
			flag = true;
		}
		 armstrong(num);
		return flag;
	}
}