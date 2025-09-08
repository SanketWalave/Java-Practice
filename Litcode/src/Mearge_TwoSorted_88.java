public class Mearge_TwoSorted_88 {
    public static void main(String[] args) {

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int a[]=nums1;
        nums1=new int[m+n];
        while (i<a.length && j<nums2.length){
            if(a[i]<nums2[j]){
                nums1[k]=a[i];
                k++;
                i++;
            }
            else{
                nums1[k]=nums2[j];
                k++;
                j++;
            }
        }
        while (i<a.length){
            nums1[k]=a[i];
            k++;
            i++;
        }
        while (j<nums2.length){
            nums1[k]=a[j];
            k++;
            j++;
        }
        for(int l:nums1) System.out.println(l);

    }
}
