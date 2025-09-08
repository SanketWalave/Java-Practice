import java.util.*;
abstract class Value
{
	protected int num;
	void setValue(int num)
	{
		this.num=num;
	}
	abstract int getResult();
}
class SumOfDigit extends Value
{
	int getResult()
	{
		int sum=0;
		for(;num>0;num/=10)
		{
			int rem=num%10;
			sum+=rem;
		}
		
		return sum;
	}
	
} 

class Factorial extends Value
{
	int getResult()
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
class NumOperation
{
	void generateResult(Value v)
	{
		System.out.println("Result is ="+v.getResult());
	}
}

public class NumberOperation_LoosC
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		 
		  NumOperation n=new NumOperation();
		  Value v1=new SumOfDigit();
		  System.out.println("Enter number for finding sum of digit");
		  int num1=sc.nextInt();
		  v1.setValue(num1);
		  n.generateResult(v1);
		  v1=new Factorial();
		  System.out.println("Enter number for factorial");
		  int num2=sc.nextInt();
		  v1.setValue(num2);
		  n.generateResult(v1);
	}
}