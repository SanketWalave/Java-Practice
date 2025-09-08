import java.util.Scanner;

public class Reverse_p_Q21_21_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--)
            System.out.print(i+"\t");
    }
}
