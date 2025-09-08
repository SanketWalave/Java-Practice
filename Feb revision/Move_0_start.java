/*1) Add Zero to Start of Array

Write a Java program to take an array of integers as input and move all zeros to the start while maintaining the order of 
other elements.
Add Zero to End of Array

Implement a Java program that moves all zeros in an array to the end while keeping the order of non-zero elements unchanged.
*/
import java.util.*;
public class Move_0_start
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Array before operation");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		int start=0;
		int m=a.length-1;//6
		int count=0;
		for(int i=a.length-1;i>=0;i--)
		//for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				
				a[m--]=a[i];
				//start++;
			}
			else 
			{
				count++;
			}
			
		}
		System.out.println("\ncount = "+count);
		for(int i=0;i<count;i++)
		{
			a[i]=0;
		}
		 
		  
		System.out.println("\nArray aftr operation");
		for(int k=0;k<a.length;k++)
			System.out.print("\t"+a[k]);
		
	}
}
