/*6. Traffic Light System Simulation
Description: Simulate a traffic light system. Use switch to determine the color of the light (Red, Yellow, or Green) and
 display the action to take (Stop, Get Ready, Go).
Concepts Covered: switch, case labels, user input handling.
*/
import java.util.*;
public class Traffic_light_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Sylect signal");
		System.out.println("1:Red");
		System.out.println("2:Yellow");
		System.out.println("3:Green");
		System.out.println("Enetr signal");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Stop");
			break;
			case 2:
			System.out.println("Get Redy");
			break;
			case 3:
			System.out.println("Go");
			break;
			default :
			System.out.println("Invalid signal");
			break;
		}
	}
}