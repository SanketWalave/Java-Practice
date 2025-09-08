/*5. Vowel or Consonant
Description: Write a program that takes a character input from the user and checks if it is a vowel (a, e, i, o, u) or a consonant.
 Use if-else for this task.
Concepts Covered: if-else, character comparison, logical operators.*/
import java.util.*;
public class Vowel_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter alphabate");
		char ch=sc.next().charAt(0);
		if(ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U'||ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u')
			System.out.println("It's vowel");
		else
			System.out.println("It's consonant");
	}
}