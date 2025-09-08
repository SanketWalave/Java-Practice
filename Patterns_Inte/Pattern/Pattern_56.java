public class Pattern_56
{
   public static void main(String x[])
   {

     
     for(int i=1;i<=5;i++)
      {int count=1,count1=i;
        for(int j=1;j<=10;j++)
           {
             if(j<=i && j<=5 )
               {
                System.out.print(count++);
               }
              else if(j>=11-i && j>5)
               {
                System.out.print(count1--);
               }
	      else
		{
		System.out.print(" ");	
		}
           }
         System.out.println();
      }
   }
}