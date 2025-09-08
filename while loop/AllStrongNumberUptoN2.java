import java.util.*;
public class AllStrongNumberUptoN2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int rem;
		for(int i=0;i<=200;i++)
		{
		int temp = i;
		int fact = 1;
		int sum  = 0;
		for( ;temp !=0;temp/=10)// 1 4 5
		{	
			fact = 1;
			 rem = temp % 10;
			
		
			 for(int  j = 1; j <= rem;j++ )
			 {
				 fact = fact * j;
				  
			 }
			sum=sum+fact;
			 
		}
		if(sum==i)
		{
			System.out.println(fact);
		}
          			
		}
	}
}