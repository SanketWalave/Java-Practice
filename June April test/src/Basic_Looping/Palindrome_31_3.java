package Basic_Looping;

import java.util.Scanner;

public class Palindrome_31_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        for(;num>0;num/=10)
        {
            int rem=num%10;
            rev=rev*10+rem;

        }
        if(rev==temp)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
