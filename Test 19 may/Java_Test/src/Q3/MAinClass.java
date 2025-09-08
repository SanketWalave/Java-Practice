package Q3;

import java.util.Scanner;

public class MAinClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee details");
        Employee e[]=new Employee[5];
        for(int i=0;i<e.length;i++){
//    public Employee(int id,String name,int totalWorking,int overTime,int salary){

            System.out.println("enetr id");
            int id=sc.nextInt();sc.nextLine();
            System.out.println("enter name");
            String name=sc.nextLine();
            System.out.println("enter total working");
            int totalWorking=sc.nextInt();
            System.out.println("enter over time");
            int overTime=sc.nextInt();
            System.out.println("enter salary");
            int salary=sc.nextInt();
            e[i]=new Employee(id,name,totalWorking,overTime,salary);
        }
        OverTime ot=new OverTime();
        ot.setEmployee(e);
        ot.calculateOvertime();
    }
}
