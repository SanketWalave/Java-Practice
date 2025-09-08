/*4. Convert Character Array to Uppercase
- Write a class to implement a method to convert all characters in a character array to uppercase.
 Explanation: Use ASCII values or built-in functions to modify array elements.
*/
import java.util.*;
class Convert
{
	private char ch[];
	void setArray(char ch[])
	{
		this.ch=ch;
	}
	void convertUpper()
	{
		System.out.println("\nDisplaying element ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print("\t"+ch[i]);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>= 'a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println("\nDisplaying element after conversion");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print("\t"+ch[i]);
		}
	}
}
public class Convert_Upper_14_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter element in array");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		Convert c=new Convert();
		c.setArray(ch);
		c.convertUpper();
		
	}
}