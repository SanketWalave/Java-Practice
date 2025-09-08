import java.util.*;
public class GreaterNumber2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("number 1 is greater");
			}
		}
		if(num2>num1)
		{
			if(num2>num3)
			{
				System.out.println("number 2 is greater");
			}
		}
		if(num3>num1)
		{
			if(num3>num2)
			{
				System.out.println("number 3 is greater");
			}
		}
	}	
}	