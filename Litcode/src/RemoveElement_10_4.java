class Solution_27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        for(int n:nums)
            System.out.print(n+"\t");
        System.out.println();
        return count;
    }
}

public class RemoveElement_10_4 {
    public static void main(String[] args) {
        Solution_27 s = new Solution_27();
        int a[] = {3, 2, 2, 3};
        System.out.println(s.removeElement(a, 3));

    }
}
