import java.util.*;
public class ThirdAngleOfTriangleApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three angle of triangle");
		int angle1=sc.nextInt();
		int angle2=sc.nextInt();
		int angle3=180-(angle1+angle2);
		System.out.println("third angle is-->"+angle3);
	}
}