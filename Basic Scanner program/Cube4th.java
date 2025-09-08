import java.util.*;
public class Cube4th
{
 public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 int num,cube,fourth;
 System.out.println("enter number");
 num=sc.nextInt();
 cube=num*num*num;
 fourth=num*num*num*num;
  System.out.println("the cube of the number is  " + cube);
  System.out.println("the forth of number is  " + fourth);
 }
}