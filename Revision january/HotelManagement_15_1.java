/*4. Hotel Staff Management
Create a Staff POJO class with fields: staffID, name, role, and salary.
Create a HotelManagement class that:
Adds staff members.
Calculates the total salary of all staff.
Lists all staff members in a specific role (e.g., manager, housekeeper).
*/
import java.util.*;
class Staff
{
	private String staffID;
	private String name;
	private String role;
	private int salary;
	void setStaffId(String staffID)
	{
		this.staffID=staffID;
	}
	String getStaffId()
	{
		return staffID;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setRole(String role)
	{
		this.role=role;
	}
	String getRole()
	{
		return role;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}
}
class HotelManagement
{
	private Staff []s;
	void setArray(Staff ...s)
	{
		this.s=s;
	}
	int getTotalSal()
	{
		int sum=0;
		System.out.println("===========================================================================");
		System.out.println("staffID\t\t staff name\t\t staff role\t\tstaff salary");
		System.out.println("");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getStaffId()+"\t\t\t"+s[i].getName()+"\t\t "+ s[i].getRole()+"\t\t\t"+s[i].getSalary());
			sum+=s[i].getSalary();
		}
		System.out.println("===========================================================================");

		return sum;
	}
}
public class HotelManagement_15_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		
		Staff s[]=new Staff[2];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("==================================================================");
			System.out.println("Enter id of staff");
			String staffID=sc.next();
			System.out.println("Enter name of staff");
			String name=sc.next();
			System.out.println("Enter role  of staff");
			String role=sc.next();
			System.out.println("Enter salary");
			int salary=sc.nextInt();
			
			s[i]=new Staff();
			s[i].setStaffId(staffID);
			s[i].setName(name);
			s[i].setRole(role);
			s[i].setSalary(salary);
		}
		HotelManagement hm=new HotelManagement();
		hm.setArray(s);
		System.out.println("\t\t total salary"+hm.getTotalSal());

		
	}
}