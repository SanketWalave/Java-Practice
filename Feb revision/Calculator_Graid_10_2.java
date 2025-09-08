/*3. Grade Calculator
Description: Create a program that takes a student's score and outputs their grade (A, B, C, etc.) 
based on a given range of scores. Use if-else or switch statements for the grading logic.
Concepts Covered: if-else, switch, logical operators.
*/
import java.util.*;
public class Calculator_Graid_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of student");
		int m=sc.nextInt();
		if(m>=80 && m<=100)
			System.out.println("graid A");
		else if(m>=60 && m<80)
			System.out.println("graid B");
		else if(m>=40 && m<60)
			System.out.println("graid c");
		else if(m>=35 && m<40)
			System.out.println("graid F");
		else if(m<35)
			System.out.println("fail");
		else
			System.out.println("	INVALID");
	}
}