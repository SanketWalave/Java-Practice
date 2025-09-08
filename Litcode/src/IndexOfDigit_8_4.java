class Digit
{
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target)
        {
            return nums.length;
        }
        if(nums[nums.length-1]==target)
        {
            return nums.length-1;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==target)
            {
                return i;

            }
           else if(i+1==nums.length-1 && nums[i+1]>target)
                return i+1;
            else if(i>0 && nums[i-1]<target && nums[i+1]>target)
            {

                return i;
            }
        }
        return 0;
    }
}
public class IndexOfDigit_8_4 {
    public static void main(String[] args) {
        Digit d=new Digit();
        int a[]={1,3};
        System.out.println(d.searchInsert(a,2));
    }
}
