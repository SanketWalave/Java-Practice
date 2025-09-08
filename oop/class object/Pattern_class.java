/*Q4. WAP to create class name as PrintPattern with two methods 
Void setValue(int row,int col): this function can accept row and column for pattern
Void printPattern(): this function can print the following pattern
*/
import java.util.*;
class PrintPattern
{
	private int r,c;
	void setValue(int row,int col)
	{
		r=row;
		c=col;
	}
	void printPattern()
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i>3=j)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.print("\n");
		}
	}
}
public class Pattern_class
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int ro=sc.nextInt();
		System.out.println("Enter rows");
		int co=sc.nextInt();
		PrintPattern pp=new PrintPattern();
		pp.setValue(ro,co);
		pp.printPattern();
	}
}
