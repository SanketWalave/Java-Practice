
public class Pattern_58
{
  public static void main(String x[])
   {
    
      for(int i=1;i<=5;i++)
       {
         char ch='A';
         char ch1='E';
        for(int j=1;j<=10;j++)
         {
             if(j>5)
             --ch1;
            
           if((j<=i|| j>=11-i ))
            {
              if(j<6)
              System.out.print(ch++);
              else
              System.out.print(ch1--);

            }
           else
             System.out.print(" ");
         }
       System.out.println("");     
       }
   }
}