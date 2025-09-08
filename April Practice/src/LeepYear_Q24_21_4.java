import java.util.Scanner;

public class LeepYear_Q24_21_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
            System.out.println("Year is leap year");
        else
            System.out.println("Year is not leap year");
    }
}
