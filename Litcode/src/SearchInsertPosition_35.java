public class SearchInsertPosition_35 {
    public static void main() {
        int a[]={1,2,3,5,6,7,8,9};
        System.out.println(searchInsert(a,4));

    }
    public static int searchInsert(int[] nums, int target) {
        if(nums.length==0)return 0;
        int end=nums.length-1;
        int start=0;
        int count=0;
        while (start<=end){
        int mid=(start+end)/2;
        count++;
            if(target==nums[mid]){
                System.out.println("count "+ count);
                return mid;
            } else if(target<nums[mid]){
                end=mid-1;

            }else if(target>nums[mid]){
                start=mid+1;

            }
            System.out.println("mid "+nums[mid]);
        }

        return start;
    }
}
