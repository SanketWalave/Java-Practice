// Write a ternary expression to return "Weekend" if the day 
//of the week is Saturday or Sunday, otherwise return "Weekday".
import java.util.*;
public class WeekendWeekday
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day(Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday)");
	    String day=sc.nextLine();
	//	String result= (day.equals("saturday") || day.equals("sunday"))?"weekend":"Weekday";
	//	System.out.println(result);
	if(day.equals("saturday") || day.equals("sunday"))
	{
		System.out.println("weekend");
	}
	else
	{
		System.out.println("weekday");
	}
	}
}
