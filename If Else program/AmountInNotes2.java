import java.util.*;

public class AmountInNotes2 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = sc.nextInt();

        if (amount >= 500) {
            int am1 = amount / 500;
            amount %= 500;
            System.out.println("Number of five hundred notes is " + am1);
        }

        if (amount >= 200) {
            int am3 = amount / 200;
            amount %= 200;
            System.out.println("Number of two hundred notes is " + am3);
        }

        if (amount >= 100) {
            int am5 = amount / 100;
            amount %= 100;
            System.out.println("Number of one hundred notes is " + am5);
        }

        if (amount >= 50) {
            int am7 = amount / 50;
            amount %= 50;
            System.out.println("Number of fifty rupee notes is " + am7);
        }

        if (amount >= 20) {
            int am9 = amount / 20;
            amount %= 20;
            System.out.println("Number of twenty rupee notes is " + am9);
        }

        if (amount >= 10) {
            int am11 = amount / 10;
            amount %= 10;
            System.out.println("Number of ten rupee notes is " + am11);
        }

        if (amount >= 5) {
            int am13 = amount / 5;
            amount %= 5;
            System.out.println("Number of five rupee coin is " + am13);
        }

        if (amount >= 2) {
            int am15 = amount / 2;
            amount %= 2;
            System.out.println("Number of two rupee coin is " + am15);
        }

        if (amount >= 1) {
            int am17 = amount / 1;
            System.out.println("Number of one rupee coin is " + am17);
        }
    }
}