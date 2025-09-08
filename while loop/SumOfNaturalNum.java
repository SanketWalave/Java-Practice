import java.util.*;
public class SumOfNaturalNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num,i=0;
		num=sc.nextInt();
	/*	while(num!=0)
		{
			 i=i+num;
			num--;
		}
		*/
		for(;num!=0;num--)
		{
			i=i+num;
		}
		System.out.println("sum ="+i);
	}
}