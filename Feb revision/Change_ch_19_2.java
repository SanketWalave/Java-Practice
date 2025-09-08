/*Q3. Java String Program to Replace a Character at a Specific Index
Input: str = "JAVA IS FOOD Programming " , index = 8 , ch = 'G'
Output: "JAVA IS GOOD Programming"
Your Task
You have to create class name as ReplaceChar with two methods 
  void setString(String data): this method can accept string type of data
  void insertCharIndex(int index,char ch): this function can insert character on specified data
*/
import java.util.*;
public class Change_ch_19_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println(s);
		int len=s.length()-1;
		System.out.println("enter endex of string to chenge less than "+len);
		int index=sc.nextInt();
		System.out.println("Enter update character");
		char up=sc.next().charAt(0);
		char ch[]=new char[len];
		for(int i=0;i<ch.length;i++)
		{
			char c=s.charAt(i);
			ch[i]=c;
		}
		for(int i=0;i<ch.length;i++)
		{
			if(i==index)
			{
				ch[i]=up;
			}
		}
		s="";
		for(int i=0;i<ch.length;i++)
			s+=ch[i];
		
		System.out.println(s);
		
	}
}