import java.util.*;
public class Aramstrong
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int temp = num;
		int count = 0 ; 
		int p ; 
		while(temp !=0)
		{
			count++;
			temp = temp/10;
		}
		
		int sum = 0;
		temp = num;
		while(temp != 0)
		{
			int rem = temp%10;
			p = 1;
			System.out.println("---" +rem);
			int i =1;
			while(i <= count)
			{
				p = p * rem;
				i++;
			}
			sum = sum + p;
			
			temp = temp/10;	
		}
		
		System.out.println("sum " +sum);
		if(num == sum)
		{
			System.out.println("It is Armstrong");
		}
		else
		{
			System.out.println("It is not Armstrong number");
		}
	}
}