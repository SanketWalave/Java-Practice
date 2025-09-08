import java.util.*;
public class Sort_Fun_over
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter integer array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		sort(arr);
		
		System.out.println("Enter character array element");
		
		char ch1[]=new char[size];
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().charAt(0);
		}
		System.out.println("Array element");
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print("\t"+ch1[i]);
		}
		sort(ch1);
		
	}
	public static void sort(int a[])
	{
		
		for(int i=0;i<=a.length;i++)
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
		System.out.println("\nArray after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
	}
	public static void sort(char a[])
	{
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nArray after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
}