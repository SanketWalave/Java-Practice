import java.util.Scanner;

public class Sum_21_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        long sum=getsum(num);
        System.out.println(sum);
        System.out.println(getsum(123456783));
        System.out.println(Integer.MAX_VALUE);
    }
    public static long getsum(int limit)
    {
        long sum=0;
        for(int i=1;i<=limit;i++) {
            sum += i;
            if(sum>=Integer.MAX_VALUE)return Integer.MAX_VALUE;
        }

        return sum;
    }
}
