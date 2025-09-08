/*1. Maximum Sum Subarray of Size K
Problem: Given an array of integers and a number K, find the maximum sum of any contiguous subarray of size K.
Example:
arr = [2, 1, 5, 1, 3, 2], K = 3
Output: 9 (subarray [5, 1, 3])
*/
import java.util.*;
public class SubArray_sum_16_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		// size=sc.nextInt();
		int a[]={2, 1, 5, 1, 3, 2};
		int b[]=new int[0];
		System.out.println("Enter expected size of subarray ");
		int k=3;//sc.nextInt();
		int sum2=0;
		for(int st=0;st<=a.length-k;st++)
		{
			for(int end=st+1;end<=a.length;end++)
			{
				int sum1=0,count=0;
				for(int i=st;i<end;i++)
				{
					sum1+=a[i];
					count++;
				}
				if(sum1>sum2 && count==k)
				{
					sum2=sum1;
					b=new int[k];
					for(int i=st;i<end;i++)
					{
						b[i-st]=a[i];
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("Max sum "+sum2+" of size  "+k);
		for(int i=0;i<b.length;i++)
		{
			System.out.print("\t"+b[i]);
		}
	}
}