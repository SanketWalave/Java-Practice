/*   
	       #
	    *  *
	 #  #  #
      *  *  *  *
   #  #  #  #  #
*/

import java.util.*;
public class p8
 {
   public static void main(String X[])
     {
	for(int i=1; i<=5; i++)
	  {
	    for(int j=1; j<=5; j++)
	 
	      {
	        if(j>=6-i)
	         {
	           if(i%2==0)
	             {
	               System.out.printf(" * "); 
	             }

                  else
                   {
	               System.out.printf(" # ");
	            }
			 }   
		else
                 {
                      System.out.printf("   "); 
 	         }
		
		  }
	      System.out.printf("\n");
	  }
	
}

}