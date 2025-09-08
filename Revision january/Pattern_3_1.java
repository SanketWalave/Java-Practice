public class Pattern_3_1
{
	public static void main(String x[])
	{
		int count1=1,count2=0;
		for(int i=1;i<=5;i++)
		{
			if(i==2)
			  count2=10;
			else if(i==3)
				count2=20;
			for(int j=1;j<=5;j++)
			{
				if(i%2==1)
				{
					System.out.print("  "+count1+"  ");
				}
				else
				{
					System.out.print("  "+count2--+"  ");
				}
				count1++;
			}
			System.out.println();
		}
	}
}