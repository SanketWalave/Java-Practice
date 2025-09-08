public class Facto_21_4 {
    public static void main(String[] args) {
        System.out.println(getFact(-400));
    }
    public static long getFact(int limit)
    {
        long fact=1;
        for(int i=1;i<=limit;i++) {
            fact *= i;
            if(fact>=Integer.MAX_VALUE)return Integer.MAX_VALUE;
        }
        return fact;

    }
}
