import java.util.*;
public class AreaOfCirculeIfRadiusIsPositive
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		int radius=sc.nextInt();
		float pi=3.14f;
	   float area=(radius>0)?pi*radius*radius:-1;
	   System.out.println(area);
	}
}