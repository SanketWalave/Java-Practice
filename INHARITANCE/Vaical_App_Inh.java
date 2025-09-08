/*1. Write the code to implement the concept of inheritance for Vehicles. You are required to 
implement inheritance between classes. You have to write four classes in java i.e. one superclass, 
two sub classes and one driver class.
Vehicle is the super class whereas Bus and Truck are sub classes of Vehicle class. Transport is a driver 
class which contains main method.
Detailed description:
---------------------------------------------------------------------------------------------

Detailed description of Vehicle (Super class):
The class Vehicle must have following attributes:
1. Vehicle model
2. Registration number
3. Vehicle speed (km/hour)
4. Fuel capacity (liters)
5. Fuel consumption (kilo meters/liter)
The Vehicle class must have following methods:
1. Parameterized constructor that will initialize all the datamembers with the given values.
2. Getters and Setters for each data member that will get and set the values of data members 
of class.
3. A method fuelNeeded() that will takedistance (in kilo meter) as an argument.It will calculate 
the amount of fuel needed for the given distanceand will return the value of fuel needed for 
given distance. You can use the attributes ‘Fuel consumption’defined within above Vehicle 
class to determine the fuel needed forthe given distance. You are required to implement 
thisfunctionality by yourself.
4. A method distanceCovered() that will take time (in hours) as an argument. Itwill calculate the 
distance for the given time and speed andreturns the value of distance. The formula to 
calculate speed isgiven as speed = distance/time. You can use thisformula to calculate the 
distance.
5. A display() method that will displayall the information of a vehicle.

------------------------------------------------------------------------------------------

Detailed description of Truck (Sub class):
The class Truck must have following attribute:
Cargo weight limit (Kilo grams)
The above class must have following methods:
1. Parameterized constructor that will initialize all data memberswith the given values.
2. Getters and setters for each data member that will get and setthe values of data members 
of class.
3. It must also override the display()method of Vehicle class and must call display() method of 
superclass within overridden method.
Detailed description of Bus (Sub class):
----------------------------------------------------------------------------------------------

The class Bus must have following attribute:
No of passengers
The above class must have following methods:
1. Parameterized constructor that will initialize all the datamembers with given values.
2. Getters and setters that will get and set the value of eachdata member of class.
3. It must also override the display()method of Vehicle class and must call display method of 
super classwithin overridden method.
Create a class Transport which contains the main method. Perform the following within 
mainmethod:
• Create an instance of class Truck and initialize all the datamembers with proper values.
• Create an instance of class Bus and initialize all the datamembers with proper values.
• Now, call fuelNeeded(),distanceCovered() anddisplay() methods using objects of 
theseclasses.
*/
import java.util.*;

class Vaical
{
	protected String vmodel;
	protected  int regnum;
	protected  int vspeed;
	protected int vFulCap;
	protected int fuleCunsumptin;
	protected Scanner sc=new Scanner(System.in);
	
	private int discoverd;
	private int fneeded;
	Vaical(String vmodel,int regnum,int vspeed,int vFulCap,int fuleCunsumptin)
	{
		this.vmodel=vmodel;
		this.regnum=regnum;
		this.vspeed=vspeed;
		this.vFulCap=vFulCap;
		this.fuleCunsumptin=fuleCunsumptin;
	}
	String getVmodel()
	{
		return vmodel;
	}
	int getRegnum()
	{
		return regnum;
	}
	int getVspeed()
	{
		return vspeed;
	}
	int getFulCap()
	{
		return vFulCap;
	}
	int getF_Cunsumptin()
	{
		return fuleCunsumptin;
	}
	
	void  fuelNeeded()
	{
		System.out.println("Enter distence to travel");
		int distance=sc.nextInt();
		System.out.println("Enter average of vaical");
		int avg=sc.nextInt();
		
		fneeded= distance/avg;
	}

	void distanceCovered()
	{
		/*System.out.println("Enter distance traveld");
		int dtraveld=sc.nextInt();*/
		System.out.println("Enter time of vaical running");
		int time=sc.nextInt();
		
		 discoverd= time*vspeed;
	}
	void display()
	{
		System.out.println(" model number of vaical   \t"+vmodel);
		System.out.println(" registar number of vaical\t"+regnum);
		System.out.println(" speed of vaical          \t"+vspeed);
		System.out.println(" fule capacity of vaical  \t"+vFulCap);
		System.out.println("fule cunsumption of vaical\t"+fuleCunsumptin);
		System.out.println("fule needed to travel     \t"+fneeded);
		System.out.println("distance traveld          \t"+discoverd);
	}
	
}

class Truck extends Vaical
{
	/*Truck(String vmodel, int regnum, int vspeed, int vFulCap, int fuelConsumption, int cargoLimit) {
        super(vmodel, regnum, vspeed, vFulCap, fuelConsumption);  // Call Vehicle constructor
        this.cargoLimit = cargoLimit;*/
	protected int cargoLimit;
	Truck(String vmodel, int regnum, int vspeed, int vFulCap, int fuelConsumption, int cargoLimit)
	{
        super(vmodel, regnum, vspeed, vFulCap, fuelConsumption);  // Call Vehicle constructor
       
	
		this.cargoLimit=cargoLimit;
	}
	void display()
	{
		super.display();
		System.out.println("cargolimit\t\t"+cargoLimit);
	}
}
class Bus extends Vaical
{
	/*Truck(String vmodel, int regnum, int vspeed, int vFulCap, int fuelConsumption, int cargoLimit) {
        super(vmodel, regnum, vspeed, vFulCap, fuelConsumption);  // Call Vehicle constructor
        this.cargoLimit = cargoLimit;*/
	protected int passengers;
	Bus(String vmodel, int regnum, int vspeed, int vFulCap, int fuelConsumption, int passengers)
	{
        super(vmodel, regnum, vspeed, vFulCap, fuelConsumption);  // Call Vehicle constructor
        
	
		this.passengers= passengers;
	}
	void display()
	{
		super.display();
		System.out.println("passengers limit\t\t"+passengers);
	}
}
public class Vaical_App_Inh
{
	public static void main(String x[])
	{	
		Scanner sc=new Scanner(System.in);
		
		Truck t = new Truck("Volvo", 101, 80, 200, 10, 5000); // Provide correct arguments
		t.fuelNeeded();
		t.distanceCovered();
        t.display();
		
		System.out.println("======================================================================");
  		Bus b = new Bus("V      olvo", 121, 86, 2004, 1440, 54000); // Provide correct arguments
		b.fuelNeeded();
		b.distanceCovered();
        b.display();
        
	}
}