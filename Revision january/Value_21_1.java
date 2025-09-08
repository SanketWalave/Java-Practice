/*Q1. Write a program to crate class name as Value with single function name as setValue(int,int)
 and we have to create three child classes name as Add with function int getAdd() ,
 Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is
 inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class
 and gitDiv() function return division of two values which Is inherited from Value class.
*/
class Values
{
	protected int a;
	protected int b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Add extends Values
{
	int getAdd()
	{
		return a+b;
	}
}
class Mul extends Values
{
	int getMul()
	{
		return a*b;
	}
}
class Div extends Values
{
	int getDiv()
	{
		return a/b;
	}
}
public class Value_21_1
{
	public static void main(String x[])
	{
		Add a=new Add();
		a.setValue(20,10);
		System.out.println("ADDITION\t"+a.getAdd());
		
		Mul m=new Mul();
		m.setValue(20,10);
		System.out.println("Multiplication\t"+m.getMul());
		
		Div d=new Div();
		d.setValue(20,10);
		System.out.println("DIVIDION\t"+d.getDiv());
	}
}