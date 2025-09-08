/*4. Library Management
Create a Library class to store the name and numberOfBooks of a library. 
Add a method to issue a book (reduce the count by 1) and 
another to return a book (increase the count by 1).
Explanation: Focus on managing the count correctly through method calls and 
validate against negative counts.
*/
import java.util.*;
class Library
{
	private String name;
	private int numberOfBooks;
	Library(String name,int numberOfBooks)
	{
		this.name=name;
		this.numberOfBooks=numberOfBooks;
	}
	void  issuebook()
	{
		System.out.println("Name of library           \t"+name);
		System.out.println("number of book after issue\t"+--numberOfBooks);
	}
	void  returnebook()
	{
		//System.out.println("Name of library           \t"+name);
		System.out.println("\n\n\nnumber of book after issue\t"+(++numberOfBooks));
	}
}
public class Library_17_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Library l=new Library("Sanket",100);
		l.issuebook();
		l.returnebook();

	}
}