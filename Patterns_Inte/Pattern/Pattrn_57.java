public class Pattrn_57
{
  public static void main(String x[])
  {  int count1=0;
     int count2=5;
    for(int i=1;i<=8;i++)
       {
         int count=1;
         
           if(i<=4)
                count=1;
           else if(i>4)
               // count2-=1;
         	count1=9-i;
          for(int j=1;j<=7;j++)
           {
             
              if((j<=(i*2)-1 && i<5) ||( j<=i+2 && i==5) ||( j<=i-1 && i==6) ||( j<=i-4 & i==7)||(j<=i-6 && i==8))
               {
               if(j%2==1)
                 {
                   if(i<=4)
                   System.out.print(count++);
                   else
                    System.out.print(count1--);
                 }
                else
                  System.out.print("*");
               }
             else
               System.out.print(" ");
           }
        System.out.println("");
       }
  }
}