/*Q1. WAP to create class name as RevString with two functions
   void setString(String data): this function can accept string as parameter
   String getRevString(): this function can reverse the string and return it.
*/
import java.util.*;
public class Rev_string_19_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String s=sc.nextLine();
		
		
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			char c=s.charAt(i);
			ch[i]=c;
		}
		System.out.println("\t\t"+s);
		
		int end=ch.length-1;
		int mid=ch.length/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch[i];
			ch[i]=ch[end];
			ch[end]=temp;
			end--;
		}
		s="";
		for(int i=0;i<ch.length;i++)
		{
			s+=ch[i];
		}
		System.out.println("\t\t"+s);
	}
}