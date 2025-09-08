package Basic_Looping;

import java.util.Scanner;

public class Armstrong_31_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        for(;num>0;num/=10)
            count++;
        num=temp;
        int sum=0;
        for(;num>0;num/=10)
        {
            int rem=num%10;
            int power=1;
            for(int i=1;i<=count;i++)
                power*=rem;
            sum+=power;
        }
        if(temp==sum)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}
