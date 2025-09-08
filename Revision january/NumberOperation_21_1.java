/*2. Write Program to create abstract class name as Value with one abstract and one non abstract method
void setValue(int ,int): this is non abstract method with two parameter abstract int getResult(): 
this is abstract method and you have two child class name as Power and you have to override getResult() 
method in Power class and calculate power of two values and return it as well as SearchDigit and you have
 to override getResult() consider first parameter of setValue() is number and second parameter is digit and
 you have to search digit in number and return it and if digit not found return -1.
*/
abstract class Value 
{
	protected int a;
	protected int b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract int getResult();
}
class Power extends Value
{
	int getResult()
	{
		int power=1;
		for(int i=1;i<=b;i++)
		{
			power=power*a;
		}
		return power;
	}
}
class SearchDigit extends Value
{
	int getResult()
	{
		boolean flag=false;
		
		for(;a>0;a/=10)
		{
			int rem=a%10;
			if(rem==b)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			return 1;
		else 
			return -1;
	}
}
public class NumberOperation_21_1
{
	public static void main(String x[])
	{
		Power p=new Power();
		p.setValue(5,5);
		System.out.println("Power is \t"+p.getResult());
		
		SearchDigit sd=new SearchDigit();
		sd.setValue(12345,3);
		System.out.println("Digit found or not\t"+sd.getResult());
	}
}