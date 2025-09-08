import java.util.Scanner;

public class Q9_dupli_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enetr element in array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("displaying arry");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nduplicate elemeent");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
