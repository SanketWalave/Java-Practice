import java.util.*;
public class Happynofinalwhile
{
  public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     int n;
     System.out.println("Enter no:");
     int num=xyz.nextInt();
	 happy(num);
	 
   }
   public static void happy(int n)
   {
   
       int result=0,rem;
     while(n!=1 && n!=4)
     {
                 result=0;
      while(n>0)
           {
                  rem=n%10;
                  result=result+rem*rem;
                  n=n/10;
           }
           if(result==1)
              {
                   System.out.println("Happy Number");
                   break;
              }
              if(result==4)
                 {
                    System.out.println("Not Happy number");
                     break;
                 }
                     n=result;
          }
    }
}
		  