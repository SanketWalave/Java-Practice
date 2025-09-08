public class Pattern_50
{
	
	public static void main(String x[])
	{
		boolean b=true;
		for(int i=1;i<=5;i++)
		{
			int count=1;
			for(int j=1;j<=9;j++)
			{
				
				count++;
				if(j==6-i || j==4+i || i==5 && b)
				{
					
					if (i==5)
					{
					System.out.print(count);
					}
				    else if(j<6)if (i==5)
					{
					System.out.print("1");
					}
				    else
					{
					System.out.print(count);
					}
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