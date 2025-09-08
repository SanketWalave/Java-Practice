import java.util.*;
public class Armstrong
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num,temp,count=0;
		num=sc.nextInt();
		//temp=num;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}