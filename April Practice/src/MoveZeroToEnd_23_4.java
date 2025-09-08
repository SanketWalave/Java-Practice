public class MoveZeroToEnd_23_4 {
    public static void main(String[] args) {
        int a[]={0, 1, 2, 0, 3, 4};
        int res[]=getResult(a);
        for(int n:res) System.out.print(n+"\t");
    }
    public static int [] getResult(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                a[a.length-1]=0;
            }

        }
        return a;
    }
}
