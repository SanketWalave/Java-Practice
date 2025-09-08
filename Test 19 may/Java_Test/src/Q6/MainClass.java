package Q6;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product details");
        System.out.println("enter product id");
        int pid=sc.nextInt();
        System.out.println("enter product name");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("enter price");
        double price=sc.nextDouble();

        Txable t=new Product(pid,name,price);
        System.out.println(t.toString());
        System.out.println("tax = "+t.calculateTax());

        System.out.println("enter employee id");
        int eid=sc.nextInt();
        sc.nextLine();
        System.out.println("enetre employee name");
        name=sc.nextLine();
        System.out.println("enter salary");
        double salary= sc.nextDouble();
        t=new Employee(eid,name,salary);
        System.out.println(t.toString());
        System.out.println("tax = "+t.calculateTax());
    }

}
