/*
*****
****
***
**
*
*/
public class Pattern_17
{
	public static void main(String x[])
	{
		int count ;
		for(int i=1;i<=5;i++)
		{
			count = 1;
			for(int j=1;j<=5;j++)
			{
				if(j>=i )
				{
					System.out.print(count++);
				}
				else
					System.out.print("");
			}
			System.out.print("\n");
		}
	}
}