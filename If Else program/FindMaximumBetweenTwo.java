import java.util.*;
public class FindMaximumBetweenTwo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Number 1 is maximum");
		}
		else if(num1<num2)
		{
			System.out.println("Number 2 is maximum");
		}
	    else{
			System.out.println("numbers are same");
		}
	}
}