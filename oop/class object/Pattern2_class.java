public class Pattern2_class
{
	public static void main(String x[])
	{
		
		for(int i=1;i<=11;i++)
		{
			int count=1;
			if(i<=6)
				count=i;
			else if(i>6)
				count=12-i;
			boolean flag=true;
			for(int j=1;j<=11;j++)
			{
				if((j>=i && j<=12-i && flag)|| (j>=12-i && j<=i && flag))
				{
					if(i<=6)
						System.out.print(count++);
					else
						System.out.print(count++);
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}