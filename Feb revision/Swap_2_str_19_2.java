/*Q2. Java String Program to Swapping Pair of Characters
Input: str = “GIRITECHHUB”
Output: IGIRETHCUHB
Your Task:
You have to create class name as SwapPair with two methods 
void setString(String data): this function can accept string type of data
String getRevPairData(): this function can get the reverse pair data.
*/
import java.util.*;
public class Swap_2_str_19_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char c[]=new char[s.length()];
		
		for(int i=0;i<c.length;i++)
		{
			char ch=s.charAt(i);
			c[i]=ch;
		}
		
		
		for(int i=0;i<c.length;i+=2)
		{
			for(int j=i;j<c.length-1;j++)
			{
				char temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
				break;
			}
		}
		s="";
		for(int i=0;i<c.length;i++)
			s+=c[i];
		
		
		System.out.println(s);
	}
}