/*1. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers.
 Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
import java.util.*;
class Calculator
{
	private int a;
	private int b;
	void add(int a,int b)
	{
		System.out.println("addition  "+(a+b));
	}
	void subtract(int a,int b)
	{
		System.out.println("subtraction  "+(a-b));
	}
	void multiply(int a,int b)
	{
		System.out.println("multiplication   "+(a*b));
	}
	void divide(int a,int b)
	{
		System.out.println("division   "+(a+b));
	}
}
public class Calculator_13_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		c.add(10,20);
		c.subtract(20,10);
		c.multiply(10,20);
		c.divide(10,20);
	}
}