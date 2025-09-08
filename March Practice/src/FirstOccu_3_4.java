import java.util.Scanner;

public class FirstOccu_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr size of array");
        int size=sc.nextInt();
        int a[]=new int[size];

        int occ=0;
        boolean flag=true;
        System.out.println("enter element in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to find occurance");
        int num=sc.nextInt();
       for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num){
                occ=i;
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("element not found");

        System.out.println("\nFirst occurance  \t"+occ);
    }
}
