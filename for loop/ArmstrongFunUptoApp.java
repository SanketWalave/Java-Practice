import java.util.*;
public class ArmstrongFunUptoApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit,temp,count=0,rem=0,sum=0;
		limit = sc.nextInt();
		
		for(int j=1;j<=limit;j++)
		{
			temp = j;
			count = 0 ;
		for(;temp != 0;temp /= 10)
		{
			count++;
			//heare we find how meny number present
		}
		temp = j;
		sum =  0;
		for(;temp != 0;temp /= 10)
		{
			rem = temp % 10;
			//heare we separet every digit of number
			int power = 1;
			for(int i = 1; i <= count ; i++)
				//in this loop we find power of every digit in number upto count
			{
				power = power * rem;
				
				
			}	
				sum = sum + power;	
                //heare we add every power in sum				
		}
					//	System.out.println("sum " + sum);

		if(j == sum)
		{
			System.out.println(j);
		}
		
		}
	}
}