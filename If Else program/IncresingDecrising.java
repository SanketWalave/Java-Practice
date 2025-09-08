import java.util.*;
public class IncresingDecrising
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
	/*	String result=
		num1<num2 && num2<num3?"increasing order":
		num1>num2 && num2>num3?"decrising order":
		"not in order";
		System.out.println(result);*/
		if(num1<num2 && num2<num3)
		{
			System.out.println("increasing order");
		}
		 else if(num1>num2 && num2>num3)
		{
			System.out.println("decrising order");
		}
		else
		{
			System.out.println("not in order");
		}
	}
}