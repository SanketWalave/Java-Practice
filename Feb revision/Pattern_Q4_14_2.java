public class Pattern_Q4_14_2
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(" "+count);
					count++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}