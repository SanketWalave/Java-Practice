import java.util.*;
public class TriangleCheck4
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int side1,side2,side3;
		System.out.println("enter three side of triangle");
		side1=sc.nextInt();
		side2=sc.nextInt();
		side3=sc.nextInt();
	/*	if(side1==side2 && side2==side3)
		{
			System.out.println("Triangle is equilateral");
		}
		else if(side1==side2 || side2==side3 || side3==side1)
		{
			System.out.println("Triangle is isoscale");
		}
		else{
			System.out.println("Triangle is scale");
		}
*/     String result=
        (side1==side2 && side2==side3)?"equilateral":
		(side1==side2 || side2==side3 || side3==side1)?"isoscale":"scalen";
		System.out.println(result);
	}
}