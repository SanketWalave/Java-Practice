/*Q1. WAP to create Library Management application by using Array of object concept 
You have to create POJO class name as Book with field id,name ,price and author 
and we have to create one more class name as Library with following methods 

void addNewBooks(Book ...b): this function can accept infinite book as parameter 
Note: create array of object of book class with size 10 and pass parameter to function 
important point: duplicate book entry not allowed 
void showBooks(): this function can show the book details

Book getBookByName(int id): this function can accept id as parameter and search book by id and return 
book details 

Book [] getBookSortedByPrice(): this function can sort the book by using price and return book array

Book deleteBookById(int id): this function can delete the book by using its and shift its index 
at left hand side and return book detail which we delete from array 

Book[] findBooksByPrice(): you have find the books whose price is same and store all books 
details in new book array and return book array whose price is same
*/
import java.util.*;
class Book
{
	private int bid;
	private int bprice;
	private String bname;
	private String bauther;
	Book(int bid,String bname,int bprice,String bauther)
	{
		this.bname=bname;
		this.bid=bid;
		this.bprice=bprice;
		this.bauther=bauther;
	}
	int getBid()
	{
		return bid;
	}
	int getBprice()
	{
		return bprice;
	}
	String getBname()
	{
		return bname;
	}
	String getBauther()
	{
		return bauther;
	}
}
class Library 
{
	private Book b[];
	void setBook(Book b[])
	{
		this.b=b;
	}
	void showBooks()
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.println("book id     \t"+b[i].getBname());
			System.out.println("book name   \t"+b[i].getBname());
			System.out.println("book price  \t"+b[i].getBprice());
			System.out.println("book author \t"+b[i].getBauther());
		}
	}
}
public class Book_2_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		Book b[]=new Book[size];
		
		int bid,bprice;
		
		String bname,bauther;
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter id of book");
			bid=sc.nextInt();
			System.out.println("Enter book name");
			bname=sc.next();
			System.out.println("Enter Book price");
			bprice=sc.nextInt();
			System.out.println("Enter book auther");
			bauther=sc.next();
			
			b[i]=new Book(bid,bname,bprice,bauther);
		}
		
		Library l=new Library();
		l.setBook(b);
		l.showBooks();
	}
}