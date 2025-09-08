
import java.util.*;
 class Employee  {
    private int id;
    private String name;
    private int sal;

    public Employee() {
    }

    public Employee(String name,int id,int sal) {
        this.name=name;
        this.id=id;
        this.sal=sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

//		@Override
//		public int compareTo(Object o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
}
public class EmployeeApp_4_4 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        Employee e1=new Employee("AAAA",4,20000);
        Employee e2=new Employee("BBBB",3,3000);
        Employee e3=new Employee("DDDD",1,10000);
        Employee e4=new Employee("XXXX",5,5000);
        Employee e5=new Employee("RRRR",2,210000);

        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

//		System.out.println("Display before Sorting");
//		for(Object obj : al) {
//			Employee e=(Employee)obj;
//
//			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
//		}
//		Collections.sort(al);
//		System.out.println("Display after Sorting");
//		for(Object obj:al) {
//			Employee e=(Employee)obj;
//
//			System.out.println(e.getId()+"\t"+ e.getName()+"\t"+ e.getSal());
//		}
    }

}