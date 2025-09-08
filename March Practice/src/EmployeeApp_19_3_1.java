import java.util.*;
class Employee
{
    // POJO class with field id,name,presentDay,perDaySalary and totalSalary
    private int id;
    private String name;
    private int presentDay;
    private int parDaySalary;
    //    private int totalSalary;
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPresentDay(int presentDay)
    {
        this.presentDay=presentDay;
    }
    public void setParDaySalary(int parDaySalary)
    {
        this.parDaySalary=parDaySalary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPresentDay() {
        return presentDay;
    }

    public int getParDaySalary() {
        return parDaySalary;
    }
    public int getTotalSalary()
    {
        return  presentDay*parDaySalary;
    }
}
abstract  class EmployeeFinder
{
    protected Employee e[];
    abstract  Employee searchByName(String name);
    abstract  Employee [] getAllEmployes();
    abstract  Employee [] getEmpAtendWise();

    public void setEmployee(Employee ...e)
    {
        this.e=e;
    }
}
 class EmployeFinderAdapter extends EmployeeFinder
{

//    public abstract  Employee searchByName(String name);
//   public  abstract  Employee [] getAllEmployes();
//   public  abstract  Employee [] getEmpAtendWise();
    protected Employee e[];
    public   Employee searchByName(String name)
    {
        return null;
    }
    public   Employee [] getAllEmployes()
    {
        return null;
    }
    public    Employee [] getEmpAtendWise()
    {
        return null;
    }



    public void setEmployee(Employee ...e)
    {
        this.e=e;
    }

}

class SearchEmployee extends EmployeFinderAdapter
{
    public Employee searchByName(String name)
    {
        boolean flag=true;
        for(int i=0;i<e.length;i++)
        {
            if(e[i].getName().equals(name))
            {
                System.out.println("employee found");
                return  e[i];

            }
        }
        System.out.println("employee not found");
        return null;
    }
//    public Employee[] getAllEmployes() {
//        return null;
//    }
//
//
//    public Employee[] getEmpAtendWise() {
//        return null;
//    }
}
class viewAllEmployee extends EmployeFinderAdapter
{
    public Employee[] getAllEmployes()
    {
        for(int i=0;i<e.length;i++)
        {
            System.out.println("===============================================");
            System.out.println("employee id             \t"+e[i].getId());
            System.out.println("employee name           \t"+e[i].getName());
            System.out.println("employee daypresent     \t"+e[i].getPresentDay());
            System.out.println("employee per day salary \t"+e[i].getParDaySalary());
            System.out.println("employee total salary   \t"+e[i].getTotalSalary());
        }
        return e;
    }
//    public Employee searchByName(String name) {
//        return null; // Implementation needed
//    }
//
//    @Override
//    public Employee[] getEmpAtendWise() {
//        return null; // Implementation needed
//    }

}
class GetAttendenceWiseEmp extends EmployeFinderAdapter
{
    @Override
    public Employee[] getEmpAtendWise() {
        for(int i=0;i<e.length;i++)
        {
            for(int j=i+1;j<e.length;j++)
            {
                if(e[i].getPresentDay()<e[j].getPresentDay())
                {
                    Employee temp=e[i];
                    e[i]=e[j];
                    e[j]=temp;
                }
            }
        }
        for(int i=0;i<e.length;i++)
        {
            System.out.println("===============================================");
            System.out.println("employee id             \t"+e[i].getId());
            System.out.println("employee name           \t"+e[i].getName());
            System.out.println("employee daypresent     \t"+e[i].getPresentDay());
            System.out.println("employee per day salary \t"+e[i].getParDaySalary());
            System.out.println("employee total salary   \t"+e[i].getTotalSalary());
        }
        return e;
    }

//    public Employee searchByName(String name) {
//        return null; // Implementation needed
//    }
//
//    @Override
//    public Employee[] getAllEmployes() {
//        return null; // Implementation needed
//    }
}
class EmployeeHelper
{
    void employeeFinder(EmployeeFinder ef,String name)
    {
        ef.searchByName(name);
    }
    void displayEmployee(EmployeeFinder ef)
    {
        ef.getAllEmployes();
    }
    void attendencefinder(EmployeeFinder ef)
    {
        ef.getEmpAtendWise();
    }
}
public class EmployeeApp_19_3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e[]=new Employee[3];
        for(int i=0;i<e.length;i++)
        {
            e[i]=new Employee();
            System.out.println("enter id");
            e[i].setId(sc.nextInt());
            System.out.println("enter name");
            e[i].setName(sc.next());
            System.out.println("enter present day ");
            e[i].setPresentDay(sc.nextInt());
            System.out.println("enter per day salary");
            e[i].setParDaySalary(sc.nextInt());
        }

        SearchEmployee searche=new SearchEmployee();
        searche.setEmployee(e);

        viewAllEmployee viewe=new viewAllEmployee();
        viewe.setEmployee(e);

        GetAttendenceWiseEmp getate=new GetAttendenceWiseEmp();
        getate.setEmployee(e);

        EmployeeHelper eh = new EmployeeHelper();
        do {
            System.out.println("Which operation you want to perform");
            System.out.println("1:search employee by name");
            System.out.println("2:view all employes");
            System.out.println("3:view employees by salary");
            System.out.println("4:leave application");
            System.out.println("enter your choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:

                System.out.println("=================================");
                System.out.println("enter employee to find");
                String name = sc.next();
                eh.employeeFinder(searche, name);
                System.out.println("=================================");
                break;
                case 2:
                eh.displayEmployee(viewe);
                break;
                case 3:
                eh.attendencefinder(getate);
                break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
                    break;

            }
        }while (true);

    }
}
