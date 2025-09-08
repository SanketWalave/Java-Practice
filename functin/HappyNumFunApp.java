import java.util.*;
public class HappyNumFunApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		happy(no);
	}
	public static void happy(int num)
	{
		int i,j,temp,sum=0,rem=0;
		temp=num;
		for(;temp!=0;temp/=10)
		{
			rem=temp%10;
			sum=rem*rem;
			if(sum!=num)
		   {
			
			   for(;sum!=0;)
		     {
			   int rem1=sum%10;
			   sum=rem1*rem1;
			     
			    if(sum==1)
		        {
			      System.out.println("happy Number");
				  break;
		         }
			   else  if(sum==4)
			   {
				   System.out.println(" it is not happy Number");
				   break;
			   }
		      }

		    }
		}
		
		
	}
}