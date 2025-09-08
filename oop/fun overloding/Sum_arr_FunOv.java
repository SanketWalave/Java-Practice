/*Q3. WAP to perform sum operation using overloading 
void calSum(int a[]): this function can accept integer array and calculate sum of all elements 
void calSum(char[]): this function can extract digit from character array and calculate its sum
Example:abc123mno
Output: 1+2+3 = 6 
*/
import java.util.*;
public class Sum_arr_FunOv
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("displaying array element");
		for(int i=0;i<b.length;i++)
		{
			System.out.print("\t"+b[i]);
		}
		
		calSum(b);
		
		char c[]=new char[size];
		System.out.println("Enter array element");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		System.out.println("displaying array element");
		for(int i=0;i<c.length;i++)
		{
			System.out.print("\t"+c[i]);
		}
		calSum(c);
	}
	public static void calSum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("\nsum of integer array-->"+sum);
	}
	public static void calSum(char a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=48 && a[i]<=57)
			{
				sum=sum+((int)a[i]-48);
			}
		}
		System.out.println("\nsum of integer array-->"+sum);
	}
}