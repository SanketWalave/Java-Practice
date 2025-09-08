/*Q3. Rearrange array element by sign 
Input:  1   2  3    - 4   -1   4
Output:  1 -4 2 -1 3 4  */
import java.util.*;
public class Rearrange_30_1
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

		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<0)
				{
					count++;
				}
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

		int end=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(i<=count && i%2==1)
			{

				int temp2=a[end];
				a[end]=a[i];
				a[i]=temp2;

				end--;
			}
		}

		System.out.println("\nDisplaying array after sorting");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
	}
}