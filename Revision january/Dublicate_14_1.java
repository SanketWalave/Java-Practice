/*1. Find Duplicates in an Array
Write a class to create a method to identify and display duplicate elements in an integer array.
Explanation: Practice nested loops to compare elements.*/
import java.util.*;
class Duplicates
{
	private int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
	int getDuplicate()
	{
		boolean flag=false;
		int dupli=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					
					 dupli=a[j];
				flag=true;
				break;
			}
			//if(flag)
			//	break;
		}
		return dupli;
	}
}
public class Dublicate_14_1 
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,30,40};
		
		Duplicates  d=new Duplicates();
		d.setArray(a);
		System.out.println("Dublicate element in array   "+d.getDuplicate());
	}
}