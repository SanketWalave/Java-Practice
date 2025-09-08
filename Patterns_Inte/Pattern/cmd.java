public class Pattern_44
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if((j<=i*2-1 && i<5 )||( j<=i+2 && i==5) || (j<=i-1 && i==6)||(j<=i-4 && i==7)||(j==8 && i==8))
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}