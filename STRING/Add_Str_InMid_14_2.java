/*
Q2. Java String Program to Insert a String into Another String

Input: originalString = "JavaLanguage", 
            stringToBeInserted = "is", 
            index = 4

Output: "JavaisLanguage"

Explanation: Adding the new String to orignal String at the index given.
*/
import java.util.*;
public class Add_Str_InMid_14_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter string to order");
		String mstr=sc.nextLine();
		
		//int index=mstr.length();
		System.out.println("Enter index to enter less than "+(str.length()-1));
		int index=sc.nextInt();
		String word="";
		String word2="";
		System.out.println(str);
		if(index ==0)
		{
			mstr+=str;
			System.out.println(mstr);
		}
		else{
		char ch[]=new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			
			if(i<=index)
			{
				word+=ch[i];
			}
			else{
				word2+=ch[i];
			}
		}
		str="";
		str=word+mstr+word2;
		System.out.println(str);
		}
	}
}