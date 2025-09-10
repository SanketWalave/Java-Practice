import java.util.*;
/*Q 3) Rearrange Array in Alternating Positive and Negative Numbers
Question:
 Given an array of positive and negative numbers, rearrange them so that they appear in alternating positions (positive, negative, …). Extra elements go at the end.
Example:
 Input: [ 1, 2, 3, -4, -1, 4]
 Output:[-4, 1,-1, 2,  3,  4] or [1, -4, 2, -1, 3, 4]

*/
public class RearrangeArrays_3_29_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter array size");
//        int a[]=new int[sc.nextInt()];
//        System.out.println("enter elements in array");
//        for (int i = 0; i <a.length ; i++) {
//            a[i]=sc.nextInt();
//        }
//        int a[]={ 1, 2, 3, -4, -1, 4};
        int a[]={ 3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);

        reArrange(a);
        System.out.println(Arrays.toString(a));

    }
    public static void reArrange(int a[]){
//        int st=0;
//        int c=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>=0){
//               c=i+1;
//               break;
//            }
//        }
//        System.out.println("c = "+c);
//        System.out.println("st = "+st);
//        int end=c;
//        for (int i = 1; i <= c; i++) {
//            System.out.println("swap");
//            int temp=a[end];
//            a[end]=a[st];
//            a[st]=temp;
//            st=st+2;
//            end++;
//            System.out.println("arrays in sort "+Arrays.toString(a));
//        }

//        2
//        int temp;
//        int k=-1;
//        for(int i=0;i<a.length;i++){
//            if(a[i]<0){
//                k++;
//                temp=a[i];
//                a[i]=a[k];
//                a[k]=temp;
//            }
//        }
//        int st=0;
//        int end=k+1;
//        while (st<a.length && end<a.length && a[st]<0){
//            temp=a[st];
//            a[st]=a[end];
//            a[end]=temp;
//            st+=2;
//            end++;
//        }

        int left=0;
        int right=1;
        int ans[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0){
                ans[left]=a[i];
                left+=2;
            }else{
                ans[right]=a[i];
                right+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
        a=ans;
    }
}

/*class Solution {
    public int[] rearrangeArray(int[] nums) {
       int pos=0; //pointer for placing positive numbers at even indices
       int  neg=1; //pointer for placing negative numbers at odd indices
       int[] ans= new int[nums.length];  //array to store changes
       for(int i=0; i<nums.length; i++){
        if(nums[i]>0){
            ans[pos]= nums[i]; //place positive number at current even index

            pos+=2;  //move pos pointer at next even index
        }
        else{
            ans[neg]= nums[i];  //place negative number at current odd index
            neg+=2;  //move neg pointer at next odd index
        }
       }
       return ans;  // return rearranged array

    }
}*/
