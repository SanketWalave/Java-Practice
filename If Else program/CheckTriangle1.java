import java.util.*;
public class CheckTriangle1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three angles of triangle");
		float angle1,angle2,angle3;
		angle1=sc.nextFloat();
		angle2=sc.nextFloat();
		angle3=sc.nextFloat();
		Float sum=angle1+angle2+angle3;
		if(sum==180)
		{
			System.out.println("triangle is valid");
		}
		else
		{
			System.out.println("triangle is not valid");
		}
	}
}