
/*Q2. Write a java program to pass the array function name as findMajority( ), if it's yes then 
return 1 otherwise return 0.*/
import java.util.*;
public class Mejority_fun
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr size of array");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		findMajority(b);
	}
	public static void findMajority(int a[])
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				  count++;
				}
			}
			if(count>=a.length/2)
			{
				
				flag=true;
				break ;
			}
		}
		if(flag)
			System.out.println("\n1");
		else
			System.out.println("\n0");
	}
}