class RemoveD {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i<nums.length-1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count]=nums[i];
                count++;

            }
        }
        return count ;
    }
}

public class RemoveDupi_10_4 {
    public static void main(String[] args) {
        RemoveD r = new RemoveD();
        int a[] = {1,1,2};
        System.out.println(r.removeDuplicates(a));

    }
}
