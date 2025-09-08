public class SubArray_21 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};

        for(int i=0;i<a.length-2;i++)
        {
            System.out.println(a[i]+"\t"+a[i+1]+"\t"+a[i+2]);
        }
    }
}
