public class RotateArray_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=2;
        for(int n:a) System.out.print(n+"\t");
        for(int i=1;i<=k;i++)
        {
            int temp=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        System.out.println();
        for(int n:a) System.out.print(n+"\t");
    }
}
