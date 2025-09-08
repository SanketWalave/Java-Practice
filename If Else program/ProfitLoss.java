import java.util.*;
public class ProfitLoss
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter cost price");
		int cost=sc.nextInt();
		System.out.println("enter Selling price");
		int sellpr=sc.nextInt();
		//String result=rate>sellpr?"loss":"profit";
		//System.out.println(result);
		if (cost>sellpr)
		{
			System.out.println("loss");
			int loss=cost-sellpr;
			System.out.println("loss is "+loss);
		}
		else
		{
			System.out.println("profit");
			int profit=sellpr-cost;
			System.out.println("profit is  "+ profit);
			
		}
	}
}