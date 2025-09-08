import java.util.*;
public class TriangleCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int angle1,angle2,angle3,sumofangle;
		System.out.println("enter three angle of triangle");
		angle1=sc.nextInt();
		angle2=sc.nextInt();
		angle3=sc.nextInt();
		sumofangle=angle1+angle2+angle3;
		if(sumofangle==180)
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
	}
}