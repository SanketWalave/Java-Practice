/*2. Employee Abstract Class
Problem: Create an abstract class Employee with the following fields:
id (int)
name (String)
salary (double)
Add an abstract method calculateBonus() to compute the bonus for the employee based on the salary.
Then, create two subclasses:
FullTimeEmployee — calculates a 20% bonus.
PartTimeEmployee — calculates a 10% bonus.
Write a program that calculates and displays the bonus for both types of employees.
Explanation:
The abstract class Employee provides common properties and an abstract method for bonus calculation.
Each subclass has its own bonus logic.
Logical operation: Polymorphism is demonstrated by calculating the bonus differently based on the type of employee.
*/

import java.util.*;
abstract class Employee
{
	protected int eid;
	protected String name;
	protected  double salary;
	void setEid(int eid)
	{
		this.eid=eid;
	}
	void setName()
}
public class Employee_8_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
	}
}