/*1. Vehicle and Insurance Problem
Problem: Design a system where you have a Vehicle class with subclasses Car and Bike.
 Each subclass has an insuranceCost() method to calculate the insurance cost. 
 Use inheritance to reuse the logic for base calculation but override for specific insurance calculations in subclasses.
 Ensure the base class doesn't use constructors.
Explanation:
Create a base Vehicle class with default values and methods for base insurance logic.
Car and Bike override insuranceCost() based on their specific needs.
Logical operation: Calculate the insurance cost based on age and type of vehicle.
Hint: Use methods to initialize values instead of constructors.
*/
import java.util.*;
abstract class Vaical 
{
	protected int age;
	void setValue(int age)
	{
		this.age=age;
	}
	abstract double insuranceCost();
	
}
class Car extends Vaical
{
	
	double insuranceCost()
	{
		double insu=500;
		/*if(age<5)
		{
			return insu*1.2;
		}
		else if(age<15)
		{
			return insu;
		}
		else 
		{
			return insu*1.5;
		}*/
		insu=
		age<5?insu*1.2:
		age<15?insu:
		insu*1.5;
		
		return insu;
			
	}
}
class Bike extends Vaical
{
	double insuranceCost()
	{
		double insu=400;
		if(age<5)
		{
			return insu*1;
		}
		else if(age<15)
		{
			return insu;
		}
		else 
		{
			return insu*1.4;
		}
	}
}
public class Vaical_Inshu_Inh
{
	public static void main (String x[])
	{
		Scanner sc=new Scanner(System.in);
		Car c=new Car();
		System.out.println("Enter age of car");
		int agec=sc.nextInt();
		c.setValue(agec);
		System.out.println("Ensurence of car is\t"+c.insuranceCost());
		
		Bike b=new Bike();
		System.out.println("Enter age of bike");
		int ageb=sc.nextInt();
		b.setValue(ageb);
		System.out.println("Ensurence of bike is\t"+b.insuranceCost());
		
	}
}