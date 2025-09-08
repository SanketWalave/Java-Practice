public class Pattern_47
{
	public static void main(String x[])
	{int count1 = 1;
		int count=1;
		for(int i=1;i<=7;i++)
		{ count=1;
		 count1 = 1;
			for(int j=1;j<=7;j++)
			{
			if(j<=i && j <= i-1  )
			{
					System.out.print(count);
					count++;
			}	
				else if(j <=i && )
					{
					System.out.print(count1);
					count--;
			}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}