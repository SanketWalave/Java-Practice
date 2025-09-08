/*Q2. WAP to class name as MergeArray with two constructors 

MergeArray(int a[],int b[]): this constructor can accept two array of type integer
MergeArray(char ch[],char b[]): this constructor can accept the array of type integer

int [] getIntMergeArray(): this function merge two array of integer and return third resultant array
char [] getCharMergeArray(): this function merge two character array and return third resultant array

*/
import java.util.*;
class MergeArray
{
	private int a[],b[];
	private char ch1[],ch2[];
	MergeArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	MergeArray(char ch1[],char ch2[])
	{
		this.ch1=ch1;
		this.ch2=ch2;
	}
	int [] getIntMergeArray()
	{
		int m[]=new int [a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			m[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			m[k]=b[i];
			k++;
		}
		return m;
	}
	char [] getCharMergeArray()
	{
		char m[]=new char[ch1.length+ch1.length];
		int k=0;
		for(int i=0;i<ch1.length;i++)
		{
			m[k]=ch1[i];
			k++;
		}
		for(int i=0;i<ch2.length;i++)
		{
			m[k]=ch2[i];
			k++;
		}
		return m;
	}
	
}
public class Mearge_array_con
{
	public static void main (String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter first array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second array element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		MergeArray m=new MergeArray(a,b);
		int merge[]=m.getIntMergeArray();
		    //merge reference variable
		
		for(int i=0;i<merge.length;i++)
		{
			System.out.print("\t"+merge[i]);
		}
		
		//------------------------------------------------------------------------------------
		
		int c[]=new int[5];
		int d[]=new int[5];
		System.out.println("Enter first array element");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		System.out.println("Enter second array element");
		for(int i=0;i<d.length;i++)
		{
			d[i]=sc.nextInt();
		}
		MergeArray m3=new MergeArray(c,d);
		int merge3[]=m3.getIntMergeArray();
		    //merge reference variable
		
		for(int i=0;i<merge3.length;i++)
		{
			System.out.print("\t"+merge3[i]);
		}
		
		char ch1[]=new char[5];
		char ch2[]=new char[5];
		System.out.println("Enter first array element");
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=sc.next().charAt(0);
		}
		System.out.println("Enter second array element");
		for(int i=0;i<ch2.length;i++)
		{
			ch2[i]=sc.next().charAt(0);
		}
		MergeArray m1=new MergeArray(ch1,ch2);
		char merge1[]=m1.getCharMergeArray();
		for(int i=0;i<merge1.length;i++)
		{
			System.out.print("\t"+merge1[i]);
		}
	}
}