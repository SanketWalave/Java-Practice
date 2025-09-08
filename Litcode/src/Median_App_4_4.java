class Solutionm {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            merge[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < nums2.length; i++) {
            merge[k] = nums2[i];
            k++;
        }
        for (int i = 0; i < merge.length; i++)
        {
            for(int j=i+1;j<merge.length;j++)
            {
                if(merge[i]<merge[j])
                {
                    int temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }
        int len= merge.length-1;
        if(len%2==1)
        {
            int left=len/2;
            double sum=merge[left]+merge[left+1];
            return sum/2;
        }
        else
        {
            int mid=len/2;
            return merge[mid];
        }

       // return 0.0;
    }
}
public class Median_App_4_4 {
    public static void main(String[] args) {
        int[] a ={1,2};
        int[] b ={3,4};
        Solutionm s=new Solutionm();
        System.out.println(s.findMedianSortedArrays(a,b));
    }

}
