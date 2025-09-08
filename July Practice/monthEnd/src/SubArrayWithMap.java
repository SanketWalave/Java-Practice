import java.util.*;
/*Subarray Sum Equals K?
Problem:Count the number of subarrays whose sum is equal to k.
Approach: Use a Map<Integer, Integer> to store prefix sums.
Input: nums = [1, 1, 1], k = 2
Output: 2
Explanation: The subarrays [1, 1] (starting at index 0 and index 1)both sum to*/
public class SubArrayWithMap {
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(getRes(a,3));
    }
    public static int getRes(int nums[],int k){
        Map<Integer,Integer> map=new HashMap<>();
//        Map<Integer,Integer>
        map.put(0,1);//best case
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];

//               System.out.println(sum);
               if(map.containsKey(sum-k)){
                 count+=map.get(sum-k);
               }
               int v=1;
               if(map.containsKey(sum)) v=map.get(sum)+1;
               map.put(sum,v);


        }
//        for(Map.Entry<Integer,Integer> m:map.entrySet())System.out.println(m.getKey()+"\t\t"+m.getValue());
        return count;
    }
}
