import java.util.*;

public class ThreeDigitSum {
    public static void main(String[] args) {
        int a[] = {-1, 6, 1, 2, -1, 2};
        Arrays.sort(a);
        int start = 0;
        int end = a.length - 1;
        int k = 1;
        while (start < a.length - 3) {
            int sum = a[start] + a[end] + a[k];
            if (sum == 0) {
                System.out.println(a[start] + "\t" + a[end] + "\t" + a[k]);
                k++;
                end--;
            } else if (sum > 0) {
                end--;
            } else if (sum < 0) {
                k++;
            }

            if (end == k + 1) {
                start++;
                end = a.length - 1;
                k = start + 1;
            }
        }
    }
}
