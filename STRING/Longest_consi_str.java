import java.util.*;
public class Longest_consi_str
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char c[]=new char[s.length()];
		char ch='a';
		int count1,count2;
		for(int j=0;j<c.length;j++)
		{
		    c[j]=s.charAt(j);
		}
		count2=0;
		for(int i=0;i<c.length;i++)
		{
			count1=0;
			
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count1++;
				}
				else if(c[i]!=c[j])
				{
					break;
				}
			}
			if(count1>count2)
			{
				count2=count1;
				ch=c[i];
				
			}
		}
		System.out.println("Longest consicative   "+ch+"  comes "+count2+" times");
	}
}