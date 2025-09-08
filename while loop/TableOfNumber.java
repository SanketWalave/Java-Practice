import java.util.*;
public class TableOfNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			int multi=num*i;
			i++;
			System.out.println(multi);
		}
	}
}