import java.util.*;
public class StrongNumberWhile
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp = num;
		int fact = 1;
		int sum  = 0;
		while( temp !=0)// 1 4 5
		{	
			fact = 1;
			int rem = temp % 10;
			
		int  i = 1;
			 while( i <= rem )
			 {
				 fact = fact * i;
				  i++;
			 }
			System.out.println("Fact"+fact);
			sum=sum+fact;
			 temp /=10;
		}
		System.out.println("Sum"+sum);
			if(num == sum)
			{
			    System.out.println("It is strong number");
			}
			else
			{
				System.out.println("It is not Strong number");
			}
	}
}