/*4. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/
import java.util.*;
class SimpleInterest
{
	void calculate(int p,int r,int t)
	{
		int intrest=(p*r*t)/100;
		System.out.println("Simple intrest\t\t"+intrest);
	}
}
public class SimpleIntrest_13_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal");
		int principle=sc.nextInt();
		System.out.println("Enter rate of intrest");
		int rate=sc.nextInt();
		System.out.println("Enter time");
		int time=sc.nextInt();
		
		SimpleInterest si=new SimpleInterest();
		si.calculate(principle,rate,time);
	}
}