public class Pattern_4_1
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=10;j++)
			{
				if(j<=i || j>=11-i)
				{
					if(j<6)
						System.out.print(ch++);
					else if(j>5)
						System.out.print(--ch);
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}