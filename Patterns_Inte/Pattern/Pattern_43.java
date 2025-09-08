public class Pattern_43
{
	public static void main(String x[])
	{
	     int i,j;
		 int count;
		for ( i=1;i<;i++)
		{ 
	         
			for( j=1;j<=7;j++)
			{ 
			     if(j<=i*2-1 && i <=4)	
				   {
				     System.out.print("*");
				     
                    }
					else
					{
						System.out.print("");
					}
             }
			  System.out.println();
         }
		 for ( i=1;i<5;i++)
		{ 
	         
			for( j=1;j<=7;j++)
			{ 
			     if(j >= i * 2 )	
				   {
				     System.out.print("*");
				     
                    }
					else
					{
						System.out.print("");
					}
             }
			  System.out.println();
         }
      }	
}
/*
public class Pattern_43
{
	public static void main(String x[])
	{
	     int i,j;
		 int count;
		for ( i=1;i<=5;i++)
		{ 
	         count=65;
			for( j=1;j<=9;j++)
			{ 
			     if(j>=6-i && j<=4+i)
				   {
				     System.out.print((char)count+" ");
				     if(j<5)
                      {
                         ++count;
                       }
                       else
                        {
                            --count;
                        }
                    }
             }
			  System.out.println();
         }
      }	
}	  
*/	  