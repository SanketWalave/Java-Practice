/*Q3. Write a Java program to sort an array of positive integers from an array. In the sorted array the 
value of the first element should be maximum, the second value should be a minimum, third should 
be the second maximum, the fourth should be the second minimum and so on.
Original Array - [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
New Array - [100, 10, 90, 20, 80, 30, 70, 40, 60, 50]*/
import java.util.*;
public class Max_Min
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display Array element before swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\ndisplay Array element after swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		int end=a.length-1;
		int start=0;
		int b[]=new int[size];
		for(int i=1;i<b.length;i+=2)
		{
			b[i]=a[end];
			end--;
		}
		for(int i=0;i<b.length;i+=2)
		{
			b[i]=a[start];
			start++;
		}
		System.out.println("\n new array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print("\t"+b[i]);
		}

	}
}