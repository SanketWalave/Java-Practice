public class PalCheck {
    public static void main(String[] args) {
        System.out.println(isPal(-1231));
    }
    public static boolean isPal(int num){
        int temp=num,rev=0;
        for(;num!=0;num/=10){
            int rem=num%10;
            rev=rev*10+rem;
        }
        return rev==temp;
    }
}
