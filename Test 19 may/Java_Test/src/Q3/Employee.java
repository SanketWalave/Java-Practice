package Q3;
/*1. Create class Employee with data member ID, Name, total working, salary, overtime
Set Information by using a parameterized constructor and create a display Information()
method to display all information with salary.
2. Create another class name as OverTime with method setEmployee(Employee emp[ ])
and void calculateOvertime() to calculate overtime. */
public class Employee {
    private int id;
    private String name;
    private int totalWorking;
    private int salary;
    private int overTime;
    public Employee(){}
    public Employee(int id,String name,int totalWorking,int overTime,int salary){
        this.id=id;this.name=name;
        this.salary=salary;
        this.totalWorking=totalWorking;
        this.overTime=overTime;
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

    public void setTotalWorking(int totalWorking) {
        this.totalWorking = totalWorking;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getTotalWorking() {
        return totalWorking;
    }

    //    @Override
    public void displayInfo() {
        System.out.println(
                "id           =" + id +"\n"+
                "name         =" + name + '\n' +
                "totalWorking =" + totalWorking +"\n"+
                "salary       =" + salary +"\n"+
                "overTime     =" + overTime);
    }
}
class OverTime{
    Employee e[];
    public void setEmployee(Employee ...e){
        this.e=e;
    }
    public void calculateOvertime(){
        for(int i=0;i<e.length;i++){
          e[i].displayInfo();
            System.out.println("==============================");
            if(e[i].getOverTime()<=40){
                System.out.println("over time pament = "+e[i].getOverTime()*50);
                System.out.println("salary after overtime ="+(e[i].getSalary()+e[i].getOverTime()*50));

            }else{
                System.out.println("wrong info salary is same");
            }
        }
    }
}
