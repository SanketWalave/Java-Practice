/*Q1. WAP  to create class name as NumberOperation using constructor overloading

NumberOperation(int no): this constructor accept the number as parameter
NumberOperation(int base,int index): this constructor accept the two values first is base and second is index 
int getFactorial(): this function can calculate the factorial of number and return it
int getPower(): this function can calculate the power of a number and return it.
*/
class NumberOperation
{
	private int num;
	private int base,index;
	NumberOperation(int num)
	{
		this.num=num;
	}
	NumberOperation(int base,int index)
	{
		this.base=base;
		this.index=index;
	}
	int getFactorial()
	{
		int mul=1;
		for(int i=1;i<=num;i++)
		{
			mul=mul*i;
		}
		return mul;
	}
	int getPower()
	{
		int power=1;
		for(int i=1;i<=index;i++)
		{
			power=power*base;
		}
		return power;
	}
}

public class NumberOperation_cun
{
	public static void main(String x[])
	{
		NumberOperation n=new NumberOperation(5);
		int factorial=n.getFactorial();
		System.out.println("\t\t"+factorial);
		
		NumberOperation n1=new NumberOperation(5,5);
		int pow=n1.getPower();
		System.out.println("\t\t"+pow);
	}
}