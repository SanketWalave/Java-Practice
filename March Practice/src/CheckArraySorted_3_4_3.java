import java.util.*;
public class CheckArraySorted_3_4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter array elements");
        int k=0;
        while(k<a.length)
        {
            a[k]=sc.nextInt();
            k++;
        }
        System.out.println("display array element");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        boolean flag1=true;
        boolean flag2=true;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<=a[i+1])
            {
                continue;
            }
            else {
                flag1=false;
                break;
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>=a[i+1])
            {
                continue;
            }
            else {
                flag2=false;
                break;
            }
        }
        System.out.println();
        if(flag1||flag2)
        {
            System.out.println("array is sorted");
        }
        else
            System.out.println("not sorted");
    }
}
