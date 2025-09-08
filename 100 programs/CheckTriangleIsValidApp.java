import java.util.*;
public class CheckTriangleIsValidApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three angle of triangle");
		int angle1=sc.nextInt();
		int angle2=sc.nextInt();
		int angle3=sc.nextInt();
		
		if(angle1+angle2+angle3 == 180)
			System.out.println("triangle is valid");
		else
			System.out.println("triangle is not valid");			
	}
}