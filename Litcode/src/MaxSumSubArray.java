/*Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Follow up: If you have figured out the O(n) solution, try coding another
solution using the divide and conquer approach, which is more subtl*/
public class MaxSumSubArray {
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};

        int sum2 = Integer.MIN_VALUE;

        int sum = 0;
        for(int start = 0; start < a.length; start++) {

            sum+=a[start];
//            System.out.println(sum);
            if (sum>sum2)
                sum2=sum;
            if(sum<0)
                sum=0;
        }
        System.out.println(sum2);
    }
}

//        int msum=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//
//        }
//        for(int i=0;i<a.length;i++){
//            int sum=0;
//            for(int j=i;j<a.length;j++){
//                sum+=a[j];
//                if(sum>msum)msum=sum;
//            }
//

