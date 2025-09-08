import java.util.*;
class ArmRecursion
{
   static int sum=0,x,k=1;;
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
       x=sc.nextInt();
       int count=0;
       int temp=x;
         while(temp>0)
            {
               count++;
                temp=temp/10;
             }
       setData(x,count); 
    }
     public static void setData(int a, int p)
      {
          int rem=a%10;
               k=1;
                sum=sum+power1(rem,p,1);
              a=a/10;
          if(a>0)
           setData(a,p);
          else
            {
                if(x==sum) 
                 System.out.println("Armstrong");
                else
                  System.out.println("Not a Armstrong"); 
            }
           
       }
     public static int power1(int r, int p1,int j)
        {  
             if(j<=p1)
              {
                 k=k*r;
                 j++;
                 return power1(r,p1,j);
               }
              else
                   return k;
          }
                
}