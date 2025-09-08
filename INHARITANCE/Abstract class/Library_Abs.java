/*Q2. WAP to create the Library Management Application using abstraction 
You have to create following classes 
Library : this is the abstract class and it contain following methods 
Void setBooks(Book ..b): this function can accept the n book objects and
 Book is POJO class and it contain the following field id,name,pub and price 
Int getDepositedAmount(): this is the abstract method and return the sum of deposited amount on all books

Student: this class can inherit the Library class and and override abstract method and 
return bill to student as deposit amount and every book has 200 rs as deposited amount 
Example:if student issue 3 books from library he need to pay 600 as deposit amount 
Employee: this class can inherit the Library class and override the abstract method and 
return bill to employee as deposit amount and every book has 300 rs as deposited amount 
 Example:if student issue 3 books from library he need to pay 900 as deposit amount 
 Note: Use Dynamic Polymorphism concept here case 1: student and case 2 : employee
*/
import java.util.*;
class Book
{
	protected int bId;
	protected String bName;
	protected String publisher;
	protected int price;
	Book(int bId,String bName,String publisher,int price)
	{
		this.bId=bId;
		this.bName=bName;
		this.publisher=publisher;
		this.price=price;
	}
	int getBid()
	{
		return bId;
	}
	String getBname()
	{
		return bName;
	}
	String getPublisher()
	{
		return publisher;
	}
	int getPrice()
	{
		return price;
	}
}
abstract class Library
{
	Book b[];
	void setBooks(Book ...b)
	{
		this.b=b;
	}
	abstract int getDepositedAmount();
}
class Student extends Library
{
	int count=0;
	int getDepositedAmount()
	{
		for(int i=0;i<b.length;i++)
		{
			count++;
		}
		return count*200;
	}
}
class Employee extends Library
{
	int count=0;
	int getDepositedAmount()
	{
		for(int i=0;i<b.length;i++)
		{
			count++;
		}
		return count*300;
	}
}
public class Library_Abs
{
	public static void main(String x[])
	{
		Book book1=new Book(1,"aaaaa","bbbbb",100);
		Book book2=new Book(1,"aaaaa","bbbbb",100);
		Book book3=new Book(1,"aaaaa","bbbbb",100);
		Book book4=new Book(1,"aaaaa","bbbbb",100);
		Book book5=new Book(1,"aaaaa","bbbbb",100);
		Book book6=new Book(1,"aaaaa","bbbbb",100);
		
		Student s=new Student();
		s.setBooks(book1,book2,book3,book4);
		System.out.println("Diposit amount for Student = "+s.getDepositedAmount());
		
		Employee emp=new Employee();
		emp.setBooks(book1,book2,book3,book4,book5);
		System.out.println("Diposit amount for Employee = "+emp.getDepositedAmount());
	}
}