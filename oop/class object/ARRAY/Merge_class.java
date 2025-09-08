/*Q3. WAP to create class name as Merge with three functions 
Void acceptArray(int a[],int b[]): this function can accept two array as parameter
Void merge(): this function can merge two array with each other
Void display(): this function can display the array after merging 
*/
import java.util.*;
class Merge
{
	private int a[],b[],m[];
	void acceptArray(int arr1[],int arr2[])
	{
		a=arr1;
		b=arr2;
	}
	void merge()
	{
		m=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			m[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			m[k]=b[i];
			k++;
		}
		
	}	
	void display()
	{
		System.out.printf("Mearge array\n");
		for(int i=0;i<m.length;i++)
		{
			System.out.printf("\t%d",m[i]);
		}
	}
}
public class Merge_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first array size ");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter first array element ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.printf("enter second array size\n");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.printf("Enter first array element\n");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		Merge mer=new Merge();
		mer.acceptArray(arr1,arr2);
		mer.merge();
		mer.display();
	}
}