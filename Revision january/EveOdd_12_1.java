/*3. Write a java program to pass the array function name as findEvenOdd( ),
 then display the even and odd number in array.
*/

import java.util.*;
public class EveOdd_12_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter sixze of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" element in array");
		for(int i=0;i<a.length;i++)
		{
			
				System.out.print("\t"+a[i]);
			
		}
		findEvenOdd(a);
		
	}
	public static void findEvenOdd(int a[])
	{
		System.out.println("\nEven element in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print("\t"+a[i]);
			}
		}
		System.out.println("\nOdd element in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.print("\t"+a[i]);
			}
		}
	}
}