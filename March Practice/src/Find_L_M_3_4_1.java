import java.util.*;
public class Find_L_M_3_4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("displaying array element");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("max  "+max);
        System.out.println("min  "+min);
    }
}
