import java.util.*;
class Array1
{
	
	private int a[];//=new int[5];
	void setSize(int size1)
	{
		a=new int[size1];
	}
	//private int a[]=new int[size];
	void getValue(int arr[])
	{
	
		for(int i=0;i<arr.length;i++)
			a[i]=arr[i];
	}
	int arrSum()
	{
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
public class Array_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size1=sc.nextInt();
		
		int arr[]=new int[size1];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Array1 ar=new Array1();
		ar.setSize(size1);
		ar.getValue(arr);
		int res=ar.arrSum();
			System.out.print("\n\t"+res);
	}
}