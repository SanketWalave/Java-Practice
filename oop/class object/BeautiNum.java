import java.util.*;
class Solution {
    public int beautifulNumbers(int l, int r) {
        int count = 0;
        if (l >= 1 && r > l) {
            for (int i = l; i <= r; i++) {
                int temp = i, power = 1, sum = 0;
                for (; temp > 0; temp /= 10) {
                    int rem = temp % 10;
                    sum += rem;
                    power *= rem;
                }
                if (power % sum == 0) {
                    count++;
                }
            }
        } else {
            return 0;
        }
        return count;
    }

}

public class BeautiNum {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter l");
        int l=sc.nextInt();
        System.out.println("enter r");
        int r=sc.nextInt();

        Solution s=new Solution();
//int sol= s.beautifulNumbers(l,r);
        System.out.println("beautiful numbers in range are "+s.beautifulNumbers(l,r));
    }
}