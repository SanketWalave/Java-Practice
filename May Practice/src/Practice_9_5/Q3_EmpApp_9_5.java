package Practice_9_5;
/*  Q3. WAP to create Employee class with field id,name and sal and
 store 5 employee object in ArrayList and display it*/
import java.util.*;
class Q3_emp{
    private int id;
    private String name;
    private int salary;
    public Q3_emp(){}
    public Q3_emp(int id,String name,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary ;
    }
}
public class Q3_EmpApp_9_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q3_emp e1=new Q3_emp(1,"sanket",999999);
        Q3_emp e5=new Q3_emp(5,"set",920999);
        Q3_emp e2=new Q3_emp(2,"san",9199);
        Q3_emp e3=new Q3_emp(3,"moon",92399);
        Q3_emp e4=new Q3_emp(4,"heven",93499);
        ArrayList<Q3_emp> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        for(Q3_emp e:al){
            System.out.println(e.toString());
        }
    }
}
