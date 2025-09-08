/*1. Vehicle Abstract Class
Problem: Create an abstract class Vehicle that has the following methods:
start() — a method to start the vehicle (returns a String).
stop() — a method to stop the vehicle (returns a String).
fuelEfficiency() — an abstract method to calculate fuel efficiency in kilometers per liter, which will be implemented by subclasses.
Then, create two subclasses:
Car (has a fuelEfficiency() method that returns 15 km/l).
Bike (has a fuelEfficiency() method that returns 30 km/l).
Write a program that demonstrates the behavior of starting and stopping vehicles and prints their fuel efficiency.
Explanation:
The abstract class Vehicle will have common methods start() and stop().
fuelEfficiency() is abstract, forcing subclasses to implement it.
Logical operation: Use start() and stop() for vehicles and show the differences in fuel efficiency based on the type.
 
*/
abstract class Vehicle
{
	
	abstract public int fuelEfficiency();
	/*public String start()
	{
		return "vehicle started";
	}
	public String stop()
	{
		return "vehicle Stop";
	}*/
}
class Car extends Vehicle
{
	public String start()
	{
		return "Car started";
	}
	public String stop()
	{
		return "car Stop";
	}
	public int fuelEfficiency()
	{
		return 15;
	}
}
class Bike extends Vehicle
{
	public String start()
	{
		return "Bike started";
	}
	public String stop()
	{
		return "Bike Stop";
	}
	public int fuelEfficiency()
	{
		return 30;
	}
}
public class Vehicle_16_3
{
	public static void main(String x[])
	{
		//Scanner sc=new Scanner(System.in);
		Vehicle v;
		v=new Car();
		System.out.println(v.start());
		System.out.println("fule iffincy of car "+v.fuelEfficiency()+"km/l");
		System.out.println(v.stop());
		
		v=new Bike();
		System.out.println(v.start());
		System.out.println("fule iffincy of bike "+v.fuelEfficiency()+"km/l");
		System.out.println(v.stop());
	}
}