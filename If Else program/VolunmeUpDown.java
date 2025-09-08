/*
Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
Input Format
•	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
•	The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.
•	
*/
import java.util.*;
public class VolunmeUpDown
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,diff1,diff2;
		System.out.println(" enter two volumes");
		a=sc.nextInt();
		b=sc.nextInt();
		/*diff1=a-b;
		diff2=b-a;
		if(a>b)
		{
			System.out.println("volume decrease by pressing butten   "+ diff1+ "times");
		}
		else
		{
			System.out.println("volume increase by pressing butten  "+ diff2+ "times");
		}*/
		int result=(a>=b)? (a-b):(b-a);
		System.out.println(result);

	}
}