public class Pattern_76
{
	public static void main(String x[])
	{
		int count=0;
		for(int i=1;i<=7;i++)
		{
			if(i==1)
			{
				count=1;
			}
			else if(i<=4)
				count+=2;
			else
				count-=2;
			
			char count1='A';int k=0;
			for(int j=1;j<=7;j++)
			{
				if((j<=i+3 && j>=5-i && i<=4)||(i>4 && j>=i-3 && j<=11-i))
				{
					if(k<count/2)
						System.out.print(count1++);
					else 
						System.out.print(count1--);
					
					k++;
				}
				else
					System.out.print(" ");
			}
			System.out.println("\t\t"+count/2);
		}
	}
}