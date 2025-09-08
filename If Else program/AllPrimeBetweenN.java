import java.util.*;
public class AllPrimeBetweenN
{
		public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number upto ");
		int num,i=1,j=1,sum=0,count=0;
		num=sc.nextInt();
		while(i<=num)
		{	
	    while(j%i==0)
			{
				i++;
				count++;
				if(count==2)
				{
					System.out.println(i);
				}
			}
		i++;
		    
		}
			
		
		
	}
}