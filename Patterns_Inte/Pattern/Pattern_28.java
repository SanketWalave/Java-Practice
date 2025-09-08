public class Pattern_28
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{
			for(char j=1;j<=7;j++)
			{
				//if((  || j<=i && j<=(i*2)-1  )||(j>i && j<=(i*2)-1))
				//if(( j<i && j<=(i*3-1))||(j>i && j<=(i*3-1)))
                    if(j>=10-i)
					System.out.print("* ");
				else
					System.out.print("");
		     }
		  System.out.print("\n");
		}
	}
}