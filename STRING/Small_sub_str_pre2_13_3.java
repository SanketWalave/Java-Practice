/*Q4. Smallest window in a String containing all characters of other String
Given two strings S (length m) and P (length n), the task is to find the smallest substring in S 
that contains all characters of P, including duplicates. If no such substring exists, return “-1”.
 If multiple substrings of the same length are found, return the one with the smallest starting index.
Examples: 
Input: S = “timetopractice”, P = “toc”
Output: toprac
Explanation: “toprac” is the smallest substring in which “toc” can be found.

Input: S = “zoomlazapzo”, P = “oza”
Output: apzo
Explanation: “apzo” is the smallest substring in which “oza” can be found.

Your Task: you have to create class name as SmallWindow with constructor and methods 
SmallWindow(String data): this function is used for accept string array as parameter 
String getSmallWindow(): this function can return the small window from the string.*/
import java.util.*;
class Sub_str
{
	private String str1;
	private String str2;
	public void setString(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	public void getSub_str()
	{
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		String w2="000000000000000000";

		for(int st=0;st<ch1.length;st++)
		{
			for(int end=st;end<ch1.length;end++)
			{
				String w="";
				for(int i=st;i<=end;i++)
				{
					w+=ch1[i];
					boolean flag=true;
					for(int j=0;j<ch2.length;j++)
					{
						if(ch1[i]==ch2[j])
						{
							flag=false;
							break;
						}
					}
					
					
				}
				char wa[]=w.toCharArray();
			if(ch2.length<wa.length)
			{
				boolean flag2=true;	
				for(int i=0;i<wa.length;i++)
				{
					boolean flag=true;
					for(int j=0;j<ch2.length;j++)
					{
						if(wa[i]==ch2[j])
						{
							flag=false;
							break;
						}
					}
					if(flag)
					{
						flag2=false;
						break;
					}
					w="";
					if(flag2)
					{
						w=new String(wa);
					}
				}
			}
				
				//System.out.print(" ");
			}
			if(w.length()<w2.length())
				{
					w2=w;
				}
			//System.out.println();
		}
		System.out.println(w2);
	}
	
}
public class Small_sub_str_pre2_13_3
{
    public static void main(String x[])
    {
        Sub_str s=new Sub_str();
		s.setString("sanket","as");
		s.getSub_str();
    }
}