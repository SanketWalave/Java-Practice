import java.util.*;
public class ArrayPairSum_23_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Arrays.sort(a);
        int target=6;
        int left=0,right=a.length-1;
        while (left<=right)
        {
            if(a[left]+a[right]>target)right--;
            else if(a[left]+a[right]<target)left++;
            else if(left!=right){
                System.out.println("[" + a[left] + "," + a[right] + "]");
                left++;
            }
        }
    }
}
