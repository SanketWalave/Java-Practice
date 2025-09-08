public class Pattern_51
{
  public static void main(String x[])
  {
        int i,j,count;
        boolean flag=true;
        for(i=1;i<=11;i++)
         {
            
             if(i>6)
              count=12-i;
             else
               count=i;
            for(j=1;j<=11;j++)
              {
                if((j>=i && j<=12-i && flag)||(j<=i && j>=12-i && flag))
                 {
                    // if(i<=6)
                      //{
                        System.out.print(count++);
                        flag=false;
                      //}
                     //else
                      //{
                        //System.out.print(count++);
                        //flag=false;
                       //}
                 }
                else
                 {
                  System.out.print(" ") ;
                  flag=true; 
                 }
              }
           System.out.println();
         }
  }
}