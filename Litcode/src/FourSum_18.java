import java.util.*;
public class FourSum_18 {
    public static void main(String[] args) {
        int a[]={1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(a,-294967296));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> al=new ArrayList<>();
        if(nums.length==0) {
            return al;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j-1]==nums[j])continue;
                int left=j+1;
                int right=nums.length-1;

                while (left<right) {
                    long sum = nums[i] + nums[j] ;
                    sum+=nums[left] + nums[right];
                    if (sum == target) {
                        al.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left<right && nums[left-1]==nums[left])left++;
                        while (left<right && nums[right]==nums[right+1])right--;
                    } else if (sum < target) left++;
                    else right--;

                }
            }
        }
        System.out.println(al);
        return al;
    }
}
