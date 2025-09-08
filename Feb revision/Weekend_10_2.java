/*10. Weekday or Weekend
Description: Write a program that accepts a number (1-7) from the user representing a day of the week.
 Use switch to print whether it’s a weekday or a weekend.
Concepts Covered: switch, case labels, user input validation.
*/
import java.util.*;
public class Weekend_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day number");
		int day=sc.nextInt();
		
		switch(day)
		{
			case 1:
			System.out.println("weekday");
			break;
			case 2:
			System.out.println("weekday");
			break;
			case 3:
			System.out.println("weekday");
			break;
			case 4:
			System.out.println("weekday");
			break;
			case 5:
			System.out.println("weekday");
			break;
			case 6:
			System.out.println("weekend");
			break;
			case 7:
			System.out.println("weekend");
			break;
			default:
			System.out.println("invalid day");
			break;
		}
	}
}