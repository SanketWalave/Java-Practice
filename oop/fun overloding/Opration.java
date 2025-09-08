import java.util.*;
public class Opration
{
	public static void main(String x[])
	{
		int a[]=new int[3];
		int b[]=new int[3];
		char m[]=new char[3];
		char n[]=new char[3];
		setOperation(a,b);
		setOperation(m,n);
	}
	public static void setOperation(int a[],int b[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the 2nd number");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Union of Array a&b is=");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"  ");
		}
		for(int i=0;i<b.length;i++)
		{
			boolean isDuplicate=false;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate)
				System.out.println(b[i]+" ");
		}
	}

	
	public static void setOperation(char m[],char n[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		for(int i=0;i<m.length;i++)
		{
			m[i]=sc.next().charAt(0);
		}
		System.out.println("enter the 2nd element");
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.next().charAt(0);
		}
		System.out.println("Union of array m&n");
		for(int i=0;i<m.length;i++)
		{
			System.out.println(" "+m[i]);
		}
		for(int i=0;i<n.length;i++)
		{
			boolean isDuplicate=false;
			for(int j=0;j<m.length;j++)
			{
				if(n[i]==m[j])
				{
					isDuplicate=true;
					break;
					
				}
			}
			if(!isDuplicate)
				System.out.println(n[i]+"  ");
		}
	}
}