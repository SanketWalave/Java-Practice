/*3. Book Abstract Class
Problem: Create an abstract class Book with the following fields:
title (String)
author (String)
Add an abstract method displayDetails() that shows the book's title and author.
Then, create two subclasses:
FictionBook — displays additional details like genre.
NonFictionBook — displays additional details like the subject.
Write a program that creates instances of both subclasses and displays their details.
Explanation:
The abstract class Book provides common properties like title and author.
Each subclass extends the functionality by adding more details specific to the type of book.
Logical operation: Use inheritance to extend functionality and overriding to display specific details for each book type.
*/
import java.util.*;
abstract class Book
{
	protected String title;
	protected String auther;
	void setTitle(String title)
	{
		this.title=title;
	}
	void setAuther(String auther)
	{
		this.auther=auther;
	}
	abstract void displayDatails();

}
class FictionBook extends Book 
{
	protected String gener;
	void setGener(String gener)
	{
		this.gener=gener;
	}
	void displayDatails()
	{
		System.out.println("Book title    \t"+title);
		System.out.println("Book auther   \t"+auther);
		System.out.println("Book gener    \t"+gener);
	}
}


public class Book_6_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);

		FictionBook f=new FictionBook();
		f.setTitle("ddddd");
		f.setAuther("sssss");
		f.setGener("aaaaa");
		f.displayDatails();
	}
}