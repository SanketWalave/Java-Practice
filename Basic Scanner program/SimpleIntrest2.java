import java.util.*;

public class SimpleIntrest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float principalAmount, time, rate, interest, finalAmount;

        System.out.println("Enter principle amount:");
        principalAmount = scanner.nextFloat();

        System.out.println("Enter time in years:");
        time = scanner.nextFloat();

        System.out.println("Enter rate of interest:");
        rate = scanner.nextFloat();

        interest = principalAmount * (1+rate/100)/time;
        finalAmount = principalAmount + interest;

        System.out.println("Final amount is -->" + finalAmount);
    }
}