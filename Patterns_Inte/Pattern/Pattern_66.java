public class Pattern_66
{
	public static void main(String x[])
	{
		//System.out.println(5-1);
		boolean flag=true;
		int count1=1,count2=1,m=1,k;
		for(int i=1;i<=5;i++)
		{
			count1=1;count2=1;k=1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i && flag)
				{
					if(i<=3)
					{    
						if(i==2 || i==1)
							System.out.print(count1);
						else
						{
							if(k<m-1)
								System.out.print(count1++);
							else
								System.out.print(count1--);
						}
							
						
						k++;
					}
					else
					{
						
						if(k<=m-2)
						{
							if(i==5 && k<2)
							{
								
								System.out.print(count2);
								count2+=3;
							}
							else
							{
								System.out.print(count2);
								count2+=2;
							}
						}	
						else 
						{
							if(i==5 && k==5)
							{
								count2-=3;
								System.out.print(count2);
								
							}
							else if(i==5 && k==4)
							{
								count2=4;
								System.out.print(count2);
							}
							else
							{
								
								count2-=2;
								System.out.print(count2);
							
							}
							
							
							
						}
							
							k++;
					}
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			
			System.out.println("\t\t\t"+s);
			m++;
		}
	}
}