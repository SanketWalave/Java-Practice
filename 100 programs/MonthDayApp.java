import java.util.*;
public class MonthDayApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		int month=sc.nextInt();
		switch(month)
		{
			case 1:
			System.out.println("number of days--->31");
			break;
			case 2:
			System.out.println("number of days--->28");
			break;
			case 3:
			System.out.println("number of days--->31");
			break;
			case 4:
			System.out.println("number of days--->30");
			break;
			case 5:
			System.out.println("number of days--->31");
			break;
			case 6:
			System.out.println("number of days--->30");
			break;
			case 7:
			System.out.println("number of days--->31");
			break;
			case 8:
			System.out.println("number of days--->31");
			break;
			case 9:
			System.out.println("number of days--->30");
			break;
			case 10:
			System.out.println("number of days--->31");
			break;
			case 11:
			System.out.println("number of days--->30");
			break;
			case 12:
			System.out.println("number of days--->31");
			break;
			default:
			System.out.println("envalid");
			break;
			
		}
	}
}