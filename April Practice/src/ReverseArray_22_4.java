public class ReverseArray_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int end=a.length-1,mid=a.length/2;
        for(int i=0;i<mid;i++)
        {
            int temp=a[i];a[i]=a[end];a[end]=temp;
            end--;
        }
        for(int n:a) System.out.print(n+"\t");
    }
}
