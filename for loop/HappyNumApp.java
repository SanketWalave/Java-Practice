import java.util.*;
public class HappyNumApp
{
	public static void main(String arg [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int rem = 0;
		int sum = 0,sum2 = 0;
		
		for(int i = 0 ; i <100; i++)
		{
			sum = 0;
			for(;num != 0;num /= 10)
			{
				rem =  num % 10;
				sum = sum + rem * rem;
			}
				num = sum;
				if(num == 1)
				{
					System.out.println("It is a happy number");
				}
		}
			System.out.println("It is not happy number");
	
	}
}