/*Example4: WAP to create class name as Factorial with two functions 
void setValue(): this function can accept the number as parameter
void showFactorial(): this function can calculate factorial and display it.

*/
import java.util.*;
class Fact
{
	private long num,factorial;
	private Scanner sc=new Scanner(System.in);
	void setValue()
	{
		System.out.println("Enter number");
		num=sc.nextInt();
	}
	void showFactorial()
	{
		factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial*=i;
			
		}
		System.out.println("Factorial--->"+factorial);
	}
}
public class Factorial_class
{
	public static void main(String x[])
	{
		Fact ft=new Fact();
		ft.setValue();
		ft.showFactorial();
	}
}