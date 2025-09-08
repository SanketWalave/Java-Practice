//import java.lang.reflect.Array;
import java.util.*;

public class ClosestSum_16 {
    public static void main(String[] args) {
        int a[]={4,0,5,-5,3,3,0,-4,-5};
        System.out.println("    "+threeSumClosest(a,-2));
    }
    public static int threeSumClosest(int[] nums, int target) {
        if(nums.length<3)return 0;
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
             int left=i+1,right=nums.length-1;
             while (left<right){
                 int sum=nums[i]+nums[left]+nums[right];
                 if (Math.abs(target - sum) < Math.abs(target - result)) {
                         result = sum;
                 }

                 if(sum==target)return target;
                 else if(sum<target)left++;
                 else right--;
             }
        }

        return result;
    }
}
//             int sum=nums[i]+nums[i+1]+nums[i+2];
//            System.out.println(nums[i]+" + "+nums[i+1]+" + "+nums[i+2]);
////            System.out.println(sum);
//            System.out.println("Math.abs(target - sum)  "+Math.abs(target - sum));
//            System.out.println("Math.abs(target - result) "+Math.abs(target - result));
//            if (Math.abs(target - sum) < Math.abs(target - result)) {
//                result = sum;
//            }
//            System.out.println(result);
//            if(sum==target) return target;
