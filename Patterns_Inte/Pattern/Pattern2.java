/*
*   *
*  *
* *
**
*****
*/
public class Pattern2
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==5||j==1||j==6-i)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
