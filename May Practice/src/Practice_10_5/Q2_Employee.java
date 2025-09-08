package Practice_10_5;
/*Q2. Write a program to Create ArrayList and Store 5 employee objects in it
and perform following operation
	Case 1: sort employee by using id
	Case 2: sort employee by using salary
	Case 3: sort employee  by using name
*/
import java.util.*;
class Employee_10_5{
    private int id;
    private String name;
    private int salary;
    public Employee_10_5(){}
    public Employee_10_5(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public String toString(){
        return "id     \t"+id+"\n"+
                "name  \t"+name+"\n"+
                "salary\t"+salary;
    }
}
class SortEmployeeById implements Comparator<Employee_10_5>{
    @Override
    public int compare(Employee_10_5 o1, Employee_10_5 o2) {
        return o2.getSalary()-o1.getSalary();
    }

}

public class Q2_Employee {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee_10_5> al=new ArrayList<>();
        al.add(new Employee_10_5(1,"sanket",123456789));
        al.add(new Employee_10_5(4,"anket",1230089));
        al.add(new Employee_10_5(3,"zanket",56789));
        al.add(new Employee_10_5(5,"tanket",12345));
        al.add(new Employee_10_5(2,"yanket",1689));
        for(Employee_10_5 e:al){
            System.out.println(e.toString()+"\n==============================\n");
        }
        Collections.sort(al,new SortEmployeeById());
        System.out.println("aftre sort");
        for(Employee_10_5 e:al){
            System.out.println(e.toString()+"\n==============================\n");
        }
    }
}
