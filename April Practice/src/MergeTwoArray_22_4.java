public class MergeTwoArray_22_4 {
    public static void main(String[] args) {
      int a[]={1,2,3,4,5};
      int b[]={6,7,8,9,0};
      int m[]=getMerge(a,b);
      for(int n:m) System.out.print(n+"\t");
    }
    public static int [] getMerge(int a[],int b[])
    {
        int k=0;
        int m[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            m[k]=a[i];k++;
        }
        for(int i=0;i<b.length;i++)
        {
            m[k]=b[i];k++;
        }
        return m;
    }
}
