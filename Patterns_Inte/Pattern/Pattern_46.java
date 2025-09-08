public class Pattern_46
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{   boolean b=true;
			for(int j=1;j<=13;j++)
			{
				if((j<=i*2-1 && i<5 && b)|| (j<i+4 && i==5 && b) ||(j<=i-1 && i==6 && b) ||(j==i-6 && i==7 && b))
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
			System.out.println();
		}
	}
}