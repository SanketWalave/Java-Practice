package Basic_Looping;

import java.util.Scanner;

public class Sum_Digit_31_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int sum=0;
        for(;num>0;num/=10)
        {
            int rem=num%10;
            sum+=rem;
        }
        System.out.println(sum);
    }

}
