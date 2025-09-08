import java.util.*;
public class PrimeFactorOfNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int count;
		int i=1;
		while(i<=num)
		{
			int j=2;
			while(i%j==0)
			{
				count=0;
				
				count++;
				if(count==2)
				{
				System.out.println(i);
				}
				j++;
			}
			i++;
		}
			
		}

}