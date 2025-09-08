public class Pattern_65
{
	public static void main(String x[])
	{
		boolean flag=true;
		
		for(int i=1;i<=8;i++)
		{
			char ch='A';
			for(int j=1;j<=14;j++)
			{
				if(j>=i && j<=15-i && flag)
				{
					System.out.print(ch++);
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