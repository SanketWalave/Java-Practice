/*2. Find the Second Largest Element in an Array
-  Write a class to write a method to find the second largest element in an integer array.
 Explanation: Practice logic building and conditional checks.
*/
import java.util.*;
public class Second_Largest_14_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]={10,20,30,40,50};
		
		int largest=1,slargest=1;
		
		
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>largest)
				{
					
					slargest=largest;
					largest=a[j];
				}
				else if(a[j]>slargest && a[j]>slargest)
				{
					slargest=a[j];
				}
				else{
					
				}
			}
		
		System.out.println(slargest);
	}
}