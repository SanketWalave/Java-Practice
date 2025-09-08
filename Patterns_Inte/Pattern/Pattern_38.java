public class Pattern_38
{
   public static void main(String x[])
   {    int i,j;
		for(i=1; i<=10; i++)
		{   
				for(j=1; j<=11;j++)
			{
				if(j <= 6-i && i <= 5 || j>= 6+i && i <=5 || j >=17-i && i > 5 || j <= i - 5 && i > 5 )
				{ 		
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");

				}
				 
			}
			System.out.printf("\n");
	 
		}
   }
}
