import java.util.*;
public class First_Capital_str
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[0]<='z' && c[0]>='a')
			{
				c[0]=(char)(c[0]-32);
			}
			else if(c[i]==32 && c[i+1]<='z' && c[i+1]>='a')
			{
				c[i+1]=(char)(c[i+1]-32);
			}
		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]);
	}
}