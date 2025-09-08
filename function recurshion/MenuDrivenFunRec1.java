import java.util.Scanner;

public class MenuDrivenFunRec1
 {
    private int i; // Counter for the recursion
    private int count; // Count of factors

    public boolean prime(int num)
	{
        // Reset count and index for each call
        count = 0;
        i = 1;

        return checkPrime(num);
    }

    private boolean checkPrime(int num)
	{
        if (i <= num)
			{
            if (num % i == 0)
				{
                   count++;
                }
            i++;
            return checkPrime(num); // Recursive call
        }
        return count == 2; // A prime number has exactly two distinct positive divisors: 1 and itself
    }

    public static void main(String[] args)
	{
        MenuDrivenFunRec1 checker = new MenuDrivenFunRec1(); // Create an instance to access instance variables
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Prime number");
            System.out.println("2. Perfect number");
            System.out.println("3. Duck number");
            System.out.println("4. Strong number");
            System.out.println("5. Armstrong number");

            int choice = sc.nextInt(); // Read choice
            switch (choice) {
                case 1: {
                    System.out.println("Enter number:");
                    int no = sc.nextInt();
                    boolean res = checker.prime(no); // Use the instance to call the method
                    System.out.println(no + (res ? " is a prime number." : " is not a prime number."));
                }
                break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Do you want to continue (y/Y)?");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        sc.close(); // Close the scanner
    }
}
