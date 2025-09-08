import java.util.*;
public class LossProfitApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cost price");
		int cost=sc.nextInt();
		System.out.println("enter cost price");
		int sell=sc.nextInt();
		String result=cost<sell?"profit":"loss";
		System.out.print(result);
	}
}