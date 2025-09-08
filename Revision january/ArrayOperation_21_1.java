/*1. Write Program to perform method overriding you have to create class name as ArrParent 
with method void setValue(int arr[]): this method can accept array as parameter void arrangeSeq():
 this method can display array as per user input sequence You have to create
 two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and
 override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and 
 you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and
 reverse array and display it.
*/
class ArrParent
{
	protected int a[];
	void setValue(int a[])
	{
		this.a=a;
	}
	void arrangeSeq()
	{
		
	}
}
class ArrangeAscendingOrder extends ArrParent
{
	void arrangeSeq()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("Array assanding");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
	}
}
class ReverseArray extends ArrParent
{
	void arrangeSeq()
	{
		int mid=a.length/2;
		int end=a.length-1;
		for(int i=0;i<mid;i++)
		{
			int temp=a[end];
			a[end]=a[i];
			a[i]=temp;
			end--;
			
			
		
		}System.out.println("\nArray reverse");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
	}
}
public class ArrayOperation_21_1
{
	public static void main(String x[])
	{
		int a[]={1,2,5,7,4,8,9,10};
		int b[]={10,9,8,7,6,5,4,3,2,1};
		
		ArrangeAscendingOrder ars=new ArrangeAscendingOrder();
		ars.setValue(a);
		ars.arrangeSeq();
		
		ReverseArray ra=new ReverseArray();
		ra.setValue(b);
		ra.arrangeSeq();
	}
}