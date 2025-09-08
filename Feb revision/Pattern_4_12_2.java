public class Pattern_4_12_2
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int count=1;
			for(int j=1;j<=9;j++)
			{
				
				if(j>=i  && j<=10-i)
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