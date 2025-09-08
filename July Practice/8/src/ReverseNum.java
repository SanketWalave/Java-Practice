import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("enter number");
        int num =sc.nextInt();
        System.out.println(getRev(num));
    }
    public static int  getRev(int a){
        int num=Math.abs(a);
        int rev=0;
        for (;num!=0;num/=10){
            int rem=num%10;
            if(rev>(Integer.MAX_VALUE-rem)/10) return 0;
            rev=rev*10+rem;
//            num/=10;
        }
        return rev;
    }
}
