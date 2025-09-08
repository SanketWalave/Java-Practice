/*1. Create a Rectangle class
Create a Rectangle class with length and breadth as instance variables.
Write a default constructor that assigns both values to 5.
Add a method area() to calculate and display the area of the rectangle.
Explanation: This practice teaches how to initialize instance variables using the default constructor and perform a calculation.
*/
import java.util.*;
class Rectangle
{
	private int length;
	private int breadth;
	Rectangle()
	{
		this.length=5;
		this.breadth=5;
	}
	int area()
	{
		return length*breadth;
	}
}
public class RectArea_16_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Rectangle r=new Rectangle();
		System.out.println("Area of reactangle  "+r.area());
	}
}