public class Pattern_27
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(char j=1;j<=20;j++)
			{
				//if((  || j<=i && j<=(i*2)-1  )||(j>i && j<=(i*2)-1))
				if(( j<i && j<=(i*3-1))||(j>i && j<=(i*3-1)))

					System.out.print("* ");
				else
					System.out.print("");
		     }
		  System.out.print("\n");
		}
	}
}