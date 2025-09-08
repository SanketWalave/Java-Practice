import java.util.*;
public class FindPositiveNegative
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number");
		int num;
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Number  is positive");
		}
		
	    else{
			System.out.println("numbers is negative");
		}
	}
}