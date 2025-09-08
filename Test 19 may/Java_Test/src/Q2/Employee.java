package Q2;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(){}
    public Employee(int id,String name,double salary){
        this.id=id;this.name=name;this.salary=salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public double CalculateBonus(){
        if(salary>=100000)return (salary*15)/100;
        else if(salary>=50000 && salary<100000)return (salary*10)/100;
        else return (salary*5)/100;
    }
    public void displayEmployee(){
        System.out.println("Employee id                 = "+id);
        System.out.println("Employee name               = "+name);
        System.out.println("Employee salary             = "+salary);
        System.out.println("Employee bonus              = "+CalculateBonus());
        System.out.println("Employee salary after bonus = "+(CalculateBonus()+salary));
    }
}
