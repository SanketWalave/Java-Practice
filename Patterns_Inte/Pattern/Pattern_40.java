/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
	
	*/
public class Pattern_40
{
   public static void main(String x[])
   {    int i,j;
	for(i=1; i<=9; i++)
	{     boolean b=true;
           for(j=1; j<=9;j++)
	   {
	      if((j==6-i || j==4+i ) ||(j==i-4 || j==14-i))
	      { System.out.printf("*");
	  b=false;
	      }
	   else{
                System.out.printf(" ");
				b=true;
              }
				 
           }
 	  System.out.printf("\n");
	}
   }
}
