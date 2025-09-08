import java.util.*;
public class ReverseNumApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int rev = 0;
		for(;num != 0;num /= 10)
		{
			int rem = num % 10;
			rev = (rev *10)+rem;
			
		}
		System.out.println("----->"+rev);
	}
}