public class Pattern_26
{
	public static void main(String x[])
	{
		for( int i=1;i<=5;i++)
		{	int count=0;
			for(int j=1;j<=9;j++)
	        {
				if(( j<=i && j<=(i*2)-1  )||(j>i && j<=(i*2)-1))
				{
					System.out.print("*");
				}
				/*else if(j>i && j<=(i*2)-1)
				{
					System.out.print("*");
				}*/
				else 
				{
					System.out.print(" ");
	
				}
			}
			System.out.println();
		}
	}
}