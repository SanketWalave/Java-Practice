import java.util.*;
public class Move_0_to_end
{
	 public static void main(String x[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter size of array");
		 int size=sc.nextInt();
		 int a[]=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		int end=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=end;j>0;j--)
			{
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[end];
					a[end]=temp;
				}
			}
		}
		System.out.println("\ndisplay array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
	 }
}