/*1. Create a Car class
Create a Car class with fields speed and fuel.
The default constructor should initialize speed to 60 and fuel to 50.
Add a method drive() to simulate fuel reduction by 10 units per drive, and
 display the updated fuel level.
Explanation: Simulates state changes in objects through method logic.
*/
class Car
{
	private int speed;
	private int fule;
	Car()
	{
		this.speed=60;
		this.fule=50;
	}
	void drive()
	{
		fule-=10;
		System.out.println("Speed\t"+speed);
		System.out.println("fule \t"+fule+"\n\n\n");
	}

}
public class Car_18_1
{
	public static void main(String x[])
	{
		Car c=new Car();
		c.drive();
		c.drive();
	}
}