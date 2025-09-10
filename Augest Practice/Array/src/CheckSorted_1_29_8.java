import java.util.*;

public class CheckSorted_1_29_8 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter array size");
        int a[]=new int[sc.nextInt()];
        System.out.println("enter elements in array");
        for (int i = 0; i <a.length ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(isSorted(a));

    }
    public  static  boolean isSorted(int a[]){
        boolean flag1=true,flag2=true;
//        int num=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>=num){
//                num=a[i];
//            }else{
//                flag1=false;
//            }
//        }
//        int num2=Integer.MAX_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i]<=num2){
//                num=a[i];
//            }else{
//               flag2=false;
//            }
//        }
        for (int i = 1; i <a.length ; i++) {
            if(a[i]<a[i-1])flag1=false;
            if(a[i]>a[i-1])flag2=false;

            if(!flag1 || !flag2)return false;

        }
        return true;
    }
}
