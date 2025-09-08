/*Q1. WAP to create class name as Employee with field id,name and salary and create array of object of size 5 and
 perform following operation on it.
Case 1: Add New Employee details 
Case 2: View all employee details
Case 3: Sort All employee records by using its id.
Case 4: Search employee by using name means you have to input the name of employee and search employee present in array or not 
*/
import java.util.*;
class Employee
{
	private int id,salary;
	private String name;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int geSalary()
	{
		return salary;
	}
}
public class Employee_App_20_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		Employee e[]=new Employee[size];
		boolean flag=true;
		do{
		System.out.println("Enter your choice");
		System.out.println("Case 1: Add New Employee details");
		System.out.println("Case 2: View all employee details");
		System.out.println("Case 3: Sort All employee records by using its id.");
		System.out.println("Case 4: Search employee by using name means you have to input the name of employee and search employee present in array or not ");
		
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			for(int i=0;i<e.length;i++)
			{
				
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("enter salary");
				int salary=sc.nextInt();
				e[i]=new Employee(id,name,salary);
			}
			break ;
			case 2:
			System.out.println("id\t\tname\t\tsalary");
			for(int i=0;i<e.length;i++)
			{
				System.out.println(e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].geSalary());
			}
			break;
			case 3:
			    for(int i=0;i<e.length;i++)
				{
					for(int j=i+1;j<e.length;j++)
					{
						if(e[i].getId()>e[j].getId())
						{
						   Employee temp=e[i];
							e[i]=e[j];
							e[j]=temp;
						}
					}
				}
			break;
			case 4:
			System.out.println("Enter employee name to find");
			boolean flag1=true;
			      String name2=sc.next();
				  for(int i=0;i<e.length;i++)
				  {
					  if(name2.equals(e[i].getName()))
					  {
						  System.out.println("Employee found");
						  flag1=false;
						  break;
					  }
				  }
				  if(flag1)
					  System.out.println("Employee not found");
			
			break;
			
			default:
			      flag=false;
				  break;
			}
			
		}while(flag);
		
		
	}
}