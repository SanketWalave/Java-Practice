//Find the largest and smallest element in an array
//Write a program to find the maximum and minimum value in an unsorted array.

import java.util.*;
public class Dublicate_4_3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		//int m=a[0],s=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" duplicate element");
				}
			}
		}
		
	}
}