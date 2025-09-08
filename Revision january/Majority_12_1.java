//4. Write a java program to pass the array function name as findMajority( ), if it's yes then return 1 otherwise return 0.
import java.util.*;
public class Majority_12_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter size of array");
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
		int res=isMejority(a);
		System.out.println("\n\n\n\t  \t           "+res);
	}
	public static int isMejority(int a[])
	{
		int mejority=a.length/2,count=0;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=mejority)
				flag=1;
				break;
		}
		
		return flag;
	}
}