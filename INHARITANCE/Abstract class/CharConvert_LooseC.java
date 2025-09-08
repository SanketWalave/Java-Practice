import java.util.*;
abstract class CharParent
{
	protected char ch[];
	void setChar(char ch[])
	{
		this.ch=ch;
	}
	abstract char [] getResult();
}
class Toupper extends CharParent
{
	char [] getResult()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<='z' && ch[i]>='a')
			{
				ch[i]=(char)(ch[i] - 32);
			}
		}
		return ch;
	
	}
}
class Reverse extends CharParent
{
	char [] getResult()
	{
		int end=ch.length-1;
		int mid=ch.length/2;
		int start=0;
		for(;start<mid;end--)
		{
			char temp=ch[end];
			ch[end]=ch[start];
			ch[start]=temp;
			start++;
		}
		return ch;
	}
}
class CharHelp
{
	void PerformOperation(CharParent cp)
	{
		char c[]=cp.getResult();
	  for(int i=0;i<c.length;i++)
		{
			System.out.print("\t"+c[i]);
			
		}
	}
}
public class CharConvert_LooseC
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter character array");
		char ch[]=new char[5];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
			
		}
		
		CharHelp cha=new CharHelp();
		CharParent cp=new Toupper();
		cp.setChar(ch);
		cha.PerformOperation(cp);
		System.out.println();
		System.out.println(" enter character array");
				char chd[]=new char[5];
		for(int i=0;i<chd.length;i++)
		{
			chd[i]=sc.next().charAt(0);
			
		}
		cp=new Reverse();
		cp.setChar(chd);
		cha.PerformOperation(cp);
		
	}
}