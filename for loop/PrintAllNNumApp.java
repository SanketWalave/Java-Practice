import java.util.*;
public class PrintAllNNumApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+"  ");
		}
	}
}