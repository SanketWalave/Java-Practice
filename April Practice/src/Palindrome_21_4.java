public class Palindrome_21_4 {
    public static void main(String[] args) {
        System.out.println(isPAlindrome(123));
        System.out.println(isPAlindrome(12321));
    }
    public static boolean isPAlindrome(int num)
    {
        int rev=0;
        int temp=num;
        while (num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return temp==rev;
    }
}
