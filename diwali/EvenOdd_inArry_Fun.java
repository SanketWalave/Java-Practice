import java.util.*;
public class EvenOdd_inArry_Fun
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("enter element in array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		findEvenOdd(b);
	}
	public static void findEvenOdd(int a[])
	{
		System.out.println("Even element in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print("\t"+a[i]);
		}
		System.out.println("\nodd element in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
				System.out.print("\t"+a[i]);
		}
	}
}