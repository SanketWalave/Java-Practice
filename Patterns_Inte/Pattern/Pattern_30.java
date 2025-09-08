public class Pattern_30
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				char ch1=64;
				char ch2=96;
				if(j<=i)
				{
					if(i%2==0)
					{
						ch1++;
						System.out.print(ch1);
					}
					else
					{
						ch2++;
						System.out.print(ch2);
				    }
				}
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}