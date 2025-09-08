import java.util.*;

//



public class Three_Sum_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));


    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        int a[] = nums;

        int target = 0;//sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for(int i=0;i<a.length;i++) {

            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i <= a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = a.length - 1;
            System.out.println(j);
            System.out.println(k);
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                System.out.println("\ta["+i+"]  "+a[i] +"\ta["+j+"]  "+ a[j] +"\ta["+k+"]  "+ a[k]);
                System.out.println(sum);
                if (sum < 0) {
                    System.out.println("j is ++ and value of j  "+j);
                    j++;
                } else if (sum > 0) {
                    System.out.println("k is -- and value shift to "+k);
                    k--;
                } else {
                    al.add(Arrays.asList(a[i], a[j], a[k]));
                    System.out.println("j if sum is 0 "+j);
                    j++;
                    while (a[j]==a[j-1] && j<k)
                    {
                        System.out.println("asdfghjkl;");
                        j++;
                    }
                }
            }


        }


        return al;
    }
}
