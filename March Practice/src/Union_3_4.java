import java.util.Scanner;

public class Union_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first  array size");
        int size=sc.nextInt();
        System.out.println("enter second array size");
        int size2=sc.nextInt();
        int b[]=new int[size2];
        int a[]=new int[size];
        System.out.println("Enter element in first array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter element in second array");
        for(int i=0;i<b.length;i++)
            b[i]=sc.nextInt();
        System.out.println("displaying first array element");
        for(int n:a)
            System.out.print(n+"\t");
        System.out.println("\ndisplaying second array element");
        for(int n:b)
            System.out.print(n+"\t");

        System.out.println("\nintersectons");
        for(int n:b)
            System.out.print(n+"\t");
        for(int i=0;i<a.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.print(a[i]+"\t");
        }
    }
}
