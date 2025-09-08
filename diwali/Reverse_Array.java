import java.util.*;
public class Reverse_Array
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		int length=a.length;
		int mid=length/2;
		int end=length-1;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		System.out.println("\nDisplaying reverse array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
}