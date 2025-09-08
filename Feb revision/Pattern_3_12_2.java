public class Pattern_3_12_2
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int count=1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=i+4)
				{
					if(j<5)
					System.out.print(count++);
				else
					System.out.print(count--);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}