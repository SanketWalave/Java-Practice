/*Q8. Java String Program to Remove Leading Zeros

Input: 000012356098

Output: 12356098

Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 
*/
import java.util.*;
public class Remove_lid_0_24_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println(s);
		char ch[]=s.toCharArray();
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