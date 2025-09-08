public class FindMissing_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                for (int j=a[i]+1;j<a[i+1];j++) System.out.print(j+"\t");
            }
        }
    }
}
