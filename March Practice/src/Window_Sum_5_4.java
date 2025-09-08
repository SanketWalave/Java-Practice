
import java.util.*;

class Solution3s {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        int a[] = nums;
        int target = 0;//sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i <= a.length - 2; i++) {


            for (int j = 0; j < a.length; j++) {

                HashSet<Integer> al1 = new HashSet<Integer>();
                int sum = a[i] + a[i + 1] + a[j];
                if (sum == target && i != j && i + 1 != j ) {
                    al.add(Arrays.asList(a[i], a[j], a[i+1]));
//                    al1.add(a[i]);
//                    al1.add(a[i + 1]);
//                    al1.add(a[j]);
//                    if (al1.size() == 3) {
//                        al.add(al1);
//                    }

                }
            }

        }
        return al;
    }
}

public class Window_Sum_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution3s s = new Solution3s();
        int a[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(s.threeSum(a));


    }
}
