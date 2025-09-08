import java.util.Scanner;

public class StarTriangle_Q23_21_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++)
            {
                if(j<=(num+1)-i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
