import java.util.*;
public class Palidrome_str
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String s=sc.nextLine();
		String temp=s;
		char c[]=new char[s.length()];
		int mid=c.length/2,end=c.length-1;
		for(int j=0;j<c.length;j++)
		{
		    c[j]=s.charAt(j);
		}
		for(int k=0;k<mid;k++)
		{
			
			char temp2=c[k];
			c[k]=c[end];
			c[end]=temp2;
			end--;
		}
          s="";		
		for(int i=0;i<c.length;i++)
		{
			s+=c[i];
		}
			if(s.equals(temp))
				System.out.println("palidrome");
			else
				System.out.println(" not palidrome");
	}
}