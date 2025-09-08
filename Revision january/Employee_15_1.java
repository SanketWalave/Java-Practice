/*2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/
class Employee
{
	private String name;
	private String field;
	private int salary;
	private String department;
	void setValues(String name,String field,int salary,String department)
	{
		this.name=name;
		this.field=field;
		this.salary=salary;
		this.department=department;
	}
	void show()
	{
		System.out.println("name of employee  \t"+name);
		System.out.println("name of field     \t"+field);
		System.out.println("salary of employee\t"+salary);
		System.out.println("department        \t"+department);
		int increment=salary*10/100;
		System.out.println("Salary after 10% bonus\t"+(salary+increment));
	}
}
public class Employee_15_1
{
	public static void main(String x[])
	{
		
		
		Employee emp=new Employee();
		emp.setValues("Sanket","IT",100,"hr");
		emp.show();
	}
}