
 import java.util.*;
public class SimpleIntrest1
{
  public static void main(String x[])
  {
  Scanner xyz=new Scanner(System.in);
  float principalAmount,time,rate,finalamo,intrest;
  System.out.println("enter principle amount");
  principalAmount=xyz.nextFloat();
  System.out.println("enter time in year");
  time=xyz.nextFloat();
  System.out.println("enter rate of intrest");
  rate=xyz.nextFloat();
  float interest = principalAmount * (Math.pow((1 + rate / 100), (rate * time)) - 1);; 
  finalamo=intrest- principalAmount;
    System.out.println("final amount is-->" + finalamo);  
  }
}
