public class Pattern_60
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			//char ch2='
			for(int j=1;j<=9;j++)
			{
				if(j<=6-i || j>=4+i)
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