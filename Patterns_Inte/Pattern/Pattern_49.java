/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
public class Pattern_49
{
	public static void main(String x[])
	{
		int count =0;
		for(int i=1;i<=5;i++)
		{
			 boolean b=true;
			for(int j=1;j<=17;j++)
			{ 
		       
				if(j>=10-(i*2-1) &&	j<=8+(i*2-1)  && b)
					//if(j>=10-(i*2-1) && j<=8+(i*2-1) && b)
					{
						if(j<10)
						{
							count++;
						}
						else{
							count--;
						}
				
					System.out.print(count);
					b=false;
				}
				else
				{
					System.out.print(" ");
					b=true;
				}
			}
			System.out.print("\n");
		}
	}
}
