/*. Write a java program to remove duplicate alphabet in charchater array using function.*/
import java.util.*;
public class Duplicate
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		
		char a[]=new char[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		for(int i = 0 ; i < a.length; i++)
		{
			System.out.printf("%c\t",a[i]);
		}
		
		for(int i = 0;i < a.length; i++)
		{
			int count = 0;
			int flag = 0;
			for(int j = i ; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
				if(count > 1)
				{
					flag = 1;
				}
			}
			if(flag == 1)
			{
				System.out.print(a[i]);
			}
		}
		
	}
}