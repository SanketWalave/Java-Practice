public class Pattern_Q2_14_2
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			int count=1;
			for(int j=1;j<=5;j++)
			{
				if((j>=10-i && i>=5)||(j>=i && i<5))
					System.out.print(count++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}