import java.util.*;
public class NumAdd_str
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		int len=s.length(),sum=0;
		
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			//System.out.println(ch);

			
			if(ch>=49 && ch<=57)
			//if(ch>='1' && ch<='9')
			{
				sum=sum+(ch-'0');
			}
			
		}
		System.out.println(sum);
	}
}