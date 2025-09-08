/*2. Create a Circle class
Create a Circle class with a radius field.
Use a default constructor to set the radius to 10.
Add a method calculateCircumference() to calculate and display the circumference using the formula 2 * π * radius.
Explanation: This   question reinforces object-oriented principles and demonstrates mathematical operations with classes.
*/
class Circle
{
	private int radius;
	public Circle()
	{
		this.radius=10;
	}
	double calculateCircumference()
	{
		return 2*3.14f*radius;
	}
	
}
public class Circle_16_1
{
	public static void main(String x[])
	{
		Circle c=new Circle();
		System.out.println("\n\nCircumference\t=\t"+c.calculateCircumference());
	}
}