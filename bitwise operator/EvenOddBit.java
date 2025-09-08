//program to check number is even or odd using bitwise opertator
import java.util.*;
public class EvenOddBit
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	//String result=(num & 1)== 0? "it is even":"it is odd";
	//System.out.println(result);
	if ((num & 1)== 0)
	{
		System.out.println("it is even");
	}
	else
	{
		System.out.println("it is odd   ");
	}
}
}
