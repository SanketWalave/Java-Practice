/*
    1
   123
  12345
 1234567
123456789
*/
public class Pattern_18
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int count = 1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)//if(j>=6-i && j<=4+i)
					System.out.print(count++);
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}