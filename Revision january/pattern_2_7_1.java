/*
		1
		2 # 2
		3 # 3 # 3
		4 # 4 # 4 # 4
		5 # 5 # 5 # 5 # 5
		5 # 5 # 5 # 5 # 5
		4 # 4 # 4 # 4
		3 # 3 # 3
		2 # 2
		1
		

		#
		# # #
		# # # # #
		# # # # # # #
		# # # # # # # # #
		# # # # # # # # #
		# # # # # # #
		# # # # #
		# # #
		#
*/
public class pattern_2_7_1
{
	public static void main(String x[])
	{
		int num2=6,num1=0;
		for(int i=1;i<=10;i++)
		{
			
			if(i<6)
			  num1=i;
			else 
				--num2;
			for(int j=1;j<=9;j++)
			{
				
				//if((j<=i*2-1 && i<=6 )||(i==7 && j<=7)||(i==8 && j<=5)||(i==9 && j<=3)||(i==10 && j==1))
				if((j<=i*2-1 && i<=6 )||((j <= 2 * (11 - i) - 1)&& i>6))
				{
					
					if(j%2==1)
					{
						if(i<6)
							System.out.print(num1);
						else
							System.out.print(num2);
					}
					else
						System.out.print("#");
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