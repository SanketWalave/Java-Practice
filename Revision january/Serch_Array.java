import java.util.*;
public class Serch_Array
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
		System.out.println("Display array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\nEnter search key");
		int skey=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(skey==a[i])
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("search key found");
		else
			System.out.println("search key not found");
	}
}