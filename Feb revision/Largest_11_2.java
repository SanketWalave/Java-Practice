/*9. Find the Largest Element in an Array
Write a program to find the largest element in an array of integers using a for loop.*/
public class Largest_11_2
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max in array   "+max);
	}
}