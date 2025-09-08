import java.util.*;
public class CheckTriangle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sides of triangle");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();//equilateral, isosceles or scalene
		String result=
		(side1==side2 && side2==side3 && side3 == side1)	?"triangle is equilateral":
		(side1==side2 || side2==side3 || side3 == side1)?"triangle is isosceles":
		"triangle is scalen";
		System.out.println(result);/*
		if(side1==side2 && side2==side3 && side3 == side1)
		{
			System.out.println("triangle is equilateral");
		}
		else if(side1==side2 || side2==side3 || side3 == side1)
		{
			System.out.println("triangle is isosceles");
		}
		else
		{
			System.out.println("triangle is scalene");
		}*/
	}
}
