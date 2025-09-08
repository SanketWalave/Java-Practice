/*1. Find the Largest and Smallest Element in an Array
Write a Java program to find the largest and smallest elements in an array of integers.
Example: [3, 5, 7, 2, 9] → Largest: 9, Smallest: 2
*/
import java.util.*;
public class Max_Min_Array_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array\n");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int max=1,min=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Max in array "+max);
		System.out.println("Min in array "+min);
	}
}