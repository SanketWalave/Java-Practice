import java.util.Scanner;

public class StorePerfect_15_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        while (i<a.length)
        {
            int num=sc.nextInt();
            int sum=0;
            for(int j=1;j<num;j++)
            {
                if(num%j==0)
                    sum+=j;
            }
            if(sum==num)
            {
                a[i]=num;
                i++;
            }
            else System.out.println("not perfect number");

        }
        for(int n:a)
            System.out.println(n);
    }
}
