class Emp_7_5 implements Cloneable{
    private int id;
    private int salary;
    private String name;
    public Emp_7_5(){}
    public Emp_7_5(int id,String name,int salary){
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "id      \t"+id+"\nname    \t"+name+ "\nsalary  \t" + salary;
    }
}
public class EmployeeApp_7_5_clone {
    public static void main(String[] args) throws Exception{
        Emp_7_5 e1=new Emp_7_5(1,"sanket",100000);
        Emp_7_5 e2=e1;//(Emp_7_5) e1.clone();
        e2.setId(2);
        e2.setName("saurabh");
        e2.setSalary(123456);
        System.out.println(e1.toString());
    }
}
