public class Duck {
    public static void main(String[] args) {
        System.out.println(isDuck(1230));
    }
    public static boolean isDuck(int num){
        for(;num!=0;num/=10) if(num%10==0)return true;
        return false;
    }
}
