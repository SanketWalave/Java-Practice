/*2. Longest Substring Without Repeating Characters
Problem: Given a string, find the length of the longest substring that does not contain any repeating characters.
Example:
str = "abcabcbb"
Output: 3 (substring "abc")
*/
import java.util.*;
public class Long_sub_16_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		String str="";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			char ch=s.charAt(i);
			//System.out.print(ch);
			c[i]=ch;
		}
		
		System.out.println("String ");
		for(int i=0;i<c.length;i++)
		{
			String w=""+c[i];
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]!=c[j] && c[j-1]!=c[j])
				{
					w+=c[j];
				}
				else 
				{
					
					break;
				}
			}
			if(str.length()<w.length())
			{
				str=w;
				
			}
			w="";
		}
		System.out.println("Longest String  "+str);
	}
}