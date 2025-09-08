//1.Write a c program to check whether number is palindrome or not using while loop
import java.util.*;
public class PalidromeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int i=1,temp=num,rev=0;
		while(temp>0)
		{
			int rem=temp%10;
			//rev=rev*10+rev;
			rev = (rev *10)+rem;
			temp/=10;
		}
		if(rev==num)
			System.out.println("\t\tnumber is palidrome");
		else
			System.out.println("\t\tnumber is not  palidrome");
	}
}