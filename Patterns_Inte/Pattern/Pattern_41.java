/*
3
44
555
6666
555
44
3
*/
public class Pattern_41
{
   public static void main(String x[])
   {    int i,j;
		int count = 2 ;
		for(i=1; i<=7; i++)
		{   if(i<=4)
			{
				count++;
			}
			else
			{
				--count;
			}
			
           for(j=1; j<=4;j++)
			{
				if(i>=j && i<5)
				{ 
					System.out.print(count);
				}
				else if(j<=8-i && i>=5)
				{
					System.out.print(count);
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
