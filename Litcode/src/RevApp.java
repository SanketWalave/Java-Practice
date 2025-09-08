class Solutionr {
    public int reverse(int x) {
        int num=Math.abs(x);
        int rev=0;

        for(;num!=0;num/=10)
        {
            int rem=num%10;
            if(rev>( Integer.MAX_VALUE-rem)/10)
            {
                return 0;
            }
            rev=rev*10+rem;
        }
        return (x < 0) ? (-rev) : rev;
    }
}
public class RevApp
{
    public static void main(String[] x)
    {
        Solutionr s=new Solutionr();
        int ans= s.reverse(-123);
        System.out.println(ans);
    }
}