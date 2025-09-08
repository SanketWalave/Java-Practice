public class Pattern_37
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			boolean b=true;
			for(int j=1;j<=9;j++)
			{
			if(((j<=i || j>=12-i)&& i<6 )||((j<=6-i || j>=4+i)&& i>=6 ))
				{
					System.out.print("*");
					b=false;
				}
				else
				{
					System.out.print(" ");
				    b=true;
			}
			}
			System.out.print("\n");
		}
	}
}