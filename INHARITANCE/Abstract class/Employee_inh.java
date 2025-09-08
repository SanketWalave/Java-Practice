/*2. Employee Hierarchy
Problem:
 Design an employee system with a base Employee class and subclasses Manager, Developer, and Intern.
The base class should have a method calculateSalary().
Subclasses should override the method to include their bonuses.
Add a workingHours method to adjust salary dynamically based on overtime.
Explanation:
Base class Employee has fields like baseSalary.
Subclasses override calculateSalary() to incorporate bonuses or penalties.
Logical operation: Include overtime hours in salary computation.
Hint: Use method overriding for subclass-specific logic.

*/
import java.util.*;
abstract class Employee
{
	protected int baseSalary;
	protected int overtime;
	void calculateSalary(int baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	void workingHours(int overtime)
	{
		this.overtime=overtime;
	}
}
class Manager extends Employee
{
	Manager(int baseSalary,int workingHours
	void calculateSalary()
	{
		 overtime*=100;
		 
		 baseSalary+=overtime;
		 System.out.println("salary of Manager with overtime  "+baseSalary);
	}
}
class Developer extends Employee
{
	void calculateSalary()
	{
		 overtime*=100;
		 
		 baseSalary+=overtime;
		 System.out.println("salary of Developer with overtime  "+baseSalary);
	}
}
class Intern extends Employee
{
	void calculateSalary()
	{
		 overtime*=100;
		 
		 baseSalary+=overtime;
		 System.out.println("salary of Intern with overtime  "+baseSalary);
	}
}
public class Employee_inh
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
	}
}