/*Q3. Java String Program to Remove Leading Zeros

Input: 000012356098


Output: 12356098

Your Task is you have to create class ame as RemoveLeadingZero with two methods 
void  setString(String str): this method can accept string as parameter 
void removeLeadingZero(): this function can remove the learning zero from string  
*/
import java.util.*;
class RemoveLeadingZero
{
	private String s;
	void setString(String s)
	{
		this.s=s;
	}
	void removeLeadingZero()
	{
		System.out.println(s);
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			char c=s.charAt(i);
			ch[i]=c;
		}
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]=='0' && ch[i+1]=='0')
			{
				ch[i]='.';
				ch[i+1]='.';
			}
		}
		s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='.')
			{
				continue;
			}
			s+=ch[i];
		}
		
		System.out.println(s);
	}
}
public class Remove_0_str_20_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		RemoveLeadingZero rlz=new RemoveLeadingZero();
		rlz.setString("000012356098");
		rlz.removeLeadingZero();
	}
}