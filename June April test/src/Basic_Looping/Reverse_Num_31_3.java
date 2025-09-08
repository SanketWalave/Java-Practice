package Basic_Looping;

import java.util.Scanner;

public class Reverse_Num_31_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int rev=0;
        for(;num>0;num/=10)
        {
            int rem=num%10;
            rev=rev*10+rem;
        }
        System.out.println("Reverse num \t"+rev);
    }
}
