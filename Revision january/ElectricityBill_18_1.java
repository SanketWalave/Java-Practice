/*3. Electricity Bill Calculation
Create a Customer class with fields customerName, customerID, and unitsConsumed. 
Add a method to calculate the bill amount based on units consumed (slab rates).
Explanation: Implement a tiered billing system with logic for each slab.
*/
import java.util.*;
class Customer
{
	private String custName;
	private int custId;
	private int unitsConsumed;
	Customer(String custName,int custId,int unitsConsumed)
	{
		this.custName=custName;
		this.custId=custId;
		this.unitsConsumed=unitsConsumed;
	}
	int calculate()
	{
		System.out.println("Customer name \t"+custName);
		System.out.println("Customer id   \t"+custId);
		int a;int b=0;
		if(unitsConsumed<=100)
		{
			 b=unitsConsumed*3;
		}
		else if(unitsConsumed>=101 && unitsConsumed<=200)
		{
			a=unitsConsumed-100;
			b=300+(a*4);
		}
		else if(unitsConsumed>=201 && unitsConsumed>=400)
		{
			a=unitsConsumed-200;
			b=300+400+(a*5);
		}
		else if(unitsConsumed>400)
		{
			a=unitsConsumed-400;
			b=1200+(a*7);
		}
		return b;
	}
}
public class ElectricityBill_18_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units consumed");
		int unitsConsumed=sc.nextInt();
		Customer c=new Customer("sanket",1,unitsConsumed);
		System.out.println("Customer bill \t"+c.calculate());
		//System.out.println("Customer name \t"+custName);

	}
}