import java.util.*;
public class ProductOfTwoNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
	    float num1=sc.nextInt();
	    float num2=sc.nextInt();
		float sum=num1*num2;
		String result=
		sum%2==0?"product is even":
		sum%2!=0?"product is odd":"0";
		System.out.println(result);
	}
}
