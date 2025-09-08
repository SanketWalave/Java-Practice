public class ReverseNum_21_4 {
    public static void main(String[] args) {
        System.out.println(getRev(-1234));
    }
    public static int getRev(int x)
    {
        int num=Math.abs(x);
        int rev=0;
        for(;num!=0;num/=10)
        {
            int rem=num%10;
            rev=rev*10+rem;
            if(rev>(Integer.MAX_VALUE-rem)/10)return 0;

        }
        if(x>0)
            return rev;
        else
            return (-rev);
    }
}
