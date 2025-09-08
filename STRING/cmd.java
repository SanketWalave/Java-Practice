/*
Q12. 
Program to Extract Substring from a String with Equal 0, 1, and 2.
Input: str = “102100211”

Output: 5

Explanation: "102" , "021" , "210" , " 021" , "210021" these are combinations can be formed where the occurrence of 0 , 
1 and 2 all are equal.
*/
import java.util.*;
public class Substring_012_24_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s="102100211";//sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		char ch1[]=new char[0];
		int count=0;
		for(int st=0;st<ch.length;st++)
		{
			for(int end=st;end<ch.length;end++)
			{
				int count1=0;
				int count2=0;
				int count0=0;
				for(int i=st;i<=end;i++)
				{
					if(ch[i] =='1')
						count1++;
					else if(ch[i] =='2')
						count2++;
					else if(ch[i] =='0')
						count0++;
					
				}
				if(count1==count2 && count2==count0)
					count++;
				
				//System.out.print(" ");
			}
			//System.out.println();
		}
		System.out.println("count = "+count);
	}
}
