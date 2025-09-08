/*1. Create a system that calculates salaries for employees using an interface and 
inheritance.
Specifications:
1. Create an interface SalaryCalculator with a method calculateSalary().
2. Create an abstract class Employee that implements SalaryCalculator:
o Fields: name, employeeID, baseSalary.
o Abstract method getBonus() (calculates bonus based on employee type).
3. Create two subclasses of Employee:
o Manager with additional field teamSize and an implementation for 
getBonus() (bonus = 20% of base salary).
o Developer with additional field projectsCompleted and an implementation 
for getBonus() (bonus = 10% of base salary).
4. Write a main method to:
o Create instances of Manager and Developer.
o Call calculateSalary() to calculate and display the total salary, including 
bonus, for both types of employees.
*/
import java.util.*;
interface SalaryCalculator
{
	void calculateSalary();
}
abstract class Employee implements SalaryCalculator
{
	protected String name;
	protected int employeeId;
	protected int salary;

	Employee(String name,int employeeId,int salary)
	{
		this.name=name;
		this.employeeId=employeeId;
		this.salary=salary;
	}
	String getName()
	{
		return name;
	}
	int getEmployeeId()
	{
		return employeeId;
	}
	int getSalary()
	{
		return salary;
	}

	abstract void getBonus();
	public void calculateSalary()
	{
		
	}

}
class Manager extends Employee
{
	protected int teamSize;
	protected int bonus;
	Manager(String name,int employeeId,int salary,int teamSize)
	{
		super(name,employeeId,salary);

		this.teamSize=teamSize;
	}
	
	void getBonus()
	{
		bonus=(salary*20)/100;
		
	}
	public void calculateSalary()
	{
		System.out.println("Employee name  \t"+name);
		System.out.println("Employee id    \t"+employeeId);
		System.out.println("Employee Salary\t"+salary);
		System.out.println("Team size      \t"+teamSize);
		salary+=bonus;
		System.out.println("Salary after bonus \t"+salary);
	}



}
class Developer extends Employee
{
	protected String projectCompleated;
	protected int bonus;
	Developer(String name,int employeeId,int salary,String projectCompleated)
	{
		super(name,employeeId,salary);

		this.projectCompleated=projectCompleated;
	}
	
	void getBonus()
	{
		bonus=(salary*10)/100;
		
	}
	public void calculateSalary()
	{
		System.out.println("Employee name  \t"+name);
		System.out.println("Employee id    \t"+employeeId);
		System.out.println("Employee Salary\t"+salary);
		System.out.println("Projrct complit\t"+projectCompleated);
		salary+=bonus;
		System.out.println("Salary after bonus \t"+salary);
	}

}

public class Employee_28_1
{
	public static void main(String x[])
	{
		System.out.println("\n\n==============================================================\n\n");
		
		Manager m=new Manager("Manager",1,1000,10);
		m.getBonus();
		m.calculateSalary();
System.out.println("\n\n==============================================================\n\n");
		
		Developer d=new Developer("Developer",2,10000,"yes");
		d.getBonus();
		d.calculateSalary();
	}
}