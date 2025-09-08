import java.util.Scanner;

public class Q8_Missing_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter element in array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();

        System.out.println("displaying array element before sort");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\n displaying element after sort");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        System.out.println();
        System.out.println("missing elements");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=a[i]+1;j<a[i+1];j++)
                {
                    System.out.print(j+"\t");
                }
        }
    }
}
