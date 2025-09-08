import java.util.*;
public class FactorialOfNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=1;
		while(num>=1)
		{
			i*=num;
			num--;
		
			
		}
		System.out.println(i);
	}
}