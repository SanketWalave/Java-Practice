import java.util.*;
public class Assig_8
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;
	do
	{
		System.out.println("enter number");
		int num=sc.nextInt();
		
		
			System.out.println("which number you want to check");
			System.out.println("1.prime");
			System.out.println("2.perfect");
			System.out.println("3.duck");
			System.out.println("4.strong");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			int count=0,temp=0,rem=0,multi,i,sum;
			switch (choice)
			{
				case 1:
				for(i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						count++;
					}
				}
				if(count==2)
					System.out.println("number is prime");
				else
					System.out.println("number is not prime");
				break ;
				case 4:
				temp=num;
				 sum=0;
				for(;temp!=0;temp/=10)
				{
					rem=temp%10;
					 multi=1;
					
					for(i=1;i<=rem;i++)
					{
						multi=multi*i;
					}
					sum=multi+sum;
				}
				if(sum==num)
					System.out.println("number is strong");
				else
					System.out.println("number is not strong");
				break ;
				case 2:
				temp=num;
				multi=0;
				for(i=1;i<num;i++)
				{
					if(temp%i==0)
					{
						multi=multi+i;
					}
				}
				if(multi==num)
					System.out.println("number is perfect num");
				else
					System.out.println("number is not perfect num");
				break ;
				case 3:
				temp=num;
				rem = 0;
				int flag = 1;
				for(;temp!=0;temp/=10)
				{
					rem=temp%10;
					if(rem==0)
					{
					     flag = 0;
                            break;  						 
					}
				}
				if(flag == 0)
					System.out.println("number is duck num");
				else
					System.out.println("number is not duck num");
				break ;
				default :
				System.out.println("invalid choice");
				break ;	
				
		}
		System.out.println("you want to continue(y/Y)");
		ch =sc.next().charAt(0);
	}while(ch=='Y'||ch=='y');
	}
}