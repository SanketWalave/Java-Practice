import java.util.*;
public class StringApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneer size of Array");
		int size=sc.nextInt();
		sc.nextLine();
		char a[]=new char[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine().charAt(0);
		}
		System.out.println("Enter skey");
		char skey=sc.nextLine().charAt(0);
		System.out.println("Displaying array");
		System.out.print("              ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==skey)
			{
				flag=false;
						System.out.print("              ");

				System.out.println("\n   "+a[i-1]+"     "+a[i+1]);
				break ;
			}
		}
		if(flag)
			System.out.println("\nSearch key not found");
		
	}
}