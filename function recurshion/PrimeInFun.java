import java.util.*;
public class PrimeInFun
{
	static int i=1,count=0;
	static boolean flag;
	public static void main(String x[])  
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int no=sc.nextInt();
		 boolean res=prime(no);
		 System.out.println(flag);
	}

public static boolean prime(int num)
		{
			flag=false;
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
}