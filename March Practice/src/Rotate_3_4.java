import java.util.Scanner;

public class Rotate_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter element in array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("Displaying Array eleemnt");
        for(int n:a)
            System.out.print(n+"\t");

        System.out.println("\nenter rotation");
        int k=sc.nextInt();
        for(int i=1;i<=k;i++)
        {
            int temp=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        System.out.println("\nDisplaying Array element after rotation");
        for(int n:a)
            System.out.print(n+"\t");

    }
}
