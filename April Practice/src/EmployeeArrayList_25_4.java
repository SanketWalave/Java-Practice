/*
  Q5. WAP to create an Employee class and
  store  5 employee objects in the ArrayList collection
  and perform the following operation on it.
	Case 1: View All Employee Data
	Case 2: Search Employee by using its id.
	Case 3: Delete Employee by using its id.
	Case 4: update employee name by using its id.
	Case 5: find the same name employee
*/
import java.util.*;
class Employee_25_4{
    private int id;
    private String name;
    private int salatry;
    public Employee_25_4(){}
    public Employee_25_4(int id,String name,int salatry){
        this.id=id;
        this.name=name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalatry(int salatry) {
        this.salatry = salatry;
    }

    public int getSalatry() {
        return salatry;
    }
    public String toString(){
        return "id     \t"+id+"\nname  \t"+name+"\nsalary  \t"+salatry;
    }
}
public class EmployeeArrayList_25_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee_25_4 e1=new Employee_25_4(1,"sanket",99999);
        Employee_25_4 e2=new Employee_25_4(2,"abhi",9993);
        Employee_25_4 e3=new Employee_25_4(3,"atul",99329);
        Employee_25_4 e4=new Employee_25_4(4,"saurabh",99199);
        ArrayList<Employee_25_4> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        do{
            System.out.println("Enter your choice.\n" +
                    "\tCase 1: View All Employee Data\n" +
                    "\tCase 2: Search Employee by using its id.\n" +
                    "\tCase 3: Delete Employee by using its id.\n" +
                    "\tCase 4: update employee name by using its id.\n" +
                    "\tCase 5: find the same name employee \n\tcase 6: exit ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    for(Employee_25_4 e:al){
                        System.out.println(e.toString());
                    }
                    break;
                case 2:
                    System.out.println("Enter id to search employee");
                    int id=sc.nextInt();
                    for(Employee_25_4 e:al){
                        if(e.getId()==id) System.out.println(e.toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter id to search employee");
                   int  id2=sc.nextInt();
                    Iterator<Employee_25_4> ia=al.iterator();
                    while (ia.hasNext()){
                        Employee_25_4 e=ia.next();
                        if(e.getId()==id2)ia.remove();
                    }
                    break;
                case 4:
                    System.out.println("Enter id to search employee");
                    id=sc.nextInt();
                    for(Employee_25_4 e:al){
                        if(e.getId()==id) {
                            System.out.println("enter new name");
                            e.setName(sc.next());
                        }
                    }
                    break;
                case 5:


                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
