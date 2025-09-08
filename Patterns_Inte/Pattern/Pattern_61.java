public class Pattern_61
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{
			boolean b=true;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i && j<=3+i && b)
				{
					System.out.print(count++);
					b=false;
				}
				else
				{
					System.out.print(" ");
					b=true;
				}
			}
			System.out.println();
		}
	}
}