import java.util.*;
public class Area_Fun_Over
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		float radius=sc.nextInt();
		area(radius);
		System.out .println();
		System.out.println("hight and width");
		int height=sc.nextInt();
		int width=sc.nextInt();
		area(height,width);
	}
	public static void area(float redi)
	{
		float pi=3.14f;
		float area=pi*redi*redi;
		System.out.println("Area of circle  "+area);
	}
	public static void area(int height,int width)
	{
		System.out.println("Area of rectangle is  "+height*width);
	}
}