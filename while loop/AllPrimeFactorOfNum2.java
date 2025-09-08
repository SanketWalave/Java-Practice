import java.util.*;
public class AllPrimeFactorOfNum2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int i = 1,j = 1,count;
	//	while(i<num)
	//	{
			count=0;
			while(num%j==0)
			{
				count++;
				j++;
			
			if(count==2)
			{
				System.out.println(j);
			}
			}
	//		i++;
	//	}
	}
}
/*j =2;
			 count=0;
			while(i<=j)
			{
				if(num%i==0)
				{
					count++; 
				}
				i++;
				if(count==2)
				{
					System.out.println(j);
				}
			}
			j++;
			*/