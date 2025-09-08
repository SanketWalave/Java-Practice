import java.util.*;
public class Target_sum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display element in array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\n enter target sum");
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("a["+i+"] and a["+j+"] index");
					flag=true;
					break;
				}
				
			}
			if(flag)
					break;
		}
		
	}
}