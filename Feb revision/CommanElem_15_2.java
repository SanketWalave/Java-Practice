/*10. Find Common Elements in Two Arrays
Create a program that finds and prints common elements in two arrays.
Example: Array 1: [1, 2, 3, 4], Array 2: [3, 4, 5, 6] → Common: [3, 4]*/
import java.util.*;
public class CommanElem_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter first array Element");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter second array element");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
		System.out.println("Display first array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		
		System.out.println("\nDisplaying second array element");
		for(int i=0;i<b.length;i++)
			System.out.print("\t"+b[i]);
		
		System.out.print("\ncommon element in array --> ");
		boolean flag1=true;
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag1=false;
					flag=true;
					break;
				}
			}
			if(flag)
				System.out.print("\t"+a[i]);
			
		}
		if(flag1)
			System.out.println("No common element");
	}
}