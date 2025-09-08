/*Q1. Write a program to create function name as 
void setOperation(int a[],int b[]): this function can accept two integer array and find the union of two array 
void setOperation(char a[],char b[]): this function can accept two character array ad find the union of character 
*/
import java.util.*;
public class Union_fun_over
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arrays");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		char ch1[]=new char[size];
		char ch2[]=new char[size];
		 setOperation(arr1,arr2);
	}
	public static void setOperation(int a[],int b[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second integer array element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		//mearge two arrays
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println("merge\t");
		for(int i=0;i<c.length;i++)
		{
			System.out.print("\t"+c[i]);
		}
		int len=c.length,count=0;
		for(int i=0;i<len;i++)//1  2 2 3 3  4 5 5 8
		{
			boolean flag=false;
			
			
				if(c[i]==c[i+1])
				{
					
					len--;
					flag=true;
					count++;
					
				}
				if(!flag)
				{
					System.out.print("\t"+c[i]);
				}
			
		}
		System.out.println("\n"+count);
		System.out.println("\nunion\t");
		for(int i=0;i<len;i++)
		{
			System.out.print("\t"+c[i]);
		}
	}
}