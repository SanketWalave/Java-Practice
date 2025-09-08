import java.util.*;
public class FrequencyOfNumberApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int rem=0 ,count=0 ,temp=num;
		for(int i=0;i<=9;i++)
		{
			count=0;
			num=temp;
			for(;num>0;num/=10)
			{
				rem=num%10;
				if(rem==i)
					count++;
				
			}
			if(count>0)
			{
		       System.out.println("frequency of "+i+"is "+ count);
			}
          		
		}
	}
}