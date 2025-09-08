import java.util.*;
public class Ascii
{
 public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 
 
 System.out.println("enter ch1 ");
  char ch1 = sc.next().charAt(0);
  char ch2 = sc.next().charAt(0);
  
 int ASCIIValue1=ch1;
 int ASCIIValue2=ch2;
 
 System.out.println("the asciivalue of "+ch1+"is"+ASCIIValue1);
 System.out.println("the asciivalue of "+ch2+"is"+ASCIIValue2);
 
 }

}