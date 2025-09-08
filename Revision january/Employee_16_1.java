/*4. Create a Employee class with fields empId, empName, and salary. 
Write a parameterized constructor to initialize these fields and
 a method to display the details along with a salary increase if applicable.
Explanation: Focuses on using constructors to set employee attributes and 
implementing logic to apply conditions on salary.
*/
import java.util.*;
class Employee
{
	private int empId;
	private String empName;
	private int salary;
	Employee(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void display()
	{

		System.out.println("Employee Id    \t"+empId);
		System.out.println("Employee name  \t"+empName);
		System.out.println("Employee Salary\t"+salary);
	}
}
public class Employee_16_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of employee");
		int empId=sc.nextInt();
		System.out.println("Enter name of employee");
		String empName=sc.next();
		System.out.println("Enter salary of employee");
		int salary=sc.nextInt();

		Employee e=new Employee(empId,empName,salary);
		e.display();
	}
}