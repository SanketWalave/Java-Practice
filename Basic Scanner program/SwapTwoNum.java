import java.util.*;
public class SwapTwoNum
{
public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  System.out.println("enter two numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("the values before swaping");
  System.out.println("a = \n"+ a );
  System.out.println("b = "+ b);
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("values after swaping \n"+"a="+a);
   System.out.println("b = " + b);
 }
}