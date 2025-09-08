/*Check if an array is sorted
Determine if the given array is sorted in ascending or descending order.
*/
import java.util.*;
public class Check_Sort_6_3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={1,1,1,1,5,5};
		boolean flag=true;
		boolean flag2=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				flag=false;
				//break;
			}
			if(a[i]<a[i+1])
			{
				flag2=false;
				//break;
			}
		}
		if(flag || flag2)
			System.out.println("Sorted");
		else
			System.out.println(" not Sorted");
	}
}