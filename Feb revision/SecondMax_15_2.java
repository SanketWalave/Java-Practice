/*8. Find the Second Largest Element in an Array
Write a program to find the second largest element in an array.
Example: [12, 35, 1, 10, 34, 1] → Second Largest: 34
*/
import java.util.*;
public class SecondMax_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arrary");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter elemnt in array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int fmax=1,smax=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(fmax>a[i] && a[i]>smax)
			{
				smax=a[i];
			}
			else
			{
				
			}
		}
		System.out.println(smax);
		
	}
}