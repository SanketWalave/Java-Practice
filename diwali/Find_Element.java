import java.util.*;
public class Find_Element
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Print array element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\nEnter search key");
		int skey=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==skey)
				flag=true;
		}
		if(flag)
			System.out.println("Search key Found");
		else
			System.out.println("Search key not Found");
	}
}