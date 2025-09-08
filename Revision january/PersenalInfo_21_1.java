/*4. Write program to Create class name as PersonalInfo with parameterized 
constructor PersonalInfo(String name, String middlename, String lastname)
and you have to create class name as ProfessionalInfo with parameterized 
constructor like as ProfessionalInfo(int id,String des,int salary,String skillset)
and you have to inherit PersonalInfo class in ProfessionalInfo and pass
 parameter from ProfessionalInfo class to PersonalInfo using super() 
 constructor and you have to define void show() method in ProfessionalInfo
 and you have to show the all data in show() method.
  */
  import java.util.*;
  class PersonalInfo
  {
	protected String name;
	protected String middlename;
	protected String lastname;
	public PersonalInfo(String name, String middlename, String lastname)
	{
		this.name=name;
		this.middlename=middlename;
		this.lastname=lastname;
	}
  }
  class ProfessionalInfo extends PersonalInfo
  {
	  protected String des;
	  protected String skillset;
	  protected int id;
	  protected int salary;
	  ProfessionalInfo(String name, String middlename, String lastname,int id,String des,int salary,String skillset)
	  {
		  super(name,middlename,lastname);
		  this.des=des;
		  this.salary=salary;this.skillset=skillset;this.id=id;
	  }
	  void show()
	  {
		  System.out.println("first name   \t"+name);
		  System.out.println("middle name  \t"+middlename);
		  System.out.println("last name    \t"+lastname);
		  System.out.println("employee id  \t"+id);
		  System.out.println("desc         \t"+des);
		  System.out.println("Salary       \t"+salary);
		  System.out.println("Skilset      \t"+skillset);
	  }
  }
  public class PersenalInfo_21_1
  {
	  public static void main(String x[])
	  {
		  ProfessionalInfo pi=new ProfessionalInfo("sanket","babaji","Walave",1,"des",123456,"java developer");
		  pi.show();
	  }
  }