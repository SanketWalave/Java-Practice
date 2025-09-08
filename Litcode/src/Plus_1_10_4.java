class Solution_66 {
    public int[] plusOne(int[] digits) {
        int rev = 0;
        for (int n : digits) {
            rev = rev * 10 + n;
            if (rev + n > Integer.MAX_VALUE / 10) {
                rev = Integer.MAX_VALUE;
                break;
            }
        }

        rev += 1;
        int rev2 = 0;
        int temp = rev;
        int count = 0;
        while (rev != 0) {
            count++;
            int rem = rev % 10;
            rev2 = rev2 * 10 + rem;
            rev /= 10;
        }
        digits = new int[count];
        for (int i = 0; i < digits.length; i++) {
            int rem = rev2 % 10;
            digits[i] = rem;
            rev2/=10;
        }

        return digits;
    }
}
    public class Plus_1_10_4 {
        public static void main(String[] args) {
            int a[] = {9};
            Solution_66 s = new Solution_66();
            int b[] = s.plusOne(a);
        }
    }

