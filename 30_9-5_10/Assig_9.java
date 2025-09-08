import java.util.*;
public class Assig_9
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("enter number");
			int num=sc.nextInt();
			System.out.println(" enter your choice");
			System.out.println("1.Armstrong number");
			System.out.println("2.Happy number");
			System.out.println("3.spy number");
			System.out.println(" 4.neon number");
			int choice=sc.nextInt();
			int temp,count,i,rem,power,sum,square;
			switch (choice)
			{
				case 1:
				temp=num;
				count=0;
				for(;temp!=0;temp/=10)
				{
					count++;
				}
				System.out.println(count);
				temp=num;
				rem=0;
				
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
					System.out.println(sum);
					
				}
				if(sum==num)
					System.out.println("Armstrong number");
				else
					System.out.println(" not Armstrong number");
				break;
				case 2:
				/*
				 temp=num;
				 rem=1;
				 int result=0;
				 boolean flag=false;
				 int n;
				 while(n!=1 && n!=4)
				 {
				  for(;temp>0;temp/=10)
				  {
					  
					 rem=temp%10;
					 result=result+rem*rem;
					 if(result==1)
					 {
						 flag=true;
						 break ;
					 }
					 else if(result==4)
					 {
						 flag =false;
						 break;
					 }
				  }
				  n=result;
				 }
				 if(flag)
					 System.out.println("happy number");
				 else
					 System.out.println(" not happy number");
				 */
				 break;
				 case 3:
				    temp=num;rem=1;sum=0;
					
					for(;temp!=0;temp/=10)
					{
						rem=temp%10;
						sum=sum+rem;
						
					}
					System.out.println(sum);
					temp=num;
					int multi=1;
					for(;temp!=0;temp/=10)
					{
						rem=temp%10;
						multi=multi*rem;
					}
					System.out.println(multi);
					if(sum==multi)
						System.out.println("number is spy number");
					else
						System.out.println("number is not spy number");
					break ;
					
				 case 4:
				 square=num*num;
				 temp=square;
				 rem=1;
				 sum=0;
				 for(;square!=0;square/=10)
				 {
					rem=square%10;
					sum=sum+rem;
				 }
				 if(sum==9)
					 System.out.println("number is neon");
				 else
					 System.out.println("number is not neon");
				 break ;
				
			}
			System.out.println("you want to continue again(y/Y)");
			ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	}
}

