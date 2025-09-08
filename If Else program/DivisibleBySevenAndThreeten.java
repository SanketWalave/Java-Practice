import java.util.*;
public class DivisibleBySevenAndThreeten
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
	    int number=sc.nextInt();
		int result=
		(number%7==0 && number%13==0)?number*2:-1;
		System.out.println(result);
	}
}
