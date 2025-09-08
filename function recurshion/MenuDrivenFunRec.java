import java.util.*;

public class MenuDrivenFunRec
{
	static int i=1,count=0,sum=0,rem=1,fact=1;
	static boolean flag;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your choice");
		System.out.println("1.prime number");
		System.out.println("2.perfect");
		System.out.println("3.duck");
		System.out.println("4.strong");
		System.out.println("5.Armstrong");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		    case 1:
		    { 
                   
		    System.out.println("enter number");
		    int no=sc.nextInt();
		    prime(no);
		    System.out.println(flag);
            }
			break ;	
		    case 2:
			{
				System.out.println("enter number");
		        int no=sc.nextInt();
		        boolean res=perfect(no);
		        System.out.println("number is perfect\n"+flag);
			}
			break;
			case 3:
			{
			   		System.out.println("Enter number");
		           int no=sc.nextInt();
		           boolean res=duck(no);
		        System.out.println("number is duck\n"+flag);
			}
			break ;
			case 4:
			{
			   System.out.println("Enter number");
		        int no=sc.nextInt();
		         boolean res=strong(no);
		       System.out.println("number is strong\n"+flag);	
			}
			break;
			   
		}
		
	}
	   
    
	public static boolean prime(int num)
		{
			
		    if(i<=num)
			{
				if(num%i==0)
				{
					count++;
				}
				i++;
				prime(num);
			}
            if(count ==2)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}	
             return flag;  					
		}
		public static boolean perfect(int num)
	{
		
		flag=false;
		if(i<num)
		{
			if(num%i==0)
			{
				sum+=i;
			}
			i++;
			perfect(num);
		}
		if(sum==num)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
		
	}
	public static boolean duck(int num)
	{
		if(num!=0)
		{
			rem=num%10;
			if(rem==0)
			{
				flag=true;
			}
			num/=10;
			duck(num);
		}
		return flag;
	}
	public static boolean strong(int num)
	{
		flag=false;
		int temp=num;
		if(num!=0)
		{
			rem=num%10;
			fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
			sum=sum+fact;
			System.out.println(sum);
			num/=10;
			strong(num);
		}
		if(sum==temp)
		{
			flag=true;
		}
		return flag;
	}
}