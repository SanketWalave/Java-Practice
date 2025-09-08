import java.util.*;
abstract class Calculation
{
	protected int x,y;
	void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public abstract void operation();
	
}
class Add extends Calculation
{
	public void operation()
	{
		System.out.println("Addition is: "+(x+y));
	}
}
class Mul extends Calculation
{
	public void operation()
	{
		System.out.println("Multiplication is: "+(x*y));
	}
}
class Divide extends Calculation
{
	public void operation()
	{
		System.out.println("Dividation is: "+(x/y));
	}
}
public class Calculation_Abst
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		 
		Calculation c=new Add();
		c.setValue(5,4);
		c.operation();
		
		c=new Mul();
		c.setValue(10,2);
		c.operation();
		
		c=new Divide();
		c.setValue(10,2);
		c.operation();
	}
}