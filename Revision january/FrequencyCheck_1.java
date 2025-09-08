//Q3. Write a java program to frequency of each digit of a number.

import java.util.*;
public class FrequencyCheck_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int num=sc.nextInt();
		
		
		for(int i=0;i<=9;i++)
		{
			int temp=num,count=0;
			
			for(;temp>0;temp/=10)
			{
				int rem=temp%10;
				if(rem==i)
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(i +"   comes in number  "+count+"  times");
			}
		}
	}
}