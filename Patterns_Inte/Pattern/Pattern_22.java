/*
*
***
*****
*******
*********
*********
*******
*****
***
*
                                      */
public class Pattern_22
{
	public static void main(String x[])
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				//if((j>=6-i && j<=4+i && i<=5) ||(j>=i-4&&j<=14-i&&i>=6))
				if((j>=6-i && j<=4+i && i<=6)||(j>=i-4 && j<=16	-i && i>=7)) 
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}