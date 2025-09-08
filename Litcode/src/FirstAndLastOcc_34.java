import java.util.Arrays;

public class FirstAndLastOcc_34 {
    public static void main(String[] args) {
        int a[]={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(a,6)));
    }
    public static int[] searchRange(int[] nums, int target){
        int first=-1,last=-1,left=0,right=nums.length-1;
        while (left<=right){
            int mid1=(right+left)/2;
            if(nums[mid1]==target){
                first=mid1;
                right=mid1-1;
            }else if(nums[mid1]<target){
                left=mid1+1;
            }else right=mid1-1;
        }

        left=0;
        right=nums.length-1;
        while (left<=right){
            int mid2=(right+left)/2;
            if(nums[mid2]==target){
                last=mid2;
                left=mid2+1;
            }else if(nums[mid2]>target){
                right=mid2-1;
            }else left=mid2+1;
        }
        return new int[] {first, last};
    }
}
