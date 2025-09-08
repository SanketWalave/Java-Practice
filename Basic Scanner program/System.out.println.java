import java.util.*;
public class SimpleIntrest
{
  public static void main(String x[])
  {
  Scanner xyz=new Scanner(System.in);
  float priamo,time,rate,finalamo;
  System.out.println("enter principle amount");
  priamo=xyz.nextFloat();
  System.out.println("enter time in year");
  time=xyz.nextFloat();
  System.out.println("enter rate of intrest")
  rate=xyz.nextFloat();
  finalamo=(priamo*rate*time)/100;
    System.out.println("final amount is-->" + finalamo);  
  }
}