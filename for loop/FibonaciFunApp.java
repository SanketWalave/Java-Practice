import java.util.*;
public class FibonaciFunApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int l;
		l=sc.nextInt();
		fibo(l);
	}
	public static void fibo(int limit)
	{
		int i,j,f1=0,f2=1,fib;
		for(i=1;i<=limit;i++)
		{
			fib=f1+f2;
			f1=f2;
			f2=fib;
			System.out.println(fib);
		}
	}
}