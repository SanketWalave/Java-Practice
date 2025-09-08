/*5. Check If Array is Sorted
Write a Java program that checks whether a given array of integers is sorted in ascending order.
Example: [1, 2, 3, 4] → True, [4, 3, 1, 2] → False

*/
import java.util.*;
public class ChecSorted_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		
		boolean flag=true;
		boolean flag2=true;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				flag=false;
				break;
			}
		
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				flag2=false;
				break;
			}
		
		}
		if(flag)
			System.out.println("\nArray is ascending sorted");
		else if(flag2)
			System.out.println("\nArray is  desending sorted");
		else
			System.out.println("\nArray is not sorted");
	}
}