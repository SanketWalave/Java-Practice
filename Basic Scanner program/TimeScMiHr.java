import java.util.*;
public class TimeScMiHr
{
 public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 int seconds,minutes,hours,rem,rem1;
 System.out.println("enter timr in seconds");
 seconds=sc.nextInt();
 hours=seconds/3600;
 rem=seconds%3600;
 minutes=rem/60;
 rem1=seconds%60;
  System.out.println("time in hours is  " + hours);
  System.out.println("time minutes is  " + minutes);
 System.out.println("time in remind in seconds is  " + rem1);
 }
}