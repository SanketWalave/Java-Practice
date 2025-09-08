/*Question 1: Creating and Displaying POJO

Create a POJO class named Book with the following fields:

    int bookId
    String title
    String author

Write a program to:

    Create an instance of the Book class.
    Set values to its fields using setter methods.
    Display the details using getter methods.
*/

class Book
{
	private int bookId;
	private String title,author;
	public void setBookid(int b)
	{
		bookId=b;
	}
	public  int getId()
	{
		return bookId;
	}
	public void setTitle(String tit)
	{
		title=tit;
	}
	public  String getTitle()
	{
		return title;
	}
	public void setAuther(String ath)
	{
		author=ath;
	}
	public  String getAuther()
	{
		return author;
	}
}
public class Book_POJO
{
	public static void main(String x[])
	{
		
		Book bk=new Book();
		bk.setBookid(12);
	//	int res1=bk.getId();
		bk.setTitle("Santosh");
		//String res2=bk.getTitle();
		bk.setAuther("santosh");
		//String res3=bk.getAuther();
		//System.out.println(res1+"\t"+res2+"\t"+res3);
		System.out.println(bk.getId()+"\t"+bk.getAuther()+"\t"+bk.getAuther());
		
	}
}