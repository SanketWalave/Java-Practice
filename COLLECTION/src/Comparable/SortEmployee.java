package Comparable;

//import Comparator.SoortById;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable{
    private int id;
    private String name;
    private int salary;
    public Employee(){}
    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
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

    @Override
    public int compareTo(Object o) {
        Employee e=(Employee) o;
        if(this.id>e.id)return 1;
        else if (this.id<e.id)return -1;
        else return 0;
    }
}
public class SortEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<>();
        al.add(new Employee(5,"sanket",99999));
        al.add(new Employee(4,"san",234));
        al.add(new Employee(1,"sanket",234));
        al.add(new Employee(2,"sket",345));
        al.add(new Employee(3,"sant",786));

        System.out.println("employees before sorting");
        for(Employee e:al) System.out.println(e.toString());

        System.out.println("after sorting\n\n====================\n");
        Collections.sort(al);
        for(Employee e:al) System.out.println(e.toString());
    }
}
