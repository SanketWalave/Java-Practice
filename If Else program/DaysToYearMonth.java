// convert days into year months and weeks 
import java.util.*;
public class DaysToYearMonth
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days");
		int days=sc.nextInt();
		int year=days/365;
		int remaindays=days%365;
		int month=remaindays/30;
		System.out.println("year " +year+ "  months  "+month);
	}
}