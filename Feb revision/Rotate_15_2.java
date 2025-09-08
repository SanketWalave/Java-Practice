/*9. Rotate an Array
Write a program that rotates an array by k positions to the right or left.
Example: Rotate [1, 2, 3, 4, 5] by 2 positions → [4, 5, 1, 2, 3]
*/
import java.util.*;
public class Rotate_15_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		
		System.out.println("\nEnter rotation");
		int r=sc.nextInt();
		
		for(int i=0;i<r;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		System.out.println("\nenter second rotation");
		int r2=sc.nextInt();
		for(int i=0;i<r2;i++)
		{
			int temp2=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
				
			}
			a[0]=temp2;
		}
		System.out.println("Displaying array element");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
		/*for (int i = 0; i < k; i++) {
    int temp = a[0];  // Store the first element
    
    // Shift elements to the left by 1 position
    for (int j = 0; j < a.length - 1; j++) {
        a[j] = a[j + 1];
    }
    
    // Place the first element at the last position
    a[a.length - 1] = temp;
}
*/
		
		
	}
}