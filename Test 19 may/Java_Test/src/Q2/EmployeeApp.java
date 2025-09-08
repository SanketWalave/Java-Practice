package Q2;

import java.util.*;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee array size");
        Employee e[]=new Employee[sc.nextInt()];
        for(int i=0;i<e.length;i++){
            System.out.println("enter id");
            int id=sc.nextInt();
            System.out.println("enter name");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("enter salary");
            double salary= sc.nextDouble();
            e[i]=new Employee(id,name,salary);

        }
        System.out.println("\n===================\n");
        for(int i=0;i<e.length;i++)e[i].displayEmployee();
    }
}
