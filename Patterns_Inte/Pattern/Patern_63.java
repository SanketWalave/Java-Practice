public class Patern_63
{
	public static void main(String x[])
	{
		int count=6;
		for(int i=1;i<=10;i++)
		{
			if(i>5)
				count--;
			for(int j=1;j<=9;j++)
			{
				if((j>=10-(i*2-1)&& i<7)||(i==7 && j>2) ||(i==8 && j>4)||(i==9 && j>6)||(i==10 && j==9))
				{
					if(j%2==0)
						System.out.print("#");
					else 
					{
						if(i<=5)
							System.out.print(i);
						else 
							System.out.print(count);


					}
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
