/*Q4.Java String Program to Check Anagram

Input: str1 = "Listen" 
       str2 = "Silent"

Output: Yes

Explanation: A string is called Anagram of other string when the it contains the same characters, only the order of
 characters can be different.
                        Example Listen ->  E:1 , I:1 , L: 1 , N:1 , S:1 , T:1  
                                         Silent ->  E:1 , I:1 , L: 1 , N:1 , S:1 , T:1  

                        As the occurence of elements are same in both the String hence they are anagram of each other.
*/
import java.util.*;
public class Anagram_str_24_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);System.out.println("Entr first string");
		String s1=sc.nextLine();
		//sc.next();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		
		if(s1.length()==s2.length())
		{
			char ch1[]=new char[s1.length()];
			char ch2[]=new char[s2.length()];
			
			for(int i=0;i<ch1.length;i++)
				ch1[i]=s1.charAt(i);
			
			for(int i=0;i<ch2.length;i++)
				ch2[i]=s2.charAt(i);
			
		boolean flag2=true;
			for(int i=0;i<ch1.length;i++)
			{
				boolean flag=true;
				for(int j=0;j<ch2.length;j++)
				{
					if(ch1[i]==ch2[j])
					{
						flag=false;
					}
				}
				if(flag)
				{
					System.out.println("not anagram");
					flag2=false;
					break;
				}
			}
			if(flag2)
				System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
	}
}