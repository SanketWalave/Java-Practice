public class CountDigit_21_4 {
    public static void main(String[] args) {
        System.out.println(getDigitCount(1234));
        System.out.println(getDigitCount(-1234));
    }
    public static int getDigitCount(int num)
    {
        int count=0;
        for(;num!=0;num/=10)
            count++;
        return count;
    }
}
