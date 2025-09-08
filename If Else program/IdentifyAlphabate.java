import java.util.*;
public class IdentifyAlphabate
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
	if(ch>='a' && ch<='z')
		{
			System.out.println("Alphabate is small");
		}
		else
		{
			System.out.println("Alphabate is capital");
		}
	}
}