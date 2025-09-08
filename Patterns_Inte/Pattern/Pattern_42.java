public class Pattern_42
{
	public static void main(String x[])
	{
		for (int i=1;i<=8;i++)
		{ 
	         boolean b=true;
			for(int j=1;j<=7;j++)
			{
				if((i>=j && i<=4)||(j<=8-i && i>=5))
				{
					System.out.print("*");
					b=false;
					
				}
				else
				{
					System.out.print(" ");
				
				}
			}
			System.out.println();
		}
	}
}