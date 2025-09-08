import java.util.*;
public class ReverseArray_3_4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter element in array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("displaying array element");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        int end=a.length-1;
        int mid=a.length/2;
        for(int i=0;i<mid;i++)
        {
            int temp=a[end];
            a[end]=a[i];
            a[i]=temp;
            end--;
        }
        System.out.println("\ndisplaying array element after reverse");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
}
