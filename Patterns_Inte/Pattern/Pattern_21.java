/*
    1
   1 2
  1   3
 1     4
111155555
*/
public class Pattern_21
{
	public static void main(String x[])
	{
		int flag = 0;
		for(int i=1;i<=5;i++)
		{	flag = 0;
			for(int j=1;j<=9;j++)
			{
				if(j==6-i || j==4+i || i==5){
					if(j<5)
					System.out.print("1");
				else
					System.out.print(i);
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}