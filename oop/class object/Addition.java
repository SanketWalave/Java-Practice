import java.util.*;
class AddApp

{
	private int a,b,c;
	private Scanner sc=new Scanner(System.in);
	
	void setValue()
	{
		System.out.println("Enter numbers");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void sum()
	{
		c=a+b;
		System.out.println("Sum is-->"+c);
	}
}
public class Addition
{
	public static void main(String x[])
	{
		AddApp ad=new AddApp();
		ad.setValue();
		ad.sum();
	}
}
