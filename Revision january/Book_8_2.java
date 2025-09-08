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
	protected String gener;
	FictionBook(String name,String auther,String gener)
	{
		super(name,auther);
		this.gener=gener;
	}
	void displayDetails()
	{
		System.out.println("Book name    \t"+name);
		System.out.println("Book auther  \t"+author);
		System.out.println("Book gener   \t"+gener);
	}
}
class NonFictionBook extends Book
{
	protected String subject;
	NonFictionBook(String name,String auther,String subject)
	{
		super(name,auther);
		this.subject=subject;
	}
	void displayDetails()
	{
		System.out.println("Book name    \t"+name);
		System.out.println("Book auther  \t"+author);
		System.out.println("Book subject \t"+subject);
	}
}
public class Book_8_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		FictionBook fb=new FictionBook("ffff","ffff","ffff");
		fb.displayDetails();
		
		NonFictionBook nfb=new NonFictionBook("nnnnnn","nnnnn","nnnnnn");
		nfb.displayDetails();
		
	}
}