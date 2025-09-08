import java.util.*;
public class Sum_30
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==10)
			{
				sum+=a[i];
			}
		}
		if(sum==30)
			System.out.println("\ntrue");
		else
			System.out.println("\nfalse");
	}
}