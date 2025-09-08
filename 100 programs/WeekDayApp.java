import java.util.*;
public class WeekDayApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter week number");
		int day=sc.nextInt();
		switch(day)
		{
			case 1:
			System.out.println("sunday");
			break;
			case 2:
			System.out.println("munday");
			break;
			case 3:
			System.out.println("tusday");
			break;
			case 4:
			System.out.println("wensday");
			break;
			case 5:
			System.out.println("thusday");
			break;
			case 6:
			System.out.println("friday");
			break;
			case 7:
			System.out.println("saterday");
			break;
			default:
			System.out.println("envalid");
			break;
			
		}
	}
}