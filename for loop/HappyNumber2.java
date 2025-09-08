public class HappyNumber2 {
    public static void main(String[] args) {
        int number = 19; // Change this number to test other values
        int originalNumber = number;
        int count = 0;

        for (; count < 100; count++) { // Limit iterations to avoid infinite loops
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }

            number = sum;

            if (number == 1) {
                System.out.println(originalNumber + " is a happy number.");
				break;
            }
        }

        System.out.println(originalNumber + " is not a happy number.");
    }
}