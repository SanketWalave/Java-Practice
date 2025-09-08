public class CumputeReverceOfIntegers
{
  public static void main(String x[])
  {
  int digit,rev=0,num,rem;
  num=123;
          while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
  System.out.println("rev is  "+ rev);
  }
}