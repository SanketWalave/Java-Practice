/*Find the second largest element in an array
Find the second largest element in an unsorted array.
*//*
2. Find the Second Largest Element in an Array
-  Write a class to write a method to find the second largest element in an integer array.
 Explanation: Practice logic building and conditional checks.
 /*int fmax=1,smax=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(fmax>a[i] && a[i]>smax)
			{
				smax=a[i];
			}
			else
			{
				
			}
		}
		/*
*/
import java.util.*;
public class Second_6_3
 {
	 public static void main(String arg[])
	 {
		 Scanner sc=new Scanner(System.in);
		 
		/* System.out.println("Enter size of array");
		 int size=sc.nextInt();
		if(size<2)
		{
			System.out.println("enter size greater than 2");
		}
 		else{
		 int a[]=new int[size];
		 System.out.println("Enter element into array");
		 for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}*/
		int a[]={6 ,4 ,3, 6 ,8 ,1 ,9 ,8};
			int first=a[0];
			int second=a[1];
		for(int i=0;i<a.length;i++)//6 4 3 6 8 1 9 8
		{
			if(first<a[i])
			{
				second=first;
				first=a[i];
			}
			else if(a[i]!=first && a[i]>second)
			{
				second=a[i];
			}
		}
		if(second==first)
		{
			System.out.println("All elements are same:");
		}
		else
		{	
		    System.out.println("Second largest number is:"+second);
		}	
	    }
}
 
 