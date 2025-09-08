import java.util.*;
public class TriangleCheckApp
{
	public static void main(String x[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three sides of triangle");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		if(side1==side2 && side2==side3)
		{
			System.out.println("triangle is equilateral");
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("triangle is isoscalen");			
		}
		else{
			System.out.println("triangle is scalen");			
		}
	}
}