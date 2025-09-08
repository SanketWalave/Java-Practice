/*
Q3. Write a java program to create class name as Frequency using Constructor overloading name as :

	void Frequency(int [ ])
	{
		//  count even and odd number in array.
	}
	
	
	void Frequency(char [ ])
	{
		//  count alphabet , digit and special symbol charcter in string.
	}
*/

import java.util.*;

	class Frequency
	{
		int b[];
		char c[];
		void Frequency(int a[])
		{	b=a;
			int count1=0;
			int count2=0;
			
			for(int i=0;i<b.length;i++)
			{
				if(b[i]%2==0)
				{
					count1++;
				}
				else
				{
					count2++;
				}
				
			}
			System.out.println("Even numbers in array are: "+count1);
			System.out.println("Odd numbers in array are: "+count2);
		}
		void Frequency(char ch[])
		{	
			c=ch;
			int digit=0;
			int alpha=0;
			int special=0;
			
			for(int i=0;i<c.length;i++)
			{
				
				if(c[i]>=48 && c[i]<=58)
				{
					digit++;
				}
				else if(c[i]<=65 && c[i]<=90 || c[i]<=97 && c[i]<=122)
				{
					alpha++;
				}
				else
				{
					special++;
				}
			}
			System.out.println("Digits numbers in array are: "+digit);
			System.out.println("Alphabate numbers in array are: "+alpha);
			System.out.println("Special Symbol in array are: "+special);
		}
		
	}
	public class Ass03
	{
		public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array:-");
			int size=sc.nextInt();
			
			int a[]=new int[size];
			System.out.println("Enter values in array");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
			
			char ch[]=new char[size];
			System.out.println("Enter values in array");
			for(int i=0;i<ch.length;i++)
			{
				ch[i]=sc.next().charAt(0);
			}
			Frequency f1=new Frequency();
			f1.Frequency(a);
			f1.Frequency(ch);
		}
	}