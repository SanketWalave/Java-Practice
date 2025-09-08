/*4. Car Mileage Calculator
Create a Car class with fields make, model, milesDriven, and fuelUsed. Add a method to calculate mileage (milesDriven / fuelUsed).
Explanation: Ensure proper handling of edge cases like zero fuel.
*/
import java.util.*;
class Car 
{
	private String make;
	private String model;
	private int milesDriven;
	private int fuelUsed;
	Car(String make,String model,int milesDriven,int fuelUsed)
	{
		this.make=make;
		this.model=model;
		this.milesDriven=milesDriven;
		this.fuelUsed=fuelUsed;
	}
	void calculateMilage()
	{
		System.out.println("car make  		"+make);
		System.out.println("car model 		"+model);
		System.out.println("car drive miles \t"+milesDriven);
		System.out.println("car use fule    \t"+fuelUsed);
		int milage=milesDriven/fuelUsed;
		System.out.println("milage of car   \t"+milage);
	}
	
}
public class Milage_18_1
{
	public static void main(String x[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter milesDriven and fuelUsed");
		int milesDriven=sc.nextInt();
		int fuelUsed=sc.nextInt();
		
		Car c=new Car("Indian","Scorpio",milesDriven,fuelUsed);
		c.calculateMilage();
	}
}