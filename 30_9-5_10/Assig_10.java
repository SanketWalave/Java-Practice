import java.util.*;
public class Assig_10
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("enter limit");
			int limit=sc.nextInt();
			System.out.println("1. Display The 1 To nth Prime Number ");
			System.out.println("2. Display The 1 To nth Perfect Number");
			System.out.println("3. Display The 1 To nth Duck Number");
			System.out.println("4. Display The 1 To nth Strong Number : ");
			System.out.println("5. Display The 1 To nth Armstrong Number ");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			int i,j,count,sum,temp,rem,multi,power;
			boolean flag;
			
			switch(choice)
			{
				case 1:
				
				for(i=1;i<=limit;i++)
				{
					count=0;
					for(j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;
						}
					}
					if(count==2)
						System.out.println(i);
				}
				break ;
				case 2:
				for(j=1;j<=limit;j++)
				{
					sum=0;
					for(i=1;i<j;i++)
					{
						if(j%i==0)
						{
							sum=sum+i;
						}
						
					}
					if(sum==j)
							System.out.println(j);
				}
				break ;
				case 3:
				for(j=1;j<=limit;j++)
				{
					temp=j;
					rem=1;
					flag=false;
					for(;temp!=0;temp/=10)
					{
						rem=temp%10;
						if(rem==0)
						{
							flag=true;
						}
					}
					if(flag)
						System.out.println(j);
				}
				break ;
				case 4:
				sum = 0;
				 rem=1;
				for ( j=1;j<=limit;j++)
				{
					temp=j;
					sum=0;
					for(;temp!=0;temp/=10)
					{
						rem=temp%10;
						multi=1;
						for(i=1;i<=rem;i++)
						{
							multi=i*multi;

						}
							sum=sum+multi;
					}
						if(sum==j)
						System.out.println( j);
				}
				break ;
				case 5:
				for(j=1;j<=limit;j++)
				{
					temp=j;
					count=0;
					
					for(;temp!=0;temp/=10)
					{
						count++;
					}
					temp=j;
					
					sum=0;
					for(;temp!=0;temp/=10)
					{
						rem=temp%10;
						power=1;
						for(i=1;i<=count;i++)
						{
							power=power*rem;
						}
						sum=sum+power;
					}
					if(sum==j)
					{
						System.out.println(j);
					}
				}
				break ;
				
			}
			System.out.println("you want to continue(y/Y)");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}