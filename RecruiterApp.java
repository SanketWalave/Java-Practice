class Experience
{  private String name;
   private String email;
   private String contact;
   private String prevComp;
   private int expSal;
   private int prevSal;
   
   public Experience(String name,String email,String contact,String prevComp,int prevSal,int expSal)
   {
	   this.name=name;
	   this.email=email;
	   this.contact=contact;
	   this.prevComp=prevComp;
	   this.expSal=expSal;
	   this.prevSal=prevSal;
   }
   
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
      return name;
   }
   public void setEmail(String email)
   { this.email=email;
   }
   public String getEmail(){
     return email;
   }
   public void setContact(String contact)
	{ this.contact=contact;
	}
   public String getContact(){
     return contact;
   }
   public void setPrevComp(String prevComp)
   { this.prevComp=prevComp;
   }
   public String getPrevComp(){
     return prevComp;
   }
   public void setPrevSal(int prevSal)
   { this.prevSal=prevSal;
   }
   public int getPrevSal(){
     return prevSal;
	}
	public void setExpSal(int expSal)
	{ this.expSal=expSal;
	}
	public int getExpSal(){
	 return expSal;
	}
}
class Fresher
{ private String name;
   private String email;
   private String contact;
   private String degreeCert;
   private int expSal;
   
   Fresher(){
   }
   
   Fresher(String name,String email,String contact,String degreeCert,int expSal)
   {
	 this.name=name;
     this.email=email;
	 this.contact=contact;
	 this.degreeCert=degreeCert;
	 this.expSal=expSal;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
      return name;
   }
   public void setEmail(String email)
   { this.email=email;
   }
   public String getEmail(){
     return email;
   }
   public void setContact(String contact)
	{ this.contact=contact;
	}
   public String getContact(){
     return contact;
   }
   public void setDegreeCert(String degreeCert)
   { this.degreeCert=degreeCert;
   }
   public String getDegreeCert(){
     return degreeCert;
   }
   public void setExpSal(int expSal)
	{ this.expSal=expSal;
	}
	public int getExpSal(){
	 return expSal;
	}
}
class Recruiter
{  private Experience e;
   private Fresher f;
   Recruiter(Experience e)
   { this.e=e;
   }
   Recruiter(Fresher f)
   {this.f=f;
   }
   void showExperience()
   {
      String name=e.getName();
	  String email=e.getEmail();
	  String contact=e.getContact();
	  String prevComp=e.getPrevComp();
	  int prevSal=e.getPrevSal();
	  int expSal=e.getExpSal();
	  System.out.println("Experience Details\n");
	  System.out.println("===========================================");
	  System.out.println("Name is  "+name);
	  System.out.println("Email is  "+email);
	  System.out.println("Contact is  "+contact);
	  System.out.println("Previous Company  "+prevComp);
	  System.out.println("Previous Salary is  "+prevSal);
	  System.out.println("Expected Salary is  "+expSal);
   }
   void showFresher()
   {             String name=f.getName();
	  String email=f.getEmail();
	  String contact=f.getContact();
	  String degreeCert=f.getDegreeCert();
	   int expSal=f.getExpSal();
	   System.out.println("===========================================");
	  System.out.println("Frehser Details Details\n");
	  System.out.println("============================================");
	  System.out.println("Name is  "+name);
	  System.out.println("Email is  "+email);
	  System.out.println("Contact is  "+contact);
	  System.out.println("Degree Certificate  "+degreeCert);
 	  System.out.println("Expected Salary is  "+expSal);
   }
   
}
public class RecruiterApp
{   
   public static void main(String x[])
   {
     new Recruiter(new Experience("RAM","ram@gmail.com","1234567891","TCS",100000,150000)).showExperience();
	 new Recruiter(new Fresher("Shyam","shyam@gmail.com","2233445566","BTECH",30000)).showFresher();
		
		
   }
}