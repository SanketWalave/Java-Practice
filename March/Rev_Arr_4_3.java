import java.util.*;
public class Rev_Arr_4_3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter element");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int mid=a.length/2;
		int end=a.length-1;boolean flag=true;
		int sum=0;
		//for(int i=0;i<mid;i++)
		for(int i=0;i<a.length;i++)
		{
			/*int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;*/
			/*if(a[i]!=a[end])
			{
				flag=false;
				System.out.println("Array not palidrome");
				break;
			}
			end--;*/
			sum+=a[i];
		}
		//if(flag)
		//	System.out.println("palidrome array");
		System.out.println("sum "+sum);
		System.out.println("Array");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a[i]);
	}
}