public class Pattern_31
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				char ch1=64;
				char ch2=96;
				if(j>=6-i && j<=4-i)
				{
                    System.out.print("*");
				}
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}