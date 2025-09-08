/*Example3: WAP to create class name as Table with two functions 
void setNum(): this function can accept number as parameter
void showTable(): this function can display the table of number
*/
import java.util.*;
class Table
{
	private int num,table;
	private Scanner sc=new Scanner(System.in);
	void setNum()
	{
		System.out.println("Enter number");
		num=sc.nextInt();
	}
	void showTable()
	{
		System.out.println("tabel of number");
		for(int i=1;i<=10;i++)
		{
			int table=1;
			table=num*i;
			System.out.print("\t"+table);
		}
	}
}
public class Tabel_class
{
	public static void main(String x[])
	{
		Table tb=new Table();
		tb.setNum();
		tb.showTable();
	}
}