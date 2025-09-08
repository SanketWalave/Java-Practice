import java.util.*;
public class SumOfPrimeNumber
{
		public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number upto ");
		int num,i,j=2,sum=0,count;
		num=sc.nextInt();
		while(j<=num)
		{	
	count=0;
		i=1;
		while(i<=j)
			
		{
	     if(j%i==0)
			{
			  //  i=1;	
				count++;
			}
			i++;
		}
			if(count==2)
				{
					sum+=j;
					System.out.println(j);
				}
		j++;
		    
		}
		
			System.out.println(sum);
				
	}
}
