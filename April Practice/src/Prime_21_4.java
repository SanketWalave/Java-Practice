public class Prime_21_4 {
    public static void main(String[] args) {
        isPrime(24);
    }
    public static void isPrime(int num) {
        for (int i = 1; i <= num; i++) {
            int num2=i;
            boolean flag=true;
            for (int j = 2; j < num2; j++) {
                if (num2 % j == 0) {
                    flag = false;
                    break;
                }

            }
            if(flag)
                System.out.println(i);

        }
    }
}
