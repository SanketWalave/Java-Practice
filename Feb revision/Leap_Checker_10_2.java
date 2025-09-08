/*4. Leap Year Checker
Description: Implement a program that checks if a given year is a leap year. A year is a leap year if it's divisible by 4, but not divisible by 100,
 unless it's also divisible by 400.
Concepts Covered: if-else, conditional logic, modulus operator.*/
import java.util.*;
public class Leap_Checker_10_2
{
	public static void main (String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println("Year is leap year");
		else
			System.out.println("Year is not leap year");
	}
}