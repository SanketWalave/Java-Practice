import java.util.*;
public class PrimeNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
	//	String result=(num/1==num) && (num/num==1)?"Prime":"not Prime";
	//	System.out.println(result);
		if(num%2==0 || num%3==0 )
		{
			System.out.println("number is not  prime");
		}
		else //if((num/1==num) && (num/num==1))
		{
			System.out.println("number is  prime");
		}
	}
}
