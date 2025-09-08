import java.util.Scanner;

public class Mejority_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enetr element in array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("displaying array element");
        for(int n:a)
            System.out.print(n+"\t");
        int majority=a.length/2;
        System.out.println();
        boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count>=majority)
            {
                flag=false;
                System.out.println("majority element \t"+a[i]);
            }
        }
        if(flag)
            System.out.println("there is no majority element");

    }
}
