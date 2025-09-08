/*
    *
   * *
  * * *
 * * * *
* * * * *
*/
public class Pattern_33
{
	public static void main(String x[])
	{
		for(int i=1; i<=5;i++)
		{ 
	        boolean b=true;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i  && b)
				{
					System.out.print("*");
					b=false;
				}
				else{
					System.out.print(" ");
					b=true;
					
					}
			}
			System.out.println();
		}
	}
}