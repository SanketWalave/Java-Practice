public class FindMaxSumSub_22_4 {
    public static void main(String[] args) {
        int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
//        for(int i=0;i<a.length;i++)
//        {
//            sum+=a[i];
//            if(sum>maxsum)
//                maxsum=sum;
//            else if(sum<0)sum=0;
//        }
        for(int i=0;i<a.length;i++)
        {
            sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum+=a[j];
                maxsum=Math.max(sum,maxsum);
            }
        }
        System.out.println(maxsum);
    }
}
