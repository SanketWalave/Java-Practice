
import java.util.*;
public class Demo
{
   static int i=1;
   public static void main(String x[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int li=sc.nextInt();
        armstrong(li , i);
     
    }
    public static void armstrong(int limit , int i)
     {
       int  sum = 0,count=0 , temp , power = 1;
       if(i<=limit)
         {
           
           temp=i;
	   count=0;
           
            for(;temp!=0;temp/=10)
             {
                 count++;
             }
             temp=i;
             for(;temp!=0;temp/=10)
             {
                  int rem=temp%10; 
                  power=1;
                  for(int k=1;k<=count;k++)
                  {
                      power=power*rem;
                  }
               		 sum=sum+power;
             }
              //System.out.println(sum);
          	 if(sum==i)
                {
                 	System.out.println(i);
                }
            armstrong(limit , i + 1);
             
         }
     }
}