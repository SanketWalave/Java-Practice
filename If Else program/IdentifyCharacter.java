import java.util.*;
public class IdentifyCharacter
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
	if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("character is alphabate");
		}
		else if(ch>=0 && ch<=9)
		{
			System.out.println("Character is number");
		}
		else{
			System.out.println("character is special character");
		}
	}
}