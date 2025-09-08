import java.util.*;
public class NonRepitingCh_str
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char c[]=new char[s.length()];
	
		char ch='0';
		for(int j=0;j<c.length;j++)
		{
		    c[j]=s.charAt(j);
		}
		
		for(int i=0;i<c.length;i++)
		{
			
				boolean flag=true;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j]&& i!=j)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				ch=c[i];
				break;
			}
		}
		System.out.println("non repitin character  "+ch);
	}
}