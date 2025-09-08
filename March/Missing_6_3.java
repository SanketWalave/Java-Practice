/*Find the missing number in an array
Given an array of size n-1 with numbers from 1 to n, find the missing number.
*/
import java.util.*;
public class Missing_6_3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("array");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];a[i]=a[j];a[j]=temp;
				}
			}
		}
		
		System.out.println("\n missing elements");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print("\t"+j);
			}
		}
	}
}