/*4. Minimum Size Subarray Sum
Problem: Given an array of positive integers and a target sum S, find the length of the smallest contiguous
 subarray whose sum is greater than or equal to S.
Example:
arr = [2, 3, 1, 2, 4, 3], S = 7
Output: 2 (subarray [4, 3])
*/
import java.util.*;
public class Min_SubArry_sum_16_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter array size");
		//int size=sc.nextInt();
		int a[]={-2,1,-3,4,-1,2,1,-5,4 };
		//System.out.println("Enter sum");
//int s=7,count2=3;
//		int b[]=new int[2];
			int finalsum=0;		
		for(int st=0;st<a.length;st++)
		{
			
			for(int end=st;end<a.length;end++)
			{
				int sum=0;
				for(int i=st;i<end;i++)
				{
					System.out.print(a[i]);
					sum+=a[i];
					
					
				}
				
				if(sum>finalsum)
				{
					finalsum=sum;

				}
					
				
				System.out.println();
			}
			System.out.println();
			
		}
		System.out.println(finalsum);
	/*	System.out.println("min size array of target sum  "+s+"\n");
		for(int i=0;i<b.length;i++)
		{
			System.out.print("\t"+b[i]);
		}
*/			
	}
}
