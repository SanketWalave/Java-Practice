package looping;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int a[]=new int[sc.nextInt()];
        System.out.println("enter array element");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println("enter rotation");
        int k=sc.nextInt();
//        for (int i=1;i<=k;i++){
//            int temp=a[a.length-1];
//            for(int j=a.length-1;j>0;j--){
//                a[j]=a[j-1];
//            }
//            a[0]=temp;
//        }
        for(int i=1;i<=k;i++){
            int temp=a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
