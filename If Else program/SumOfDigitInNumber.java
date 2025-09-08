import java.util.*;
public class SumOfDigitInNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  three digit number ");
		int num=sc.nextInt();
		int sum1 = (num%10);
        int sum2= ((num/10)%10);
        int sum3= ((num/100)%10);
        int sum4= ((num/1000)%10);
         int sum5=(num/10000);
		 int totalsum=sum1+sum2+sum3;
		 System.out.println(sum1);
		 System.out.println(sum2);
		 System.out.println(sum3);
		 System.out.println(sum4);
		 System.out.println(sum5);
		// System.out.println(totalsum);
		// String result=
		// totalsum%2==0?"sum is even":"sum is odd";
		// System.out.println(result);
		if(totalsum%2==0)
		{
			System.out.println("sum is even ");
		}
		else
		{
			System.out.println("sum is odd");
		}
	}
}