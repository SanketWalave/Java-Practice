/*Q4. WAP to create class name as Min with two function 
Void setArray(int a[]): this function can accept array as parameter 
Int getMin(): this function can find the min value from array and return it
*/
import java.util.*;
class Minimum
{
	private int a[],min;
	void setArray(int arr[])
	{
		a=arr;
	}
	int getMin()
	{
		min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
}
public class Min_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Rnter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Minimum min=new Minimum();
		min.setArray(arr);
		int res=min.getMin();
			System.out.println("min is\t"+res);
		
	}
}