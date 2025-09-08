import java.util.*;
public class EvenOdd_Index_Sum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i+=2)
		{
			sum1+=a[i];
		}
		System.out.println("\nSum of even index element---->"+sum1);
		for(int i=1;i<a.length;i+=2)
		{
			sum2+=a[i];
		}
		System.out.println("\nSum of even index element---->"+sum2);
	}
}