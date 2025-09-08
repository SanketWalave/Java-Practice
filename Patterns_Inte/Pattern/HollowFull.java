/*
     	   *
	*    *
      *        *
    *            * 
  *                *
*   *   *   *   *   *  

*/


import java.util.*;
public class HollowFull{
public static void main(String X[])
{
	for(int i=1; i<=6; i++)
	{
	  for(int j=1; j<=11; j++)
	  {
	  if(j==7-i || j==5+i)// ||(i==6&&j%2==1))
	  {
	   System.out.printf("* "); 
	  }

	  else{
	   System.out.printf("  ");
	  }
	  }	
	   System.out.printf("\n");
	  }

}

}