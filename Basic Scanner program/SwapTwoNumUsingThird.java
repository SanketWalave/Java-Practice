import java.util.*;
public class SwapTwoNumUsingThird
{
 public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 int a,b,c;
 System.out.println("enter two numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("the values before swaping");
  System.out.println("a = "+ a);
  System.out.println("b = "+ b);
  c=0;
  c=a;//   c = 5  5
  a=b;
  b=c;
  
  System.out.println("values after swaping \n"+"a="+a);
   System.out.println("b = " + b);
 }
}