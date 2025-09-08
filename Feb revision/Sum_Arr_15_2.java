/*3. Sum of All Elements in an Array
Write a program that calculates the sum of all the elements in an array.
Example: [10, 20, 30] → Sum: 60
*/
import java.util.*;
public class Sum_Arr_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sizeof array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elment in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		
		System.out.println("\n sum of array element  "+sum);
	}
}