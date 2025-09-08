public class pattern_1_7_1
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			
			char ch='A';
			for(int j=1;j<=9;j++)
			{
				int a=(i*2-1)/2;
				if(j<=i*2-1)
				{
					if(j<=a)
					{
						System.out.print(ch++);
					}
					else 
					{
						System.out.print(ch--);
					}
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}