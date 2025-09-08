import java.util.*;
public class NumberInDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=0,num1;
		while(num!=0)
		{
			 num=num/10;
			i++;
		}
		System.out.println(i);
	}
}