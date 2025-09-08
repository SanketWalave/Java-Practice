/*
*******
*******
*******
*******
*/
public class Pattern_6
{
	public static void main(String x[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i>=5-i||i<=i+3)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
