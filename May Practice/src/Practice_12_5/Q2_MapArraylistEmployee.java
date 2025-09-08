package Practice_12_5;

import java.util.*;
class Employee_12_5{
    private int id;
    private String name;
    private int salary;
    public Employee_12_5(){}
    public Employee_12_5(int id,String name,int salary){
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
public class Q2_MapArraylistEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList> map=new HashMap<>();
        ArrayList<Employee_12_5> al=new ArrayList<>();
        al.add(new Employee_12_5(1,"Sanket",9999));
        al.add(new Employee_12_5(2,"Sket",999));
        al.add(new Employee_12_5(3,"Sket33",999));
        al.add(new Employee_12_5(4,"Ssdfg",999));
        map.put("Fe",al);
        ArrayList<Employee_12_5> al2=new ArrayList<>();
        al2.add(new Employee_12_5(1,"Sanket",9999));
        al2.add(new Employee_12_5(2,"Sket",999));
        al2.add(new Employee_12_5(3,"Sket33",999));
        al2.add(new Employee_12_5(4,"Ssdfg",999));
        map.put("Se",al2);

        for(Map.Entry<String,ArrayList> en:map.entrySet()){
            System.out.println("================"+en.getKey()+"===================");
            ArrayList<Employee_12_5> al3=(ArrayList<Employee_12_5>) en.getValue();
            for(Employee_12_5 e:al3){
                System.out.println(e.toString()+"\n=========================================\n");
            }
        }
    }
}
