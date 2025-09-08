import java.util.*;
public class Assig_8
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		do
		{
			System.out.println("which number you want to check");
			System.out.println("1.prime");
			System.out.println("2.perfect");
			System.out.println("3.duck");
			System.out.println("4.strong");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			int count=0,temp=0,rem=0;
			switch (choice)
			{
				case 1:
				for(i=1;i<=num;i++)
				{
					if(num%i==2)
					{
						count++;
					}
				}
				if(count==2)
					System.out.println("number is prime");
				else
					System.out.println("number is not prime");
				break ;
				case 2:
				temp=num;
				for(;temp!=0;temp/=10)
				{
					rem=temp%10;
					multi=1;
					for(i=1;i<=rem;i++)
					{
						multi=multi*i;
					}
				}
				if(multi==num)
					System.out.println("number is perfect");
				else
					System.out.println("number is not perfect");
				break ;
				default :
				System.out.println("invalid choice");
				break ;
				
			}
			
		}
	}
}