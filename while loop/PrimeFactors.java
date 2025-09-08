import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                System.out.println(i);
                num /= i;
            } else {
                i++;
            }
        }

        if (num > 1) {
            System.out.println(num);
        }
    }
}
