import java.util.*;
public class Reverse_1_25
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		System.out.print("size= ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Eneter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display elements in array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		int end=a.length-1;
		int mid=a.length/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		System.out.println("\ndisplay elements of array after reverse");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
}