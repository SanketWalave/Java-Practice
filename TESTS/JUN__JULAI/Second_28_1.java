import java.util.*;
public class Second_28_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);

		int fmax=1,smax=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{

				smax=fmax;
				fmax=a[i];
			}
			else if(a[i] >smax && a[i]>smax)
			{
				smax=a[i];
			}
			else   
			{

			}
		}
		System.out.println("\n\tsecond higest\t"+smax);
	}
}