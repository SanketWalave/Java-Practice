/*1) Add Zero to Start of Array
Write a Java program to take an array of integers as input and move all zeros to the start while maintaining the order of other elements.
Add Zero to End of Array
*/
import java.util.*;
public class Zero_Start_Array
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();  
		}
		int k=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]!=0)
				{
					
					a[k++]=a[i];
					
				}
		}
		while(k<a.length)
		{
			a[k++]=0;
		}
		System.out.println("Array after moving zero at End");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "); 
		}
		
		int j=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			
			if(a[i]!=0)
			{
				a[j--]=a[i];
			}
		}
		while(j>=0)
		{
			a[j--]=0;
		}
		System.out.println("Array after moving zero at Start");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "); 
		}
	}
}