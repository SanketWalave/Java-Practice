public class Assig_15
{
	public static void main(String x[])
	{
		char ch=64;
		
		
		for(int i=1;i<=5;i++)
		{		
	         ch=64;
			for(int j=1;j<=10;j++)
			{
				if(j<=5)
		        {
			        ch++;
		        }
		        else if(j>6)
		        {
			      --ch;
		         }
				//if(j<=i || j>=12-i )
				if(j<=i || j>=11-i)
				{
					System.out.print(ch);
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