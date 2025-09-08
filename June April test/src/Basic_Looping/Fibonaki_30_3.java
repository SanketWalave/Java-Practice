package Basic_Looping;

import java.util.Scanner;
//3. Fibonacci Series
//Description: Write a program to print the first n Fibonacci numbers.
//Input: n = 5
//
//
//Output: 0 1 1 2 3

public class Fibonaki_30_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int limit=sc.nextInt();
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" ");
        System.out.print(fib2+" ");
        for(int i=3;i<=limit;i++)
        {
            int fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;
            System.out.print(fib+" ");
        }

    }
}
