/*7. Multiplication Table
Write a program to print the multiplication table of a given number using a for loop.*/
import java.util.*;
public class Mul_table_11_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int i=1;i<=10;++i)
		{
			System.out.println(num*i);
		}
	}
}