import java.util.*;
public class Occurance_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		
		System.out.println("\nEnter value");
		int value=sc.nextInt(),oc=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(value==a[i])
			{
				oc++;
			}
		}
		if(oc==0)
		{
			System.out.println("Element not fond in array");
		}
		else
			System.out.println(" Element: "+ value +"--> Occurrences: "+oc);
	}
}