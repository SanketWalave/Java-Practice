/*Q4. Write program to Create class name as PersonalInfo with parameterized constructor
PersonalInfo(String name, String middlename, String lastname) and you have to create class name as
ProfessionalInfo with parameterized constructor  like as ProfessionalInfo(int id,String des,int
salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass
parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to
define void show() method in ProfessionalInfo and you have to show the all data in show() method.*/
class PersonalInfo{
    protected String name;
    protected String middlename;
    protected String lastname;
    public PersonalInfo(String name,String middlename,String lastname){
        this.lastname=lastname;
        this.middlename=middlename;
        this.name=name;
    }
}
class ProfessionalInfo extends PersonalInfo{

    public ProfessionalInfo(int id,String des,int salary,String skillset,String name,String middlename,String lastname){
        super(name,middlename,lastname);
        System.out.println(id+"\n"+name+"\t"+middlename+"\t"+lastname+"\n"+skillset+"\n"+salary+"\n"+des);
    }
}
public class EmployeeApp_4 {
    public static void main(String[] args) {
        ProfessionalInfo pif=new ProfessionalInfo(1,"asdf",123456,"asdfg","sanket","babaji","Walave");

    }
}
