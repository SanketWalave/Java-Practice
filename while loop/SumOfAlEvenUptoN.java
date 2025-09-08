import java.util.*;
public class SumOfAlEvenUptoN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sc.nextInt();
		int sum=0 ,i=0;
		while( i<=num)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
		
	}
}  