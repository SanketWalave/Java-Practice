public class SecondLargest_22_4 {
    public static void main(String[] args) {
        int a[]={1,52,3,43,63};
        System.out.println(getSlargest(a));
    }
    public static int getSlargest(int a[])
    {
        int flargest=a[0];
        int slargest=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>flargest)
            {
                slargest=flargest;
                flargest=a[i];
            }
            else if(a[i]>slargest && a[i]<flargest)
            {
                slargest=a[i];
            }
            else{

            }
        }
        return slargest;
    }
}
