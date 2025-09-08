/*5. Book Abstract Class
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
	protected String name;
	protected String author;
	Book(String name,String author)
	{
		this.name=name;
		this.author=author;
	}
	abstract void displayDetails();
}
class FictionBook extends Book
{
	protected String genre;
	FictionBook(String name,String author,String genre)
	{
		super.Book(String name,String author);
		
	}
	displayDetails()
	{
		System.out.println("name of book=\t"+name);
		System.out.println("name author =\t"+author);
		System.out.println("genre of book =\t"+genre);
		
	}
}
class NonFictionBook extends Book
{
	
}
public class Book_6_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
	}
}