/*Q1. WAP to create abstract class name as Coupen with following methods 
void  setCourse( Course …course,String userType):this function can accept the course detail and user type 
int getBill(): this function return the bill for courses according to user type
Course: you have to create Course as POJO class with field  id,name,fees 
You have to create two implementer classes 
Student: you have to inherit the Coupen class in Student class and override the getBill() method and
 if a student purchases more than 3 courses then give 20% discount on every course
 and calculate the total fees excluding 20% discount and return it.
Employee: you have to inherit the Coupen class in Employee class and
 override getBill() method and if Employee purchase more than 5 course then give 10% discount 
Note: case 1: for student 
	  Case 2:Employee
Note: you have to implement the above scenario using Dynamic polymorphism.
*/
import java.util.*;
class  Cource
{
	protected int courceid;
	protected String courceName;
	protected int fees;
	void setCid(int courceid)
	{
		this.courceid=courceid;
	}
	int getCid()
	{
		return courceid;
	}
	void setCname(String courceName)
	{
		this.courceName=courceName;
	}
	String getCname()
	{
		return courceName;
	}
	void setFees(int fees)
	{
		this.fees=fees;
	}
	int getFees()
	{
		return fees;
	}
	
}
abstract class Coupen
{
	
	abstract void setCource(String userType,Cource ...cource);
	
	 abstract int getBill();
	
}
class Student extends Coupen
{
	protected Cource cource[];
	protected String userType;
	void setCource(String userType,Cource ...cource)
	{
		this.cource=cource;
		this.userType=userType;
	}
	/*int getBill()
	{
		int sum=1,discount=1;
		if(cource.length>=3)
		{
			for(int i=0;i<cource.length;i++)
			{
				int temp=cource[i].getFees()*0.2;
				discount+=temp;
				sum+=cource[i].getFees();
				
			}
			
		}
		return sum-discount;
	}*/
	int getBill() {
        int total = 0;

        // Apply 20% discount if the student has purchased more than 3 courses
       if(cource.length>=3) {
           for(int i=0;i<cource.length;i++) {
                total += cource[i].getFees() * 0.8;  // 20% discount
            }
        } else {
            // No discount if the student purchases 3 or fewer courses
            for(int i=0;i<cource.length;i++) {
                total += cource[i].getFees();
            }
        }
        return total;
    }
}


class Employee extends Coupen
{
	protected Cource cource[];
	protected String userType;
	void setCource(String userType,Cource ...cource)
	{
		this.cource=cource;
		this.userType=userType;
	}
	/*int getBill()
	{
		int sum=1,discount=1;
		if(cource.length>=5)
		{
			for(int i=0;i<cource.length;i++)
			{
				int temp=cource[i].getFees()*0.1;
				discount+=temp;
				sum+=cource[i].getFees();
				
			}
			
		}
		return sum-discount;
	}*/
	int getBill() {
        int total = 0;

        // Apply 20% discount if the student has purchased more than 3 courses
       if(cource.length>=3) {
           for(int i=0;i<cource.length;i++) {
                total += cource[i].getFees() * 0.8;  // 20% discount
            }
        } else {
            // No discount if the student purchases 3 or fewer courses
            for(int i=0;i<cource.length;i++) {
                total += cource[i].getFees();
            }
        }
        return total;
    }
}
public class Cource_Abs
{
	public static void main(String x[])
	{
		Cource c1=new Cource();
		c1.setCid(1);
		c1.setCname("aaa");
		c1.setFees(111);
		
		Cource c2=new Cource();
		c2.setCid(1);
		c2.setCname("aaa");
		c2.setFees(111);
		
		Cource c3=new Cource();
		c3.setCid(1);
		c3.setCname("aaa");
		c3.setFees(111);
		
		Cource c4=new Cource();
		c4.setCid(1);
		c4.setCname("aaa");
		c4.setFees(111);
		
		Cource c5=new Cource();
		c5.setCid(1);
		c5.setCname("aaa");
		c5.setFees(111);
		
		Cource c6=new Cource();
		c6.setCid(1);
		c6.setCname("aaa");
		c6.setFees(111);
		
		
		
		Student student=new Student();
		student.setCource("student",c1,c2,c3,c4);
		int bill=student.getBill();
		
		System.out.println("Fees of student= \t"+bill);
		
		Employee emp=new Employee();
		emp.setCource("Emloyee",c2,c3,c4,c5,c1);
		int bill1=emp.getBill();
		
		System.out.println("Fees of employee= \t"+bill1);
	}
}