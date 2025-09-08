import java.util.Scanner;

public class Move_0_toEnd_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enetr element in array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("displaying array element");
        for(int n:a)
            System.out.print(n+"\t");
        int end=a.length-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                a[end]=0;
            }
        }
        System.out.println("\ndisplaying afte operation");
        for(int n:a)
            System.out.print(n+"\t");
    }
}
