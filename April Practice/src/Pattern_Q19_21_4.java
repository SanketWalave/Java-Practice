import java.util.Scanner;

public class Pattern_Q19_21_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        for (int i = num; i >=1 ; i--) {
            int c=i;
            for (int j = num; j >= 1; j--) {
                if (j >=(num+1)- i)
                    System.out.print(c--);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
