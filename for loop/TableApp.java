import java.util.*;
public class TableApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int multi=0;
		for(int i=1;i<=10;i++)
		{
			multi=num*i;
			System.out.print("\t  "+multi);
		}
	}
}