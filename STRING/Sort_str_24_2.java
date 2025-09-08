/*Q9.Java String Program to Sort a String
1234567890-=qwertyuiopasdfghjkl[]\;'zxcvbnm,./!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:"ZXCVBNM<>?


!"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_abcdefghijklmnopqrstuvwxyz{|}
*/
import java.util.*;
public class Sort_str_24_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		s=new String(ch);
		System.out.println("\n\n"+s);
	}
}