import java.util.*;
public class Cal_vowel_spSy
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		int len=s.length(),vowel=0,conso=0,sp=0,num=0;
		
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			
			if((ch<='z' && ch>='a' )||(ch>='Z' && ch>='A'))
			{
				if(ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U'||ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u')
				{
					vowel++;
				}
				else
				{
					conso++;
				}
			}
			else if(ch>='0' && ch<='9')
			{
				num++;
			}
			else
			{
				sp++;
			}
		}
		System.out.println("vowels    \t"+vowel);
		System.out.println("consonont \t"+conso);
		System.out.println("numbers   \t"+num);
		System.out.println("special sy\t"+sp);
	}
}