/*
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/	
public class Pattern_32
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			boolean b=true;
			for(int j=1;j<=11;j++)
			{
				if(j>=i && j<=12-i && b)
				{
					System.out.print("*");
					b=false;
				}
				else
				{
					System.out.print(" ");
				    b=true;
			}
			}
			System.out.print("\n");
		}
	}
}