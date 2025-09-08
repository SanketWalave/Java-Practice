package Basic_Looping;

import java.util.Scanner;
//2. Factorial of a Number
//Description: Write a program to compute the factorial of a given number n.
//Input: n = 4
//
//
//Output: 24

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++)
            factorial*=i;
        System.out.println(factorial);
    }
}
