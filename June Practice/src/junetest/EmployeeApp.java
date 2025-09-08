package junetest;

import java.util.*;
/*Q4. Problem Statement:
Design an Employee Management System using
 both abstract classes and interfaces that performs the
following operations:

Requirements:
1. Abstract Class: Employee
• Fields:
o int empId
o String name
o double basicSalary
• Constructor to initialize the fields.
• Abstract method:
o void calculateNetSalary()
• Non-abstract method:
o void displayEmployeeDetails()
2. Interface: Taxable
• Method:
o double calculateTax(double netSalary);

3. Subclasses:
• Manager class (extends Employee, implements Taxable)
o HRA = 20% of basic
o DA = 15% of basic
o Tax = 10% of net salary
• Clerk class (extends Employee, implements Taxable)
o HRA = 10% of basic
o DA = 5% of basic
o Tax = 5% of net salary

Operations to Perform in main()
1. Accept details for multiple employees (both Manager and Clerk).
2. Calculate and display net salary.
3. Calculate and display tax using the calculateTax() method.
4. Display all employee details.*/
interface Taxaable{
    double calculateTax();
}
abstract class Employee{
    /*1. Abstract Class: Employee
• Fields:
o int empId
o String name
o double basicSalary
• Constructor to initialize the fields.
• Abstract method:
o void calculateNetSalary()
• Non-abstract method:
o void displayEmployeeDetails()
2. Interface: Taxable
• Method:
o double calculateTax(double netSalary);*/
        protected  int id;
        protected String name;
        protected double basesalary;
        public Employee(){}
    public Employee(int id,String name,double basesalary){
            this.id=id;
            this.name=name;
            this.basesalary=basesalary;

    }
    abstract void calculateSalary();
        public void displayEmployeeDetails(){
            System.out.println( "employee    id  "+id+
                                "\nemployee name "+name+
                                "\n salary       "+basesalary);
        }

}
class Manager extends Employee implements Taxaable {

    @Override
    void calculateSalary() {
        double hra=basesalary*20/100;
        double da=basesalary*15/100;
//        double
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}
