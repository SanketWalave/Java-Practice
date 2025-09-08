import java.util.*;
public class Vowelornot1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
		{
			System.out.println("character is vowel");
		}
		else
		{
			System.out.println("Character is not vowel");
		}
	}
}