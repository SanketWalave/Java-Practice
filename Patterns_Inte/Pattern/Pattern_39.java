/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/
public class Pattern_39
{
   public static void main(String x[])
   {    int i,j;
	for(i=1; i<=10; i++)
	{     boolean b=true;
           for(j=1; j<=9;j++)
	   {
	      if((j>=6-i && j<=4+i && i<=5 && b) ||(j>=i-4&&j<=14-i&&i>=6 && b))
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
