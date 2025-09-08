import java.util.*;
public class SimpleIntrest
{
  public static void main(String x[])
  {
  Scanner xyz=new Scanner(System.in);
  float priamo,time,rate,finalamo,intrest;
  System.out.println("enter principle amount");
  priamo=xyz.nextFloat();
  System.out.println("enter time in year");
  time=xyz.nextFloat();
  System.out.println("enter rate of intrest");
  rate=xyz.nextFloat();
  intrest=(priamo*rate*time)/100;
  finalamo=intrest+priamo;
    System.out.println("final amount is-->" + finalamo);  
  }
}