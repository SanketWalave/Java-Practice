package Q6;

public class Employee implements Txable{

    int pid;
    String name;
    double salary;
    public Employee(){}
    public Employee(int pid,String name,double salary){
        this.pid=pid;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", salary=" + salary ;
    }

    @Override
    public double calculateTax() {
        return (salary*10)/100;
    }
}
