import java.util.*;
public class UpperLowerCaseLetter
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		//String result=ch> 	'A' && ch<'Z'? "UpperCase":"LowerCase";
		if(ch>'A'&&ch<'Z')
		{
		System.out.println("upper case");
		}
		else
		{
			System.out.println("lower case");
		}
	}
}