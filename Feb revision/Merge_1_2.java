/*7. Merge Two Arrays
Implement a program that merges two arrays into one.
Example: Array 1: [1, 2, 3], Array 2: [4, 5, 6] → Merged: [1, 2, 3, 4, 5, 6]
*/
import java.util.*;
public class Merge_1_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter element in first array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter size of second array");
		int size2=sc.nextInt();
		
		int b[]=new int[size2];
		System.out.println("enter element in second array");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
		System.out.println("Displayint first array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		System.out.println("\nDisplaying second array element");
		for(int i=0;i<b.length;i++)
			System.out.print("\t"+b[i]);
		
		int k=0;
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		System.out.println("\nDisplayng merge array");
		for(int i=0;i<c.length;i++)
		{
			System.out.print("\t"+c[i]);
		}
	}
}
