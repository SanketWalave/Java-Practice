import java.util.*;
public class DivisibleByFive
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
	    int number=sc.nextInt();
		int result=
		(number%5==0)?number*number*number:-1;
		System.out.println(result);
	}
}
