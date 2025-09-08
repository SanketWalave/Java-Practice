import java.util.*;
public class Character_check
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		/*String result=ch>65 && ch<122 ?"Alphabet":ch>'0' && ch<'9'?"number":"Symbol";
		System.out.println(result);*/
		if(ch>'a' && ch<'z'|| ch>'A'&&ch<'Z')
		{
			System.out.println("Alphabate");
		}
		 else if(ch>'0' && ch<'9')
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("symbol");
		}
	}
}