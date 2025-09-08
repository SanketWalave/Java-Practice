import java.util.*;
public class FrequencyOfNumberInDigit1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=0,num1,freq=0,count,temp,rem;
		temp=num;
		while(i<=9)
		{
			count=0;
			num=temp;
			while(num>0)
			{
				rem=num%10;
				if(rem==i)
					count++;
				num=num/10;
			}
			if(count>0)
			{
		       System.out.println("frequency of "+i+"is "+ count);
			}
          i++;			
		}
	}
	
}