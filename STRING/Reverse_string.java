import java.util.*;
public class Reverse_string
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		s=s+" ";
		int len=s.length();
		String word="";
		
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			//System.out.println(ch);
			if(ch!=32)
			{
				word+=ch;
			}
			else
			{
				
				int len2=word.length();
				
				char c[]=new char[len2];
				int mid=c.length/2,end=c.length-1;
				for(int j=0;j<c.length;j++)
				{
					c[j]=word.charAt(j);
				}
				for(int k=0;k<mid;k++)
				{
					
					char temp=c[k];
					c[k]=c[end];
					c[end]=temp;
					end--;
				}
				for(int j=0;j<c.length;j++)
					System.out.print(c[j]);
				
				System.out.print(" ");
				word="";
			}
		}
		
		
	}
}