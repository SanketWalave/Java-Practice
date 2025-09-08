/*Q1. WAP to class name as Sort with two methods 
void acceptArray(int a[]): this function is used for accept array as parameter
Void sortArray(): this function can sort array and display it.
*/
import java.util.*;
class Sort
{
	private int a[];
	void acceptArray(int arr[])
	{
		a=arr;
	}
	void sortArray()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.printf("Display array element after Sorting\n");
		for(int i=0;i<a.length;i++)
			System.out.printf("\t%d",a[i]);
	}
}
public class SortArray_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter arra size-->\t");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter array element\n");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Sort s=new Sort();
		s.acceptArray(arr);
		s.sortArray();
		
		
	}
}