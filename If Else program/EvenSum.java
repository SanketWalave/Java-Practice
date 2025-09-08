import java.util.*;
public class EvenSum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		String result=(sum%2)==0?"sum is even":"sum is odd";
		System.out.println(result);
	}
}