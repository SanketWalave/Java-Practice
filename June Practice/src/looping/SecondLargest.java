package looping;

import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int a[]=new int[sc.nextInt()];
        System.out.println("enter array element");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        System.out.println(Arrays.toString(a));
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>fmax){
                smax=fmax;
                fmax=a[i];
            }
            else if(a[i]<fmax && a[i]>smax){
                smax=a[i];
            }else {

            }
        }
        System.out.println(smax);
    }
}
