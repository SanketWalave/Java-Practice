/*8. Palindrome Checker
Write a program to check if a given string is a palindrome
 (reads the same backward and forward) using a for loop.
*/
import java.util.*;
public class Palindrome_11_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt(),temp=num,rem=1,rev=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		if(rev==temp)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
	}
}
	