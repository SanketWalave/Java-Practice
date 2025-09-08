import java.util.*;
public class Kth_largest_30_1
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
		System.out.println("Displaying array");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);

		

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("\nDisplaying array after sorting");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		
		System.out.println("\nenter kth largest element to find");
		int k=sc.nextInt();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
				if(count==k)
				{
					System.out.println("k th largest element\t"+a[i]);
					break;
				}
				
			}
			else 
			{
				
			}
		

		
		}
}
}
