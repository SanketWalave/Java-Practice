public class Pattern_44
{
	public static void main(String x[])
	{ 
	int count=0;
		for(int i=1;i<=8;i++)
		{  
	         if(i<=4)
			 {
				 count++;
			 }
			 else if(i>5){
			--count;
			 }
			for(int j=1;j<=8;j++)
			{
				if((j<=i*2-1 && i<5 )||( j<=i+2 && i==5) || (j<=i-1 && i==6)||(j<=i-4 && i==7)||(j==i-7 && i==8))
				{
					if(j%2==1)
					    System.out.print(count);
				    else
					    System.out.print("*");
				}
				
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}