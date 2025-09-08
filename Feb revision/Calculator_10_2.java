/*1. Simple Calculator
Description: Create a calculator program that takes two numbers and an operator (+, -, *, /) from the user.
 Use if-else or switch to perform the operation and display the result.
Concepts Covered: if-else, switch, basic arithmetic operations.
*/
import java.util.*;
public class Calculator_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition       = "+(a+b));
		System.out.println("substraction   = "+(a-b));
		System.out.println("multiplication = "+(a*b));
		System.out.println("division       = "+(a/b));
	}
}