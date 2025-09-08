//Find the largest and smallest element in an array
//Write a program to find the maximum and minimum value in an unsorted array.

import java.util.*;
public class Lar_aR_5_3
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
		
		int m=a[0],s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>m)
			{
				m=a[i];
			}
			if(a[i]<s)
			{
				s=a[i];
			}
		}
		System.out.println("Max    "+m);
		System.out.println("small  "+s);
	}
}