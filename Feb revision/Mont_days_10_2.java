/*8. Number of Days in a Month
Description: Create a program that takes a month and year as input and returns the number of days in that month, 
considering leap years. Use if-else and switch to handle month-specific logic.
Concepts Covered: if-else, switch, leap year logic, date handling.
*/
import java.util.*;
public class Mont_days_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter month");
		int month=sc.nextInt();
		System.out.println("Enter year");
		int year=sc.nextInt();
		
		switch(month)
		{
			case 1:
			System.out.println("jan 31 days");
			break ;
			case 2:
			
			if((year%4==0 && year%100!=0)||(year%400==0))
				System.out.println("feb 29 days leap year");
			else 
				System.out.println("feb 28 days");
			break;
			case 3:
			System.out.println("march 31 days");
			break ;
			case 4:
			System.out.println("april 30 days");
			break ;
			case 5:
			System.out.println("may 31 days");
			break ;
			case 6:
			System.out.println("jun 30 days");
			break ;
			case 7:
			System.out.println("julai 31 days");
			break ;
			case 8:
			System.out.println("oug 31 days");
			break ;
			case 9:
			System.out.println("sept 30 days");
			break ;
			case 10:
			System.out.println("jan 31 days");
			break ;
			case 11:
			System.out.println("nov 30 days");
			break ;
			case 12:
			System.out.println("desc 31 days");
			break ;
			default:
			System.out.println("invalid month");
			break ;
			
			
		}
	}
}