public class SumSq_Q20_21_4 {
    public static void main(String[] args) {
        System.out.println(getSqSum(3000));
    }

    public static long getSqSum(int limit) {
        long sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i * i;
            if (sum > Integer.MAX_VALUE) return 0;
        }
        return sum;
    }
}
