import java.util.*;
public class Arithmatic_exp_12_3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.println("Enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		/*catch(Exception ex)
		{
			System.out.println(ex);
		}*/
		System.out.println("logic 1");
		System.out.println("logic 2");
		System.out.println("logic 3");
	}
}