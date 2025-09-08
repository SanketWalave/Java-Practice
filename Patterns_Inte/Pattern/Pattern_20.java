/*
1
12
1 3
1  4
12345
*/
public class Pattern_20
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==i || j==1 || i==5)
				{
					if(i==j)
				System.out.print(i);
			else
				System.out.print(j);
				}
			else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}