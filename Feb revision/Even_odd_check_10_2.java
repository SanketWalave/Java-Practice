/*2. Even or Odd Checker
Description: Write a program to check whether a given number is even or odd. Use the modulo operator and if-else statements to determine the result.
Concepts Covered: if-else, modulo operator, basic conditional logic.
*/
import java.util.*;
public class Even_odd_check_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
}