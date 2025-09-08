/*
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****
*/
public class Pattern_34
{
	public static void main(String x[])
	{
		for(int i=1; i<=5;i++)
		{ 
	        boolean b=true;
			for(int j=1;j<=17;j++)
			{
				if(j>=10-i && j<=8+i  && b)
				{
					System.out.print(i);
					b=false;
				}
				else{
					System.out.print("*");
					b=true;
					
					}
			}
			System.out.println();
		}
	}
}