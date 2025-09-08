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
		int a[]={1,2,3,4,5,6};
		
		for(int st=1;st<=a.length;st++)
		{
			for(int end=st;end<=a.length;end++)
			{
				for(int i=st;i<end;i++)
				{
					System.out.print(a[i]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}