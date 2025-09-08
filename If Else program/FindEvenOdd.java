import java.util.*;
public class FindEvenOdd
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number");
		int num;
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number  is even");
		}
		
	    else{
			System.out.println("numbers is odd");
		}
	}
}