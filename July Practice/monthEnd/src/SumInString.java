import java.util.*;

public class SumInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string \n");
        System.out.println(getSum(sc.nextLine()));
    }
    public static int getSum(String str){
        str+=" ";
        int sum=0;
        int rev=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9' && !(str.length()-1==i)){
                int n=(int)(str.charAt(i)-48);
                rev=rev*10+n;

            }else {
//                System.out.println(rev);
                sum=sum+rev;
                rev=0;
            }
        }
//        System.out.println(sum);
        return sum;
    }
}
