import java.util.*;
public class Array_Size
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int end=a.length-1;
		System.out.println("display array element");
		for(int i=0;i<a.length;i++)
		{
			if(i<=2)
			{
				end--;
			}
			System.out.println("\t"+a[i]);
		}
		int b[]=new int[end];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=b[i];
			if(i==b.length-1)
				break;
		}
		a=b;
		System.out.println("display array element");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("\t"+a[i]);
		}
	}
}

/* git init
git add .
git commit -m "Initial commit - Hibernate Practice Project"
git branch -M main
git remote add origin https://github.com/SanketWalave/Java-Practice.git
git push -u origin main*/