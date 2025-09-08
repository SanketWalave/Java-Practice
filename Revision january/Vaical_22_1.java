/*1. Vehicle Abstract Class
Problem: Create an abstract class Vehicle that has the following methods:
start() — a method to start the vehicle (returns a String).
stop() — a method to stop the vehicle (returns a String).
fuelEfficiency() — an abstract method to calculate fuel efficiency in kilometers per liter, 
which will be implemented by subclasses.
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
	String start()
	{
		return "vehicle is started";
	}
	String stop()
	{
		return "vehicle is stop";
	}
	abstract int fuelEfficiency();
}
class Car extends Vehicle 
{
	int fuelEfficiency()
	{
		return 15;
	}
}
class Bike extends Vehicle 
{
	int fuelEfficiency()
	{
		return 15;
	}
}
public class Vaical_22_1
{
	public static void main(String x[])
	{
				System.out.println("\n\n=============================================\n\n");

		Car c=new Car();
		System.out.println(c.start());
		System.out.println("Car Fule efficiency "+c.fuelEfficiency()+"km/l");
		System.out.println(c.stop());
		System.out.println("\n\n=============================================\n\n");
		Bike b=new Bike();
		System.out.println(b.start());
		System.out.println(" Bike Fule efficiency "+b.fuelEfficiency()+"km/l");
		System.out.println(b.stop());
				System.out.println("\n\n=============================================\n\n");

	}
}