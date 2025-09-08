import java.util.*;
public class FindNumber3Switch
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("check number is positive negative or zero");
		System.out.println("even or odd");
		System.out.println("find max between two");
		int choice=sc.nextInt();
		int num1,num2,number;
		switch (choice)
		{
			case 1:
			System.out.println("enter number");
			number=sc.nextInt();
			if(number>0)
			{
				System.out.println("number is positive");
			}
			else if(number<0)
			{
				System.out.println("number is negative");
			}
			else
			{
				System.out.println("number is zero");
			}
			break ;
			case 2:
			System.out.println("enter number");
			number=sc.nextInt();
			if(number%2==0)
			{
				System.out.println(" number is even");
			}
			else{
				System.out.println(" number odd");
			}
			break ;
			case 3:
			System.out.println("enter two number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			if(num1>num2)
			{
				System.out.println("first number is max");
			}
			else{
				System.out.println(" number 2 is max");
			}
		}
	}
}