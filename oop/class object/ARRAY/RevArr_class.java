/*Q2. WAP to create class name as Rev with three functions 
Void setArray(int a[]): this function can accept array as parameter 
Void rev(): this function can reverse the array
Void display(): this function can display the array
*/
import java.util.*;
class Reverse
{
	private int a[];
	void setArray(int arr[])
	{
		a=arr;
	}
	void revA()
	{
		System.out.printf("display array before reverse\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("\t%d",a[i]);
		}
	    int mid,end;
		mid=a.length/2;
		end=a.length-1;
		for(int i=0;i<=mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
			
		}
	}
	void display()
	{
		System.out.printf("\ndisplay array after reverse\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("\t%d",a[i]);
		}
	}
}
public class RevArr_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter array size\n");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.printf("Enter array element\n");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Reverse rev=new Reverse();
		rev.setArray(arr);
		rev.revA();
		rev.display();
		
	}
}