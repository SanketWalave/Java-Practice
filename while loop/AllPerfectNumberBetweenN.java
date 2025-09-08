import java.util.*; 
public class AllPerfectNumberBetweenN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++)
		{	sum=0;
			for(int j = 1;j < i;j++)
			{	
				
				if(i%j==0)
				{
					sum = sum + j;
					//System.out.println("sum"+sum);
				}
				
			}
			if(sum==i)
				{
					System.out.println(" "+i);
				}
			
		}
		//System.out.println(sum);
		
	}
}