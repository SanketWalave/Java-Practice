import java.util.*;
public class Triangle1
{
   public static void main(String x[])
   {
   Scanner xyz=new Scanner(System.in);
   int angle1;
   int angle2;
   int angle3;
   System.out.println("enter angle1");
   angle1=xyz.nextInt();
   System.out.println("enter angle 2");
   angle2=xyz.nextInt();
   angle3=180-(angle1 + angle2);
   System.out.println("third angle is-->" + angle3);
   
   }
}