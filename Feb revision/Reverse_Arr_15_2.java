/*2. Reverse an Array
Implement a program to reverse an array without using any built-in reverse method.
Example: [1, 2, 3, 4, 5] → Reversed: [5, 4, 3, 2, 1]
*/
import java.util.*;
public class Reverse_Arr_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array\n");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Displaying before reverse");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		int end=a.length-1,mid=a.length/2;
		
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		System.out.println("\nDisplaying before reverse");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
}