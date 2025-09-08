package Basic_Looping;

import  java.util.*;
public class Prime_Upto_31_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int limit=sc.nextInt();
        for(int i=1;i<=limit;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(i+"\t");
        }
    }
}
