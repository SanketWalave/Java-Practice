/*
*
 *
  *
   *
*****
   *
  *
 *
*
*/
public class Pattern_23
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || i==10-j ||i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}