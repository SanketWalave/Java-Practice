public class Pattern_25
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print("2  ");
				else
					System.out.print("1  ");
			}
			System.out.print("\n");
		}
	}
}