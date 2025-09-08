public class ExplicitTypeCastingApp {
    public static void main(String[] args) {
        /*Explicit type casting : explicit type casting means those
         conversions performed by developers are called explicit
         type casting.
        When we have a smaller type of data at left hand side and
        larger type of data at right hand side then compiler is unable
         to perform conversion automatically then developer has
         responsibility to perform conversion manually called as
         explicit conversion.
*/
        long a=100;
        int b=(int) a;
        System.out.println(b);
    }
}
