import java.util.*;
public class Area2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.area of triangle");
		System.out.println("2.area of  equilateral triangle");
		System.out.println("3.area of reactangle");
		System.out.println("4.area of square");
		System.out.println("5.area of circle");
		System.out.println("6.area of isoscalen triangle");
	//	System.out.println("4.area of circumferance");
		
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		int base , hight,area,side1,side2,side3,side;
		 switch(choice)
		 {
		 case 1:
		 System.out.println("Enter base and hight");
		  base=sc.nextInt();
		  hight=sc.nextInt();
		  area=(base*hight)/2;
		 System.out.println("area of triangle is "+area);
		 break ;
		 case 3:
		 System.out.println("enter hight and width");
		  hight=sc.nextInt();
		 int width=sc.nextInt();
		  area=hight*width;
		 System.out.println("area of rectangle is"+area);
		 break ;
		 case 5:
		 System.out.println("enter radius of circle");
		 float pi=3.14f;
		 float radius=sc.nextFloat();
		 float areacircle=radius*radius*pi;
		 System.out.println("area of circle is  "+areacircle);
		 break ;
		 case 4:
		 System.out.println("enter side of square");
		 side=sc.nextInt();
		 area=side*side;
		 System.out.println("area if square  "+area);
		 break ;
		 case 2:
		 System.out.println("enter side of equilateral triangle");
		 side=sc.nextInt();
		double area3=(1.73*side*side) / 4;
		 System.out.println("Area of equilateral triangle "+area3);
		 break ;
		 case 6:
		 System.out.println("enter base and hght");
		 base=sc.nextInt();
		 hight=sc.nextInt();
		 area=(base*hight)/2;
		 System.out.println("area of isoscalen triangle is "+area);
		 break ;
		 default :
		 System.out.println("please enter valid choice");
		 }
	}
}