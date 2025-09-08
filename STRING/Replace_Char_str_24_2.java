/*
Q7. Java String Program to Replace a Character at a Specific Index

Input: str = "JAVA IS FOOD Programming " , index = 8 , ch = 'G'

Output: "JAVA IS GOOD Programming"
*/
import java.util.*;
public class Replace_Char_str_24_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("Enter endex less than "+(s.length()-1));
		int index=sc.nextInt();
		System.out.println("Enter character to update");
		char c=sc.next().charAt(0);
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==index)
				ch[i]=c;
		}
		 s=new String(ch);
		 System.out.println(s);
	}
}