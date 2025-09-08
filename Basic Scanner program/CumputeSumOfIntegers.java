import java.util.*;
public class CumputeSumOfIntegers
{
  public static void main(String x[])
  {
  int digit,sum,num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	num = sc.nextInt();
	
   sum = (num%10);
   int sum2= ((num/10)%10);
   //int sum3=((num/100)%10);
   int sum4=(num/100);
 // int total = sum + sum2 + sum3 + sum4;
  System.out.println("reverse is /n "+ sum+sum2+sum4 );
   //System.out.println("sum is  "+ sum2 );

 //System.out.println("sum is  "+ sum3 );
  //System.out.println("sum is  "+ sum4 );
 // System.out.println("sum is  "+ total);

  }
}