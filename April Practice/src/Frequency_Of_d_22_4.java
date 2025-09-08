public class Frequency_Of_d_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,2,2};
        System.out.println(getFreq(a,2));
    }
    public static int getFreq(int a[],int d)
    {
        int c=0;
        for(int n:a)
            if(n==d)c++;
        return c;
    }
}
