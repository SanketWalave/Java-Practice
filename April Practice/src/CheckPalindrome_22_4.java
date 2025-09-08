public class CheckPalindrome_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,1,1};
        System.out.println(isPal(a));
    }
    public static boolean isPal(int a[])
    {
        int end=a.length-1,mid=a.length/2;
        for(int i=0;i<mid;i++)
        {
            if(a[i]!=a[end])
                return false;
            end--;
        }
        return true;
    }
}
