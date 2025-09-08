import java.util.*;
public class Rotate_Array_6_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		int n=a.length;
		System.out.println("\nEnter how meny times you want to rotate array");
		int r=sc.nextInt();
		r=r%n;
		for(int i=0;i<r;i++)
		{
			int temp=a[a.length-1];
			 
			 for(int j=a.length-1;j>0;j--)
			 {
				   a[j] = a[j - 1];
				
				
            }
			 //0 = 4;
            a[0] = temp;
		}
		System.out.println("display array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
}