public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(getDigitSum(1234));
        System.out.println(getDigitSum(34));
    }
    public static int getDigitSum(int num)
    {
        int sum=0;
        for(;num>0;num/=10)
        {
            int rem=num%10;
            sum+=rem;
        }
        return sum;
    }
}
